package wegit.resources.controller;

/**
 * @Author: Hao
 * @Date: 2019/11/4 21:19
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wegit.resources.model.Host;
import wegit.resources.service.HostImpl;

import java.util.List;

@Controller
@RequestMapping("/server")
public class hostController {
    @Autowired
    HostImpl hostImpl;

    @GetMapping("/")
    public List<Host> getHostList() {
        List<Host> hostList = hostImpl.getHostList();
        return hostList;
    }

    @PostMapping("")
    public void update(Host host) {
        hostImpl.updateHost(host);
    }

    public void add(Host host) {
        hostImpl.addHost(host);
    }

    public void deleteById(String id) {
        hostImpl.delHost(id);
    }

}

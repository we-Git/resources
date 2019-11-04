package wegit.resources.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wegit.resources.mapper.HostMapper;
import wegit.resources.model.Host;

import java.util.List;

@Service
public class HostImpl implements hostInter {

    @Autowired
    private HostMapper hostMapper;

    @Override
    public Host getHostById(String id) {
        Host host = hostMapper.selectByPrimaryKey(Integer.parseInt(id));
        return host;
    }

    @Override
    public int addHost(Host host) {
        try {
            hostMapper.insert(host);
            return 0;
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
    }

    @Override
    public void delHost(String id) {
        hostMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public void updateHost(Host host) {
        hostMapper.updateByPrimaryKey(host);
    }


    @Override
    public List<Host> getHostList() {
        List<Host> hostList = hostMapper.selectAll();
        return hostList;
    }
}

package wegit.resources.service;

import wegit.resources.model.Host;

import java.util.List;

public interface hostInter {
    public Host getHostById(String id);

    public  List<Host> getHostList();

    public void delHost(String id);

    public void updateHost(Host host);

    public int addHost(Host host);
}

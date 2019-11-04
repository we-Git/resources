package wegit.resources.service;

import wegit.resources.model.Vm;

import java.util.List;

public interface vmInter {
    public Vm getHostById(String id);

    public List<Vm> getHostList();

    public void delHost(String id);

    public void updateHost(Vm vm);

    public void addHost(Vm vm);
}

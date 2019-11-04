package wegit.resources.service;

import org.springframework.beans.factory.annotation.Autowired;
import wegit.resources.mapper.VmMapper;
import wegit.resources.model.Vm;

import java.util.List;

public class vmImpl implements vmInter {
    @Autowired
    private VmMapper vmMapper;

    @Override
    public void delHost(String id) {
        vmMapper.deleteByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public List<Vm> getHostList() {
        List<Vm> vmList = vmMapper.selectAll();
        return vmList;
    }

    @Override
    public Vm getHostById(String id) {
        Vm vm = vmMapper.selectByPrimaryKey(Integer.parseInt(id));
        return vm;
    }

    @Override
    public void addHost(Vm vm) {
        vmMapper.insert(vm);
    }

    @Override
    public void updateHost(Vm vm) {
        vmMapper.updateByPrimaryKey(vm);
    }
}

package wegit.resources.mapper;

import wegit.resources.model.Host;

import java.util.List;

public interface HostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Host record);

    int insertSelective(Host record);

    Host selectByPrimaryKey(Integer id);

    List<Host> selectAll();

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}
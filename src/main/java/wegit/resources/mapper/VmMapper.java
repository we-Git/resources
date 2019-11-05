package wegit.resources.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import wegit.resources.model.Vm;

import java.util.List;
@Mapper
public interface VmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vm record);

    int insertSelective(Vm record);

    Vm selectByPrimaryKey(Integer id);

    List<Vm> selectAll();

    int updateByPrimaryKeySelective(Vm record);

    int updateByPrimaryKey(Vm record);
}
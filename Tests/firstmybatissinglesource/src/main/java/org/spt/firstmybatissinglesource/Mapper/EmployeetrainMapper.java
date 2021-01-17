package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Employeetrain;

public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    List<Employeetrain> selectAll();

    int updateByPrimaryKey(Employeetrain record);
}
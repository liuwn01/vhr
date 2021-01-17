package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Employeeec;

public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    List<Employeeec> selectAll();

    int updateByPrimaryKey(Employeeec record);
}
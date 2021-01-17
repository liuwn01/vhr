package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Employeeremove;

public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    List<Employeeremove> selectAll();

    int updateByPrimaryKey(Employeeremove record);
}
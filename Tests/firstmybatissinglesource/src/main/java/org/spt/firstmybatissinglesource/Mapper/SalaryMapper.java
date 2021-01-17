package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Salary;

public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    Salary selectByPrimaryKey(Integer id);

    List<Salary> selectAll();

    int updateByPrimaryKey(Salary record);
}
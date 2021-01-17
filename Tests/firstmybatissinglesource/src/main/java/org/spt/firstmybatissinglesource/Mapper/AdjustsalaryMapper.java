package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Adjustsalary;

public interface AdjustsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjustsalary record);

    Adjustsalary selectByPrimaryKey(Integer id);

    List<Adjustsalary> selectAll();

    int updateByPrimaryKey(Adjustsalary record);
}
package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Empsalary;

public interface EmpsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Empsalary record);

    Empsalary selectByPrimaryKey(Integer id);

    List<Empsalary> selectAll();

    int updateByPrimaryKey(Empsalary record);
}
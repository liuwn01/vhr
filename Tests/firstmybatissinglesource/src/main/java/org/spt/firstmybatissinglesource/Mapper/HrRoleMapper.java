package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.HrRole;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    List<HrRole> selectAll();

    int updateByPrimaryKey(HrRole record);
}
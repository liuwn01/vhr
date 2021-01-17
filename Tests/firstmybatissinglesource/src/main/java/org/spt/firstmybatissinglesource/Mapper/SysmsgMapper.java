package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Sysmsg;

public interface SysmsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmsg record);

    Sysmsg selectByPrimaryKey(Integer id);

    List<Sysmsg> selectAll();

    int updateByPrimaryKey(Sysmsg record);
}
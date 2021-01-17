package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Hr;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    Hr selectByPrimaryKey(Integer id);

    List<Hr> selectAll();

    int updateByPrimaryKey(Hr record);
}
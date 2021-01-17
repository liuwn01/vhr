package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Nation;

public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    Nation selectByPrimaryKey(Integer id);

    List<Nation> selectAll();

    int updateByPrimaryKey(Nation record);
}
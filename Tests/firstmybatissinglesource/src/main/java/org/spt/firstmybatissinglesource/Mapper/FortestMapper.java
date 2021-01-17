package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;

import org.spt.firstmybatissinglesource.Entity.Fortest;

public interface FortestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fortest record);

    Fortest selectByPrimaryKey(Integer id);

    List<Fortest> selectAll();

    int updateByPrimaryKey(Fortest record);
}
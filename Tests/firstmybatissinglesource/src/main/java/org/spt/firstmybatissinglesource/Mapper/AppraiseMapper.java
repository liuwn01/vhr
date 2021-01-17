package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Appraise;

public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    List<Appraise> selectAll();

    int updateByPrimaryKey(Appraise record);
}
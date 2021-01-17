package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Politicsstatus;

public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    List<Politicsstatus> selectAll();

    int updateByPrimaryKey(Politicsstatus record);
}
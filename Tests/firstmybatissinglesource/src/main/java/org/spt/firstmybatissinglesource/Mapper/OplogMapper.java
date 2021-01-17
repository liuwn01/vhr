package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Oplog;

public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    List<Oplog> selectAll();

    int updateByPrimaryKey(Oplog record);
}
package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Msgcontent;

public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    List<Msgcontent> selectAll();

    int updateByPrimaryKey(Msgcontent record);
}
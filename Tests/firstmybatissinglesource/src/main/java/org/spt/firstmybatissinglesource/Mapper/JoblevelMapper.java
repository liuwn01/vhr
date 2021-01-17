package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Joblevel;

public interface JoblevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    List<Joblevel> selectAll();

    int updateByPrimaryKey(Joblevel record);
}
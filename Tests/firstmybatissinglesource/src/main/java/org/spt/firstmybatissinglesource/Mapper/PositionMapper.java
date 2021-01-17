package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    Position selectByPrimaryKey(Integer id);

    List<Position> selectAll();

    int updateByPrimaryKey(Position record);
}
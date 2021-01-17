package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.FlywaySchemaHistory;

public interface FlywaySchemaHistoryMapper {
    int deleteByPrimaryKey(Integer installed_rank);

    int insert(FlywaySchemaHistory record);

    FlywaySchemaHistory selectByPrimaryKey(Integer installed_rank);

    List<FlywaySchemaHistory> selectAll();

    int updateByPrimaryKey(FlywaySchemaHistory record);
}
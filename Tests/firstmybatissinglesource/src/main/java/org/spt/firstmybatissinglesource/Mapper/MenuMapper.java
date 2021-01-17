package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    Menu selectByPrimaryKey(Integer id);

    List<Menu> selectAll();

    int updateByPrimaryKey(Menu record);
}
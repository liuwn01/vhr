package org.spt.firstmybatissinglesource.Mapper;

import java.util.List;
import org.spt.firstmybatissinglesource.Entity.MenuRole;

public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    List<MenuRole> selectAll();

    int updateByPrimaryKey(MenuRole record);
}
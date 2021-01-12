package org.spt.vhr.service;


import org.spt.vhr.mapper.Rolemapper;
import org.spt.vhr.model.Role;

import java.util.List;

public class RoleService implements Rolemapper {
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(Role record) {
        return 0;
    }

    public int insertSelective(Role record) {
        return 0;
    }

    public Role selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(Role record) {
        return 0;
    }

    public int updateByPrimaryKey(Role record) {
        return 0;
    }

    public List<Role> getAllRoles() {
        return null;
    }
}

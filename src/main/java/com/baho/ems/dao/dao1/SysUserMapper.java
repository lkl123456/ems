package com.baho.ems.dao.dao1;

import com.baho.ems.dao.entity.db1.SysUser;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long user_id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Long user_id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}
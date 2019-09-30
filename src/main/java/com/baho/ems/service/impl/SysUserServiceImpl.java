package com.baho.ems.service.impl;

import com.baho.ems.dao.dao1.SysUserMapper;
import com.baho.ems.dao.entity.db1.SysUser;
import com.baho.ems.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getAllUser(){
        List<SysUser> list = sysUserMapper.selectAll();
        return list;
    }
}

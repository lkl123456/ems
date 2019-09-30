package com.baho.ems.controller;

import com.baho.ems.common.BaseResponse;
import com.baho.ems.dao.entity.db1.SysUser;
import com.baho.ems.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @ApiOperation(value = "查询用户")
    @ResponseBody
    @RequestMapping(value = "/queryUserList")
    public BaseResponse queryUserList(@RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        List<SysUser> list = sysUserService.getAllUser();
        return BaseResponse.success(list);
    }

}

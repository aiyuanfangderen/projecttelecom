package com.demo.mapper;

import java.util.List;

import com.demo.dto.UserModule;
import com.demo.entity.SysUser;
import com.demo.entity.SysUserRole;

public interface SysUserMapper 
{
   public void insertUser(SysUser sysUser);
   
   
   
   public void insertUserRole(SysUserRole sysUserRole);
   
   
   
   //下面三个方法用于查询模块信息
   
   public List<UserModule> selectModule(int id);
   
   
   public SysUser selectUserByName(String username);
  
   
   public SysUser selectUserByRealName(String realname);
   
   public void updateUserState(SysUser sysUser);
}

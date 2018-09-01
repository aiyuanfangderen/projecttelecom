package com.demo.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.UserModule;
import com.demo.entity.SysUser;
import com.demo.entity.SysUserRole;
import com.demo.mapper.SysUserMapper;

@Service
public class SysUserService 
{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	public void insertUser(SysUser sysUser)
	{
		sysUserMapper.insertUser(sysUser);
	}

	
	
	public void insertUserRole(SysUserRole sysUserRole)
	{
		sysUserMapper.insertUserRole(sysUserRole);
	}
	
	
	public List<UserModule> selectModule(int id)
	{
		
		List<UserModule> userModules= sysUserMapper.selectModule(id);
		System.out.println(userModules);
		
		
	
		return userModules;
	}
	
	public SysUser selectUserByName(String username)
	{
		return sysUserMapper.selectUserByName(username);
	}
	
	
	
	public SysUser selectUserByRealName(String realname)
	{
		return sysUserMapper.selectUserByRealName(realname);
	}
	
	
	 public void updateUserState(SysUser sysUser)
	 {
		  sysUserMapper.updateUserState(sysUser);
	 }
}

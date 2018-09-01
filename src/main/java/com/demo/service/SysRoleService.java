package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.RoleConfigure;
import com.demo.entity.SysRole;
import com.demo.mapper.SysRoleMapper;

@Service
public class SysRoleService 
{
	@Autowired
	private SysRoleMapper sysRoleMapper;
    
	public void insertRole(SysRole sysRole)
	{
		sysRoleMapper.insertRole(sysRole);
		
	}
	
	
	public List<RoleConfigure> selectRoleConfigure1()
	{
		return sysRoleMapper.selectRoleConfigure1();
	}
	
	
	public RoleConfigure selectRoleConfigure2(int id)
	{
		return sysRoleMapper.selectRoleConfigure2(id);
	}
	
	
}

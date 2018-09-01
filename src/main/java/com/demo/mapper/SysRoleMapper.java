package com.demo.mapper;

import java.util.List;

import com.demo.dto.RoleConfigure;
import com.demo.entity.SysRole;

public interface SysRoleMapper
{

	public void insertRole(SysRole sysRole);
	
	public List<RoleConfigure> selectRoleConfigure1();
	
	
	public RoleConfigure selectRoleConfigure2(int id);
}

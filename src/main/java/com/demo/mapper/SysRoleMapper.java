package com.demo.mapper;

import java.util.List;

import com.demo.dto.RoleConfigure;
import com.demo.entity.SysMenuModule;
import com.demo.entity.SysModuleRole;
import com.demo.entity.SysRole;
import com.demo.entity.SysUserRole;

public interface SysRoleMapper
{

	public void insertRole(SysRole sysRole);
	
	public List<RoleConfigure> selectRoleConfigure1();
	
	
	public List<RoleConfigure> selectRoleConfigure2(int id);
	
	
	public void deleteUserRole(SysUserRole sysUserRole);
	
	
	public void deleteRoleModule(SysModuleRole sysModuleRole);
	
	
}

package com.demo.service;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.RoleConfigure;
import com.demo.entity.SysMenuModule;
import com.demo.entity.SysModuleRole;
import com.demo.entity.SysRole;
import com.demo.entity.SysUserRole;
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
	
	
	public List<RoleConfigure> selectRoleConfigure2(int id)
	{
		return sysRoleMapper.selectRoleConfigure2(id);
	}
	
	
	
	public void deleteUserRole(SysUserRole sysUserRole)
	{
		sysRoleMapper.deleteUserRole(sysUserRole);
	}
	
	public void deleteRoleModule(SysModuleRole sysModuleRole)
	{
		sysRoleMapper.deleteRoleModule(sysModuleRole);
	}
	
	
	
	
	
	
	
	
	
}

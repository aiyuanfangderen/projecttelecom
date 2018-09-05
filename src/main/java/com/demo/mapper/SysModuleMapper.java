package com.demo.mapper;

import java.util.List;

import com.demo.entity.SysMenu;
import com.demo.entity.SysMenuModule;
import com.demo.entity.SysModule;
import com.demo.entity.SysModuleRole;

public interface SysModuleMapper
{

	public void insertModule(SysModule sysModule);
	
	
	
	
	public void insertModuleRole(SysModuleRole sysModuleRole);
	
	
	public List<SysMenu> selectMenu(int id);
	
    public List<SysMenu> selectMenu2();
	

	
	
	public List<SysMenu> selectOtherMenu(int id);
	
	
	public void deleteMenu(int id);
	
	
	
	public void deleteModuleMenu(SysMenuModule sysMenuModules);
	
	
	
}

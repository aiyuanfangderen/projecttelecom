package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.SysMenu;
import com.demo.entity.SysModule;
import com.demo.entity.SysModuleRole;
import com.demo.mapper.SysModuleMapper;

@Service
public class SysModuleService 
{
   @Autowired
   private SysModuleMapper sysModuleMapper;
	
	public void insertModule(SysModule sysModule)
	{
		sysModuleMapper.insertModule(sysModule);
	}
	

	public void insertModuleRole(SysModuleRole sysModuleRole)
	{
		sysModuleMapper.insertModuleRole(sysModuleRole);
	}
	
	
	public List<SysMenu> selectMenu(int id)
	{
		return sysModuleMapper.selectMenu(id);
	}
	

	
	
	
	public List<SysMenu> selectOtherMenu(int id)
	{
		return sysModuleMapper.selectOtherMenu(id);
	}
	
	
	public void deleteMenu(int id)
	{
		sysModuleMapper.deleteMenu(id);
	}
	
	
	
}

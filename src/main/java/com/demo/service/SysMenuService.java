package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.SysMenu;
import com.demo.entity.SysMenuModule;
import com.demo.mapper.SysMenuMapper;
@Service
public class SysMenuService 
{
    @Autowired
	private SysMenuMapper sysMenuMapper;
    
	public void insertMenu(SysMenu sysMenu)
	{
		sysMenuMapper.insertMenu(sysMenu);
		
		
	}
	
	
	
	public void insertMenuModule(SysMenuModule sysMenuModule)
	{
		sysMenuMapper.insertMenuModule(sysMenuModule);
	}
	
	
}

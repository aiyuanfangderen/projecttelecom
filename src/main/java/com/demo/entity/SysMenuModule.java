package com.demo.entity;

import java.sql.Timestamp;

public class SysMenuModule 
{
 
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	private int moduleid;//模块id
	private int menuid;//顶级菜单id
	private Timestamp create_time;//开始时间
	private Timestamp update_time;//更新时间
	@Override
	public String toString() {
		return "SysMenuModule [moduleid=" + moduleid + ", menuid=" + menuid + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
	
	
	
}

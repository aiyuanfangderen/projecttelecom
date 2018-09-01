package com.demo.entity;

import java.sql.Timestamp;

public class SysModuleRole
{
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public String getQuery_scope() {
		return query_scope;
	}
	public void setQuery_scope(String query_scope) {
		this.query_scope = query_scope;
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
	private int roleid;//角色id
	private int moduleid;//模块id
	private String query_scope;//查询范围
	private Timestamp create_time;//开始时间
	private Timestamp update_time;//更新时间
	@Override
	public String toString() {
		return "SysModuleRole [roleid=" + roleid + ", moduleid=" + moduleid + ", query_scope=" + query_scope
				+ ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}
	
	
	
	
	
}

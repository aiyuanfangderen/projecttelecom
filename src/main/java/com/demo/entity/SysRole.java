package com.demo.entity;

import java.sql.Timestamp;

public class SysRole
{

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole_code() {
		return role_code;
	}
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	public Boolean getSys_role_flag() {
		return sys_role_flag;
	}
	public void setSys_role_flag(Boolean sys_role_flag) {
		this.sys_role_flag = sys_role_flag;
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
	private int id;//id
	private String role_code;//角色代码
	private String role_name;//角色名称
	private String role_desc;//角色描述
	private Boolean sys_role_flag;//是否为系统内置角色
	private Timestamp create_time;//开始时间
	private Timestamp update_time;//更新时间
	@Override
	public String toString() {
		return "SysRole [id=" + id + ", role_code=" + role_code + ", role_name=" + role_name + ", role_desc="
				+ role_desc + ", sys_role_flag=" + sys_role_flag + ", create_time=" + create_time + ", update_time="
				+ update_time + "]";
	}
	
	
	
	
	
	
	
}

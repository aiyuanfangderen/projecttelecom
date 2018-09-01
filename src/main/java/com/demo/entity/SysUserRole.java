package com.demo.entity;

import java.sql.Timestamp;

public class SysUserRole 
{

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	private int user_id;
	private int role_id;
	private Timestamp create_time;
	private Timestamp update_time;
	@Override
	public String toString() {
		return "SysUserRole [user_id=" + user_id + ", role_id=" + role_id + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
	
	
	
	
	
	
	
	
}

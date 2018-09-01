package com.demo.entity;

import java.sql.Timestamp;

public class SysDepartLeader 
{

	public int getDepart_id() {
		return depart_id;
	}
	public void setDepart_id(int depart_id) {
		this.depart_id = depart_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	//部门id
	private int depart_id;
	//分管领导id
	private int user_id;
	//开始时间
	private Timestamp create_time;
	//更新时间
	private Timestamp update_time;
	@Override
	public String toString() {
		return "SysDepartLeader [depart_id=" + depart_id + ", user_id=" + user_id + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
	
	
	
	
}

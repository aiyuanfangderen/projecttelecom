package com.demo.entity;

import java.sql.Timestamp;

public class SysUser 
{

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public Boolean getCom_leader() {
		return com_leader;
	}
	public void setCom_leader(Boolean com_leader) {
		this.com_leader = com_leader;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	private String username;//用户账号
	private String password;//密码
	private String realname;//用户真是姓名
	private String usercode;//员工工号
	private int level;//系统有5个级别，0职员，1，2，3，4
	private String position;//职位（级别部位0有职位，正职，副职）
	private int department_id;//所属部门
	private Boolean com_leader;//公司领导，1是，默认0
	private String order_number;//排序
	private String email;//邮件
	private int state;//状态是否有效，0有效，1离职
	private Timestamp create_time;//开始时间
	private Timestamp update_time;//更新时间
	@Override
	public String toString() {
		return "SysUser [id=" + id + ", username=" + username + ", password=" + password + ", realname=" + realname
				+ ", usercode=" + usercode + ", level=" + level + ", position=" + position + ", department_id="
				+ department_id + ", com_leader=" + com_leader + ", order_number=" + order_number + ", email=" + email
				+ ", state=" + state + ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}
	
	
	
	
	
	
	
	
}

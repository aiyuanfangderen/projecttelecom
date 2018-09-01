package com.demo.dto;


public class RoleConfigure
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
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}


	private int id;//角色id
    private String role_code;//角色代码
    private String role_name;//角色名称
    private String role_desc;//角色描述
    private Boolean sys_role_flag;//是否为内置角色
    private String user_id;//用户id
    private String username;//用户名称
    private String name;//部门名称
    //所属地区先空着
    private String area;
	@Override
	public String toString() {
		return "RoleConfigure [id=" + id + ", role_code=" + role_code + ", role_name=" + role_name + ", role_desc="
				+ role_desc + ", sys_role_flag=" + sys_role_flag + ", user_id=" + user_id + ", username=" + username
				+ ", name=" + name + ", area=" + area + "]";
	}
	
    
	
}

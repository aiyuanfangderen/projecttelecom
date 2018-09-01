package com.demo.entity;

import java.sql.Timestamp;

public class SysModule 
{

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModule_code() {
		return module_code;
	}
	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getDefault_query_scope() {
		return default_query_scope;
	}
	public void setDefault_query_scope(String default_query_scope) {
		this.default_query_scope = default_query_scope;
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
	private String module_code;//模块代码，如usr_zh
	private String module_name;//模块名称
	private String default_query_scope;//默认查询范围，默认本人相关
	private Boolean default_auth_type;//默认权限类型，0，1
	private Timestamp create_time;//开始时间
	private Timestamp update_time;//更新时间
	public Boolean getDefault_auth_type() {
		return default_auth_type;
	}
	public void setDefault_auth_type(Boolean default_auth_type) {
		this.default_auth_type = default_auth_type;
	}
	@Override
	public String toString() {
		return "SysModule [id=" + id + ", module_code=" + module_code + ", module_name=" + module_name
				+ ", default_query_scope=" + default_query_scope + ", default_auth_type=" + default_auth_type
				+ ", create_time=" + create_time + ", update_time=" + update_time + "]";
	}
	
	
	
	
	
	
	
	
}

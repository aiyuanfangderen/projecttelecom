package com.demo.entity;

import java.sql.Timestamp;

public class SysDepartment
{
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getEnglish_name() {
		return english_name;
	}
	public void setEnglish_name(String english_name) {
		this.english_name = english_name;
	}
	public String getEnglish_alias() {
		return english_alias;
	}
	public void setEnglish_alias(String english_alias) {
		this.english_alias = english_alias;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
	public String getDeputy() {
		return deputy;
	}
	public void setDeputy(String deputy) {
		this.deputy = deputy;
	}
	public Boolean getDisplay() {
		return display;
	}
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	
	
	
	
	public int getSuperior() {
		return superior;
	}
	public void setSuperior(int superior) {
		this.superior = superior;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getTransceiver() {
		return transceiver;
	}
	public void setTransceiver(String transceiver) {
		this.transceiver = transceiver;
	}
	
	
	
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_number() {
		return department_number;
	}
	public void setDepartment_number(String department_number) {
		this.department_number = department_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getCirculation() {
		return circulation;
	}
	public void setCirculation(Boolean circulation) {
		this.circulation = circulation;
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
	
   public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

private int id;//id
   private int number;//序号
   private String name;//部门名称
   private String alias;//部门别名
   private String english_name;//部门英语名称
   private String english_alias;//部门英语别名
   private String principal;//部门正职
   private String deputy;//部门副职
   private Boolean display;//是否显示
   private int superior;//上级部门
   private String situation;//部门状态
   private String transceiver;//部门收发员
   private String department_id;//部门id
   private String department_number;//部门目录统一编号
   private String description;//部门描述
   private Boolean circulation;//是否正副职同时传阅
   private Timestamp create_time;//开始时间
   private Timestamp update_time;//更新时间
   private String area;
@Override
public String toString() {
	return "SysDepartment [id=" + id + ", number=" + number + ", name=" + name + ", alias=" + alias + ", english_name="
			+ english_name + ", english_alias=" + english_alias + ", principal=" + principal + ", deputy=" + deputy
			+ ", display=" + display + ", superior=" + superior + ", situation=" + situation + ", transceiver="
			+ transceiver + ", department_id=" + department_id + ", department_number=" + department_number
			+ ", description=" + description + ", circulation=" + circulation + ", create_time=" + create_time
			+ ", update_time=" + update_time + ", area=" + area + "]";
}



   
   
	
}

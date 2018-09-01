package com.demo.entity;

import java.sql.Timestamp;

public class SysMenu 
{
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnglish_name() {
		return english_name;
	}
	public void setEnglish_name(String english_name) {
		this.english_name = english_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getOrder_number() {
		return order_number;
	}
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}
	public Boolean getAuthor_flag() {
		return author_flag;
	}
	public void setAuthor_flag(Boolean author_flag) {
		this.author_flag = author_flag;
	}
	public Boolean getDisplay_flag() {
		return display_flag;
	}
	public void setDisplay_flag(Boolean display_flag) {
		this.display_flag = display_flag;
	}
	public int getPrevious_meuid() {
		return previous_meuid;
	}
	public void setPrevious_meuid(int previous_meuid) {
		this.previous_meuid = previous_meuid;
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
    private String name;//中文名称
    private String english_name;//英文名称
    private String url;//链接地址
    private int order_number;//顺序号
    private Boolean author_flag;//是否权限控制，0不控制，1控制
    private Boolean display_flag;//是否显示，0不显示，1显示
    private int previous_meuid;//上级菜单id,顶级为0
    private Timestamp create_time;//开始时间
    private Timestamp update_time;//更新时间
	@Override
	public String toString() {
		return "SysMenu [id=" + id + ", name=" + name + ", english_name=" + english_name + ", url=" + url
				+ ", order_number=" + order_number + ", author_flag=" + author_flag + ", display_flag=" + display_flag
				+ ", previous_meuid=" + previous_meuid + ", create_time=" + create_time + ", update_time=" + update_time
				+ "]";
	}
    
    
    
}

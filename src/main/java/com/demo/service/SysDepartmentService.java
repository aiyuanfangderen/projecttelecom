package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.SysDepartLeader;
import com.demo.entity.SysDepartment;
import com.demo.mapper.SysDepartmentMapper;

@Service
public class SysDepartmentService {

	@Autowired
	private SysDepartmentMapper sysDepartmentMapper;
	
	public void insertDepartment(SysDepartment sysDepartment)
	{
		sysDepartmentMapper.insertDepartment(sysDepartment);
	}
	
	
	public void insertDepartmentLeader(SysDepartLeader sysDepartLeader)
	{
		sysDepartmentMapper.insertDepartmentLeader(sysDepartLeader);
	}
	
	
	public List<SysDepartment> selectDepartmentZero()
	{
		return sysDepartmentMapper.selectDepartmentZero();
	}
	
	
	public List<SysDepartment> seleceLowerDepartment(int id)
	{
		return sysDepartmentMapper.seleceLowerDepartment(id);
	}
	
	
	
	
	public SysDepartment selectDepartmentInformation(String name)
	{
		return sysDepartmentMapper.selectDepartmentInformation(name);
	}
	
	public SysDepartment selectDepartmentInformationById(String id)
	{
		return sysDepartmentMapper.selectDepartmentInformationById(id);
	}
	
	
	 public SysDepartment selectDepartmentInformationByNumber(String number)
	 {
		 return sysDepartmentMapper.selectDepartmentInformationByNumber(number);
	 }
	
	 public SysDepartment deleteDepartment(int id)
	 {
		 return sysDepartmentMapper.deleteDepartment(id);
	 }
	
}

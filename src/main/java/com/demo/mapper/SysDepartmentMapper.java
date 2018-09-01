package com.demo.mapper;

import java.util.List;

import com.demo.entity.SysDepartLeader;
import com.demo.entity.SysDepartment;

public interface SysDepartmentMapper 
{
  public void insertDepartment(SysDepartment sysDepartment);
  
  
  public void insertDepartmentLeader(SysDepartLeader sysDepartLeader);
  
  
  public List<SysDepartment> selectDepartmentZero();
  
  
  public List<SysDepartment> seleceLowerDepartment(int id);
  
  
  public SysDepartment selectDepartmentInformation(String name);
  
  public SysDepartment selectDepartmentInformationById(String id);
  
  public SysDepartment selectDepartmentInformationByNumber(String number);
  
  
  
  public SysDepartment deleteDepartment(int id);
}

package com.demo.controller;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.RoleConfigure;
import com.demo.dto.UserModule;
import com.demo.entity.SysDepartLeader;
import com.demo.entity.SysDepartment;
import com.demo.entity.SysMenu;
import com.demo.entity.SysMenuModule;
import com.demo.entity.SysModule;
import com.demo.entity.SysModuleRole;
import com.demo.entity.SysRole;
import com.demo.entity.SysUser;
import com.demo.entity.SysUserRole;
import com.demo.service.SysDepartmentService;
import com.demo.service.SysMenuService;
import com.demo.service.SysModuleService;
import com.demo.service.SysRoleService;
import com.demo.service.SysUserService;
import com.demo.until.Result;
import com.demo.until.ResultEnum;
import com.demo.until.ResultUtil;

//sys-menu表，下级可以找到上级，上级不能找到下级,解决：下级和上级的id号关联

//sys_module默认权限类型有问题，wps中是字符串，数据库是int型，解决：因为只有两种类型，管理和查询

//sysdepartment表中department_id字段有问题，应该为字符串。解决：改为string型,这个部门department_id字段
//和其他表之间没有关联，和其他表之间的关联是部门表的id字段

//sys_user中department_id为部门id,而在wps中为字符串。疑惑：这个部门id是和部门表的id对应
//还是和字段department_id对应

//sys_user中Order_number改为int是否更好，wps中为01，是不是排序麻烦。解决：就按这种类型来

//菜单模块表更新时间在创建时没有关联开始时间

//部门表里面的上级id为string类型，解决：将string类型改为int类型

//wps中角色配置中所属地区是哪一个字段：
@RestController
public class SysController
{
   @Autowired
	private SysMenuService sysMenuService;
   @Autowired
   private SysModuleService sysModuleService;
   @Autowired
   private SysRoleService sysRoleService;
   @Autowired
   private SysDepartmentService sysDepartmentService;
   @Autowired
   private SysUserService sysUserService;
	
   //添加菜单
   @RequestMapping("/insertMenu")
   public Result insertMenu(SysMenu sysMenu)
   {
	   //SysMenu sysMenu=new SysMenu();
//	   sysMenu.setName("活动项目");
//	   sysMenu.setEnglish_name("huodongxiangmu");
//	   sysMenu.setUrl("gfufuifaidhaidhai");
//	   sysMenu.setOrder_number(0);
//	   sysMenu.setAuthor_flag(false);
//	   sysMenu.setDisplay_flag(true);
//	   sysMenu.setPrevious_meuid(1);
	   
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
	   sysMenu.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	   sysMenuService.insertMenu(sysMenu);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //添加模块
   @RequestMapping("/insertModule")
   public Result insertModule(SysModule sysModule)
   {
//	  SysModule sysModule=new SysModule();
//	  sysModule.setModule_code("use_zh");
//	  sysModule.setModule_name("综合组菜单");
//	  sysModule.setDefault_query_scope("本人相关");
//	  sysModule.setDefault_auth_type(true);
	  
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysModule.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	   sysModuleService.insertModule(sysModule);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //添加角色
   @RequestMapping("/insertRole")
   public Result insertRole(SysRole sysRole)
   {
	 
//	   SysRole sysRole=new SysRole();
//	   sysRole.setRole_code("s0002");
//	   sysRole.setRole_name("事务组");
//	   sysRole.setRole_desc("事务组全体");
//	   sysRole.setSys_role_flag(false);
	   
	   
	  
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysRole.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	   sysRoleService.insertRole(sysRole);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //添加部门
   @RequestMapping("/insertDepartment")
   public Result insertDepartment(SysDepartment sysDepartment)
   {
	 
//	SysDepartment sysDepartment=new SysDepartment();
//	
//	sysDepartment.setNumber(1);
//	sysDepartment.setName("主任部门");
//	sysDepartment.setAlias("HB-HB-001");
//	sysDepartment.setEnglish_name("ZHUREN");
//	sysDepartment.setEnglish_alias("HUBEUZHUREN");
//	sysDepartment.setPrincipal("正主任");
//	sysDepartment.setDeputy("副主任");
//	sysDepartment.setDisplay(false);
//	sysDepartment.setSuperior(1);
//	sysDepartment.setSituation("有效");
//	sysDepartment.setTransceiver("某某某某");
//	sysDepartment.setDepartment_id("HB-HB-4545");
//	sysDepartment.setDepartment_number("4845154");
//	sysDepartment.setDescription("主任部门");
//	sysDepartment.setCirculation(false);
	
	
	
	   
	   
	  
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysDepartment.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	   sysDepartmentService.insertDepartment(sysDepartment);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //插入用户
   @RequestMapping("/insertUser")
   public Result insertUser(SysUser sysUser)
   {
	 
//	SysUser sysUser=new SysUser();
//	sysUser.setUsername("刘备");
//	sysUser.setPassword("123456");
//	sysUser.setRealname("张飞");
//	sysUser.setUsercode("liubei");
//	sysUser.setLevel(0);
//	sysUser.setPosition("无职位");
//	sysUser.setDepartment_id(1);
//	sysUser.setCom_leader(false);
//	sysUser.setOrder_number("01");
//	sysUser.setEmail("48488@qq.com");
//	sysUser.setState(0);
	
	
	
	
	
	   
	   
	  
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysUser.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	  sysUserService.insertUser(sysUser);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //插入部门领导
   @RequestMapping("/insertDepartLeader")
   public Result insertDepartLeader(SysDepartLeader sysDepartLeader)
   {
	 
	
//	SysDepartLeader sysDepartLeader=new SysDepartLeader();
//	sysDepartLeader.setDepart_id(2);
//	sysDepartLeader.setUser_id(1);
	

	   
	   
	  
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysDepartLeader.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	  sysDepartmentService.insertDepartmentLeader(sysDepartLeader);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //插入菜单模块关联表
   
   @RequestMapping("/insertMenuModule")
   public Result insertMenuModule(SysMenuModule sysMenuModule)
   {
	 
	
//	SysMenuModule sysMenuModule=new SysMenuModule();
//	sysMenuModule.setModuleid(1);
//	sysMenuModule.setMenuid(1);
	
	

	     
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysMenuModule.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	  sysMenuService.insertMenuModule(sysMenuModule);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //插入模块角色关联
   @RequestMapping("/insertModuleRole")
   public Result insertModuleRole(SysModuleRole sysModuleRole)
   {
	 
	
//	SysModuleRole sysModuleRole=new SysModuleRole();
//	sysModuleRole.setRoleid(1);
//	sysModuleRole.setModuleid(1);
//	sysModuleRole.setQuery_scope("全省");
	
	
	

	     
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysModuleRole.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	 sysModuleService.insertModuleRole(sysModuleRole);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   
   //插入用户角色关联
   @RequestMapping("/insertUserRole")
   public Result insertUserRole(SysUserRole sysUserRole)
   {
	 
	
//	SysUserRole sysUserRole=new SysUserRole();
//	sysUserRole.setUser_id(1);
//	sysUserRole.setRole_id(1);
	
		Date date=new Date();
		//System.out.println(date.getTime());
		//参数为long型
		Timestamp t = new Timestamp(date.getTime());
		//System.out.println(t);
		sysUserRole.setCreate_time(t);
	  // sysMenu.setUpdate_time(update_time);
	   
	   
	 sysUserService.insertUserRole(sysUserRole);
	   System.out.println("保存成功");
	   
	   
	   return ResultUtil.success();
   }
   
   
   //用户查询自己的模块
   @RequestMapping("/selectModule")
   public Result selectModule(int id)
   {
	 
//	  int id=1;
	 List<UserModule>  userModules=sysUserService.selectModule(id);
     System.out.println(userModules);
	   
	   
	   return ResultUtil.success(userModules);
   }
   
   

  
   
   
   
   
   
   
   
   //用户再模块中通过模块id查找菜单
   @RequestMapping("/selectMenu2")
   public Result selectMenu2(int id1)
   {
	   
//    int id=1;
	 //顶级菜单
	 List<SysMenu> sysMenus2=sysModuleService.selectMenu(id1);
	 //list集合
	 List<SysMenu> sysOtherMenus=new ArrayList<SysMenu>();
	
	 for(SysMenu sysMenu:sysMenus2)
	 {
		 //得到顶级菜单id
		 int id=sysMenu.getId();
		 sysOtherMenus=fun2(id,sysOtherMenus);
	 }
	 sysOtherMenus.addAll(sysMenus2);
	 System.out.println(sysOtherMenus);
	 
	 //  System.out.println(sysMenus);
	   return ResultUtil.success(sysOtherMenus);
   }
   
   
   
   
   //递归函数
   public List<SysMenu> fun2(int id,List<SysMenu> sysOtherMenus)
   {
	  List<SysMenu> sysMenus=sysModuleService.selectOtherMenu(id);
	  sysOtherMenus.addAll(sysMenus);
	  if(sysMenus!=null)
	   {
		   for(SysMenu sysMenu:sysMenus)
		   {
			  int id1=sysMenu.getId();
			  fun2(id1, sysOtherMenus);
			  
			    
		   }
		   
		   
		   
	   }
	  
	 return sysOtherMenus;   
	  
   }
   
   
   
   //删除菜单
   @RequestMapping("/deleteMenu2")
   public Result deleteMenu2(int id)
   {
	   
	   
//	   int id=7;
	   List<SysMenu> sysMenus=sysModuleService.selectOtherMenu(id);
	   if(sysMenus.isEmpty())
	   {
		   sysModuleService.deleteMenu(id);
		   System.out.println("删除成功");
		   
	   }
	   
	   else
	   {
		 System.out.println("存在子菜单，删除失败");
		 return ResultUtil.error(-2, "存在子菜单，删除失败");
	   }
	   

	   return ResultUtil.success();
   }
   
   
   
   //角色信息查询,首先查找所有的角色id,和角色名称
   @RequestMapping("/selectRoleConfigure1")
   public Result selectRoleConfigure1()
   {
	 
	List<RoleConfigure> roleConfigures=sysRoleService.selectRoleConfigure1();
	 System.out.println(roleConfigures);
	   
	   return ResultUtil.success(roleConfigures);
   }
   
   
   //角色信息查询，通过id查找角色的详细信息
   @RequestMapping("/selectRoleConfigure2")
   public Result selectRoleConfigure2(int id)
   {
//	 int id=1;
	RoleConfigure roleConfigure=sysRoleService.selectRoleConfigure2(id);
	 System.out.println(roleConfigure);
	   
	   return ResultUtil.success(roleConfigure);
   }
   
   
   //部门查询
   
   //查询顶级部门
   @RequestMapping("/selectDepartmentZero")
   public Result selectDepartmentZero()
   {
	 List<SysDepartment> departments=sysDepartmentService.selectDepartmentZero();
	   System.out.println(departments);
	   return ResultUtil.success(departments);
   }
   
   
   
   //查询所有部门的id
   @RequestMapping("/selectDepartmentAllId")
   public Result selectDepartmentAllId()
   {
	   //查询所有顶级部门
	 List<SysDepartment> departments=sysDepartmentService.selectDepartmentZero();
	//list集合
	 List<SysDepartment> sysDepartments=new ArrayList<SysDepartment>();
	
	 for(SysDepartment department:departments)
	 {
		 //得到顶级菜单id
		 int id=department.getId();
		 sysDepartments=fun4(id,sysDepartments);
	 }
	 
	 
	 
	 sysDepartments.addAll(departments);
	 System.out.println(sysDepartments);
	 
	   return ResultUtil.success(sysDepartments);
   }
   
   
   //递归函数
   public List<SysDepartment> fun4(int id,List<SysDepartment> sysDepartments)
   {
	  List<SysDepartment> sysDepartments2=sysDepartmentService.seleceLowerDepartment(id);
	  sysDepartments.addAll(sysDepartments2);
	  if(sysDepartments2!=null)
	   {
		   for(SysDepartment sysDepartment2:sysDepartments2)
		   {
			  int id1=sysDepartment2.getId();
			  fun4(id1, sysDepartments);
			  
			    
		   }
		   
		   
		   
	   }
	  
	 return sysDepartments;   
	  
   }
   
   
   
   
   
   
   
   
   //查询部门所有的信息，通过部门的名称查询
   @RequestMapping("/selectDepartmentInformation")
   public Result selectDepartmentInformation(String name)
   {
//	String name="主任部门";
	  SysDepartment sysDepartment=sysDepartmentService.selectDepartmentInformation(name);
	   System.out.println(sysDepartment);
	   
	   
	   return ResultUtil.success(sysDepartment);
   }
   
   
   
   //通过部门id查找部门信息
   @RequestMapping("/selectDepartmentInformationById")
   public Result selectDepartmentInformationById(String departmentid)
   {
//	String departmentid="HB-HB-4545";
	SysDepartment sysDepartment=sysDepartmentService.selectDepartmentInformationById(departmentid);
	   System.out.println(sysDepartment);
	   
	   return ResultUtil.success(sysDepartment);
   }
   
   
   
   //通过部门编号查找部门信息
   @RequestMapping("/selectDepartmentInformationByNumber")
   public Result selectDepartmentInformationByNumber(String department_id)
   {
//	String department_id="4845154";
	SysDepartment sysDepartment=sysDepartmentService.selectDepartmentInformationByNumber(department_id);
	System.out.println(sysDepartment);
	   
	   return ResultUtil.success(sysDepartment);
   }
   
   //删除部门
   @RequestMapping("/deleteDepart")
   public Result deleteDepart(int id)
   {
//	   int id=2;
	  List<SysDepartment> sysDepartments=sysDepartmentService.seleceLowerDepartment(id);
	   if(sysDepartments.isEmpty())
	   {
		 sysDepartmentService.deleteDepartment(id);
		   System.out.println("删除成功");
		   
	   }
	   
	   else
	   {
		 System.out.println("存在子菜单，删除失败");
		 return ResultUtil.error(-2, "存在子菜单，删除失败");
	   }
	   

	   return ResultUtil.success();
	
	   
	  
   }
   
   //人员账号查找
   @RequestMapping("/selectUserByName")
   public Result selectUserByName(String username)
   {
//	String username="刘备";
	SysUser sysUser=sysUserService.selectUserByName(username);
	System.out.println(sysUser);
	   
	   return ResultUtil.success(sysUser);
   }
   
   
   
   
   //人员名称查找
   @RequestMapping("/selectUserByRealName")
   public Result selectUserByRealName(String realname)
   {
	   
//	   String realname="张飞";
	SysUser sysUser=sysUserService.selectUserByRealName(realname);
	System.out.println(sysUser);
	   
	 //  return "成功";
	   return ResultUtil.success(sysUser);
   }
   
   
   //删除人员
   @RequestMapping("/deleteUser")
   public Result deleteUser(SysUser sysUser)//只需要传过来id和状态就行
   {
	   //删除人员只是将人员的状态变为否
//	 SysUser sysUser=new SysUser();
//	 sysUser.setId(1);
//	 sysUser.setState(1);
	 
	 sysUserService.updateUserState(sysUser);
	   
	   return ResultUtil.success();
   }
   
   
   
   
   
   //角色信息配置,这个地方通过角色和用户相关联起来
   
   
   
   
   
   
   
   //模块信息配置，这里将模块和角色关联起来
   
	
}

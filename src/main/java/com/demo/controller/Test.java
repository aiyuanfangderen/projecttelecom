//package com.demo.controller;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.apache.tomcat.util.http.fileupload.ParameterParser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.entity.User;
//import com.demo.exception.MyException;
//import com.demo.service.UserService;
//import com.demo.until.Result;
//import com.demo.until.ResultEnum;
//import com.demo.until.ResultUtil;
//
//@RestController
//public class Test
//{
//	@Autowired
//	private UserService userService;
//	
//	//测试没数据库能否运行
//	 @RequestMapping("/test")
//     public String test()
//     {
//		 System.out.println("hello");
//    	return "hello";
//     }
//	 
//	 
//	 //测试数据库
//	 @RequestMapping("/findUser")
//	 public void findUser()
//	 {
//		 int id=1;
//		 
//		 User user=userService.findUser(id);
//		 System.out.println(user.getId());
//		 System.out.println(user.getUsername());
//		 System.out.println(user.getPassword());
//		 
//		 
//		 
//	 }
//	   //测试认证授权
//	 
//		@GetMapping("/login")
//		public String login()
//		{
//			System.out.println("需要登陆");
//			return "need login";
//		}
//	 
//		//登陆
//		@GetMapping("/doLogin")
//		public void doLogin(String uid,String pwd)
//		{
//			Subject subject=SecurityUtils.getSubject();
//			UsernamePasswordToken token=new UsernamePasswordToken(uid, pwd);
//			try {
//				subject.login(token);
//			} catch (Exception e) {
//				System.out.println("登陆失败");
//			}
//			System.out.println("登陆成功");
//			
//		}
//		
//		//全局异常的检测
//		  @GetMapping("/aa")
//		    public Result aa(String age) throws Exception {
//
//			  int age1=Integer.parseInt(age);
//		        if(age1<18) {
//		            throw new MyException(ResultEnum.ERROR_1.getCode(),ResultEnum.ERROR_1.getMsg());
//		        }else if(age1< 20) {
//		            throw new MyException(ResultEnum.ERROR_2.getCode(),ResultEnum.ERROR_2.getMsg());
//		        }
//		        return ResultUtil.success("aaa");
//		    }
//		
//		//测试poi是否有效
//		  @RequestMapping("/poi")
//		  public String poi() throws IOException
//		  {
//			  
//			   Workbook wb=new HSSFWorkbook();
//				
////			    File file=new File("d:\\用poi搞出来的工作.xls");
////			    file.createNewFile();
////				FileOutputStream fileOutputStream=new FileOutputStream(file);
//				
//			   
//			   FileOutputStream fileOutputStream=new FileOutputStream("d:\\来的工作.word");
//				  wb.write(fileOutputStream);
//				  fileOutputStream.close();
//			  
//			      return "测试成功";
//		  }
//		
//		
//		
//	 
//}

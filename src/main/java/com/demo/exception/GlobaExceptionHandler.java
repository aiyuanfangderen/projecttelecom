package com.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.until.Result;

import com.demo.until.ResultEnum;
import com.demo.until.ResultUtil;

/**
 * 全局异常处理
 * @author 陈回
 *
 */
@ControllerAdvice
public class GlobaExceptionHandler
{
	private static final Logger logger = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {

        if(e instanceof MyException) {
            MyException myException = (MyException)e;
            return ResultUtil.error(myException.getCode(),myException.getMessage());
        }else{
            logger.error("系统异常",e);

            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(),ResultEnum.UNKNOWN_ERROR.getMsg());

        }

    }
}

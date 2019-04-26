package com.kyle.aopdemo.aop;

import android.app.Application;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 功能描述: 检查登录权限的
 * 作者:wangkun
 * 创建时间:2019/4/26 10:29
 **/
@Aspect
public class CheckLoginAspect {

    // 只能监听自己的编写类，不能去hook系统级别的api，比如 Application, ThreadHandler等
    // 规则:[@][修饰符] (返回值) (全路径名) (方法参数)  []可以省略, ()比填写
    // 创建一个切点，我们关注的是实现CheckLogin注解的方法
    @Pointcut("execution(@com.kyle.aopdemo.annotation.CheckLogin * *(..))")
//    @Pointcut("execution(* com.kyle.aopdemo.MainActivity.onTVClick(..))")
//    @Pointcut("execution(* com..onCreate(..))")
//    @Pointcut("execution(* android.app..*(..))")
    public void checkLogin() {}

    @Before("checkLogin()")
    public void onBefore(JoinPoint point){
        System.out.println("验证登录前" + point.getTarget().getClass().getCanonicalName());
    }

    @After("checkLogin()")
    public void onAfter(JoinPoint point){
        System.out.println("验证登录后" + point.getSignature().getName());
    }


}

package com.kyle.aopdemo.aop

import android.view.View
import com.kyle.aopdemo.annotation.Intercept
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.Signature
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

/**
 * 功能描述:
 * 作者:wangkun
 * 创建时间:2019/5/5 09:10
 */
@Aspect
class MyIntercept {

    @Pointcut("execution(@com.kyle.aopdemo.annotation.Intercept * *(..))" +
            " && @annotation(m)")
    fun interceptPoint(m: Intercept) {
    }

    @Pointcut("execution(* android.view.View.OnClickListener+.onClick(..))" +
            " && args(v)")
    fun interceptOnClick(v: View) {

    }

    @Before("interceptOnClick(v)")
    fun interceptOnClickBefore(point: JoinPoint, v: View) {
        println("点击view， id = ${v.id}")
    }

    @Around("interceptPoint(m)")
    fun onIntercept(point: ProceedingJoinPoint, m: Intercept) {
        println("参数:" + m.value)
//        return null
        point.proceed()
    }

}

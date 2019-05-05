package com.kyle.aopdemo.annotation

/**
 * 功能描述:
 * 作者:wangkun
 * 创建时间:2019/5/5 09:05
 **/
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class Intercept(val value:String)
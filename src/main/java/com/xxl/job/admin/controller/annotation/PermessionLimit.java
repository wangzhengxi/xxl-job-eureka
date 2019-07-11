package com.xxl.job.admin.controller.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:44
 * @version 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermessionLimit {
	/**
	 * Method Description
	 *
	 * @param
	 * @return null
	 * @author wangzhengxi
	 * @date 2019/5/31
	 */
	boolean limit() default true;

}
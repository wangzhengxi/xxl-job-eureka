package com.xxl.job.admin.controller.interceptor;

import com.xxl.job.admin.core.util.FtlUtil;
import com.xxl.job.admin.core.util.I18nUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
/**
 * CookieInterceptor
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:47
 * @version 1.0.0
 */
@Component
public class CookieInterceptor extends HandlerInterceptorAdapter {

	/**
	 * Method Description
	 *
	 * @param
	 * @return null
	 * @author wangzhengxi
	 * @date 2019/5/31
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		// cookie
		if (modelAndView!=null && request.getCookies()!=null && request.getCookies().length>0) {
			HashMap<String, Cookie> cookieMap = new HashMap<String, Cookie>();
			for (Cookie ck : request.getCookies()) {
				cookieMap.put(ck.getName(), ck);
			}
			modelAndView.addObject("cookieMap", cookieMap);
		}

		// static method
		if (modelAndView != null) {
			modelAndView.addObject("I18nUtil", FtlUtil.generateStaticModel(I18nUtil.class.getName()));
		}
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
}

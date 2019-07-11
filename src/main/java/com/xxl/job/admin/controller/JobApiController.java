package com.xxl.job.admin.controller;

import com.xxl.job.admin.controller.annotation.PermessionLimit;
import com.xxl.job.admin.core.schedule.XxlJobDynamicScheduler;
import com.xxl.job.core.biz.AdminBiz;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JobApiController
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:48
 * @version 1.0.0
 */
@Controller
public class JobApiController implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @RequestMapping(AdminBiz.MAPPING)
    @PermessionLimit(limit=false)
    public void api(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        XxlJobDynamicScheduler.invokeAdminService(request, response);
    }


}

package com.xxl.job.admin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:56
 * @version 1.0.0
 */
@EnableApolloConfig(value = {"xxl_admin_application.yml","common.bootstrap"})
@EnableDiscoveryClient
@SpringBootApplication
public class XxlJobAdminApplication  {
	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}
}
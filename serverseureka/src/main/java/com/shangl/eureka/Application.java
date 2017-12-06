package com.shangl.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: shangl
 * @CreateTime: 2017/12/06
 * @Description: 服务发现
 */
@EnableEurekaServer     //启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication  //启动springboot项目
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
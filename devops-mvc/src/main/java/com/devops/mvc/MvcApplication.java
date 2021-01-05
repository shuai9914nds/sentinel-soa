package com.devops.mvc;

import com.devops.base.annotation.MyApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients({"com.login.*", "com.user.*", "com.menu.*", "com.role.*"})
@ComponentScan(basePackages = {"com.devops.base.config", "com.devops.mvc.*"})
@SpringBootApplication
@MyApplication
public class MvcApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MvcApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        //MvcApplication是原来springboot的启动类
        return builder.sources(MvcApplication.class);
    }

}

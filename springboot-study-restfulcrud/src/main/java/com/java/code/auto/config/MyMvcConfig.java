package com.java.code.auto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zouw
 * @date Created in 9:58 PM 2019/5/9
 */
@Configuration
public class MyMvcConfig {

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        return new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }


            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射,指定拦截器拦截哪些，不拦截哪些
                /*registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login");*/
            }
        };

    }
}

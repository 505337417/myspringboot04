package com.woniuxy.springboot.myspringboot04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.woniuxy.springboot.myspringboot04.LoginHandlerInterceptor;

@Configuration
public class MyWebConfig implements WebMvcConfigurer{
	
	//路径配置类，重写路径的映射关系

	

	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("login");
			}
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginHandlerInterceptor()).
					addPathPatterns("/**").excludePathPatterns("/","/index.html",
							"/user/login","/css/**");
			}
			
		};
	}

}

package pers.felix.springboottour.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.felix.springboottour.interceptor.InterceptorDemo;

/**
 * @author Felix Lee
 * @date 2023/4/23 20:17
 */
@Configuration
public class InterceptorDemoConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorDemo()).addPathPatterns("/interceptor/**");
    }
}

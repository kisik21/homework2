package lesson38.config;

import lesson38.interseptor.AdminInterceptor;
import lesson38.interseptor.LogInterceptor;
import lesson38.interseptor.OldLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    // Static Resource Config
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // LogInterceptor apply to all URLs.
        registry.addInterceptor(new LogInterceptor());

        // This URL is old, It no longer use.
        // Using OldURLInterceptor to redirect to new URL.
        registry.addInterceptor(new OldLoginInterceptor())//
                .addPathPatterns("/admin/oldLogin");

        // This interceptor apply to URL like /admin/*
        // Exclude /admin/oldLogin

        registry.addInterceptor(new AdminInterceptor())//
                .addPathPatterns("/admin/*")//
                .excludePathPatterns("/admin/oldLogin");
    }

}
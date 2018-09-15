package ru.chagay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@Import(AppConfiguration.class)
public class DispatcherServletConfig implements WebMvcConfigurer{

        public void addResourceHandlers(ResourceHandlerRegistry registry​){
            registry​.addResourceHandler("/resurces/**")
                    .addResourceLocations("/resource/");
        }
        @Bean
        public InternalResourceViewResolver setupViewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("/WEB-INF/views/");
            resolver.setSuffix(".jsp");

            return resolver;
        }
}
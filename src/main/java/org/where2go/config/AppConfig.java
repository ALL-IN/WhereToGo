package org.where2go.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.where2go.dao.EventDao;
import org.where2go.services.EventService;

//
@Configuration
@ComponentScan
@Import({DataBaseConfig.class})
@EnableAutoConfiguration
public class AppConfig extends SpringBootServletInitializer {
    public static void main(final String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

    @Bean
    public EventService getEventService() {
        return new EventService();
    }

    @Bean
    public EventDao getEventDao() {
        return new EventDao();
    }

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(AppConfig.class);
    }

}
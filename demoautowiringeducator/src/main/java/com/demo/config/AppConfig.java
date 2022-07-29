package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan 
// We are suggesting for the
// packages where we have 
// The various bean classes
// which will be managed by IOC container
@ComponentScan(basePackages="com.demo.controller com.demo.service com.demo.repository com.demo.component")
@PropertySource("classpath:messages.properties")
public class AppConfig {

}

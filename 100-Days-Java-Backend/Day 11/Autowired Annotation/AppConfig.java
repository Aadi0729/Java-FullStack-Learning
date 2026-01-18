package com.example.autowiredAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.autowiredAnnotation")
public class AppConfig {
}

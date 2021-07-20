package com.example.demo.app;

import com.example.demo.app.service.IceCreamMaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApp {
    public static void main(final String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(DemoApp.class);
        System.out.println(context.getBean(IceCreamMaker.class).make("Chocolate").howItTastes());
    }
}

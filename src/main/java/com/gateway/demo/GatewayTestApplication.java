package com.gateway.demo;

import com.gateway.demo.customizable.MyApplicationContextInitializer;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class GatewayTestApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GatewayTestApplication.class);
        springApplication.setBanner((environment, sourceClass, out)->{
            out.println("***************************");
            out.println("* 啦啦啦啦    *");
            out.println("***************************");
        });
        springApplication.addInitializers(new MyApplicationContextInitializer());
        springApplication.run(args);
    }
//    static class MyCustomBanner implements Banner {
//        @Override
//        public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//            out.println("***************************");
//            out.println("*   Custom Banner        *");
//            out.println("***************************");
//        }
//    }
}

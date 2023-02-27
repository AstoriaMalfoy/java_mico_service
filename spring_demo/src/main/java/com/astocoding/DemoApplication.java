package com.astocoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by IntelliJ LITAO.
 *
 * @author litao
 * @since 2023/2/27 14:34
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // start spring boot
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("======(〃'.'〃)启动成功(〃'.'〃)======");
    }
}

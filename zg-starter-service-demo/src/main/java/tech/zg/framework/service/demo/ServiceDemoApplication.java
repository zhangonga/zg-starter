package tech.zg.framework.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微服务demo启动类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDemoApplication.class, args);
    }
}

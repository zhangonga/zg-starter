package tech.zg.framework.config.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 读取配置的微服务demo
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceDemoApplication.class, args);
    }
}

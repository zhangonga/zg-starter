package tech.zg.framework.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * feign demo的启动类
 * EnableDiscoveryClient 和 @EnableEurekaClient功能一样
 * 区别是EnableEurekaClient只能用于eureka服务发现。
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}

package tech.zg.framework.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 启用断路器 Hystrix 的 ribbon 启动类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class RibbonHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonHystrixApplication.class, args);
    }
}

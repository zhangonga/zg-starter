package tech.zg.framework.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务启动类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class ClusterEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClusterEurekaServerApplication.class, args);
    }
}

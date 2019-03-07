package tech.zg.framework.service.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@Configuration
public class DemoConfig {

    @Value("${server.port}")
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

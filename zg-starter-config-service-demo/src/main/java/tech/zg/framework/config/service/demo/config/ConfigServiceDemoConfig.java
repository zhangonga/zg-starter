package tech.zg.framework.config.service.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * <p>
 *
 * @author: 张弓
 * @date: 2019/3/7
 * @version: 1.0.0
 */
@Configuration
@RefreshScope
public class ConfigServiceDemoConfig {

    @Value("${config.service.demo}")
    private String demoValue;

    public String getDemoValue() {
        return demoValue;
    }

    public void setDemoValue(String demoValue) {
        this.demoValue = demoValue;
    }
}

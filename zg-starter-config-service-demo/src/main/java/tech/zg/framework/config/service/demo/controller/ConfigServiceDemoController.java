package tech.zg.framework.config.service.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.framework.config.service.demo.config.ConfigServiceDemoConfig;

/**
 * 接口
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class ConfigServiceDemoController {

    @Autowired
    private ConfigServiceDemoConfig configServiceDemoConfig;

    @GetMapping("/demo")
    public String demo(){
        return "hi, the property config.service.demo value is " + configServiceDemoConfig.getDemoValue();
    }
}

package tech.zg.framework.service.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.framework.service.demo.config.DemoConfig;

/**
 * demo
 * <p>
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @GetMapping("/demo")
    public String demo(){
        return "hi, my port is " + demoConfig.getPort();
    }
}

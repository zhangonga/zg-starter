package tech.zg.framework.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.framework.feign.service.FeignService;

/**
 * feign 测试入口
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    /**
     * feignDemo
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    @GetMapping("feignDemo")
    public String feignDemo() {
        return feignService.feignDemo();
    }
}

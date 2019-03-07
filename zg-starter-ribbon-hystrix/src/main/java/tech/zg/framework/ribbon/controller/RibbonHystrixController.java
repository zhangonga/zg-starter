package tech.zg.framework.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.zg.framework.ribbon.service.RibbonHystrixService;

/**
 * controller
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbonHystrixDemo")
    public String demo() {
        return ribbonHystrixService.demoService();
    }
}

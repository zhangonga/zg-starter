package tech.zg.framework.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import tech.zg.framework.feign.client.hystrix.ScheduleServiceHystrix;

/**
 * zg-starter-service-demo的工程的feign client
 * feign集成了ribbon，自带负载均衡
 * client应该由提供服务方提供，调用方引入jar包即可。
 * <p>
 * feign 已集成了 hystrix 断路器，所以就不再新起工程了
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@FeignClient(value = "SERVICE-DEMO", fallback = ScheduleServiceHystrix.class)
public interface ServiceDemoClient {

    /**
     * 通过feign调用service-demo的demo方法，只需要写接口，不需要实现方法
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    @GetMapping(value = "/demo")
    String serviceDemo();
}

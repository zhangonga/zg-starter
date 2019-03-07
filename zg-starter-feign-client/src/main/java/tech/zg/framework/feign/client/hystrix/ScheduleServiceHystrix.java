package tech.zg.framework.feign.client.hystrix;

import org.springframework.stereotype.Component;
import tech.zg.framework.feign.client.ServiceDemoClient;

/**
 * feign 断路器调用的服务
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@Component
public class ScheduleServiceHystrix implements ServiceDemoClient {
    /**
     * feign调用服务失败后，执行该方法。
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    @Override
    public String serviceDemo() {
        return "sorry feign service demo timeout";
    }
}

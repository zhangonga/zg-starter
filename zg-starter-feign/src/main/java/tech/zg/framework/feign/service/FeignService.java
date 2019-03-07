package tech.zg.framework.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import tech.zg.framework.feign.client.ServiceDemoClient;

/**
 * 服务
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@Service
public class FeignService {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ServiceDemoClient serviceDemoClient;

    /**
     * feignDemo，通过feign调用service-demo的demo方法
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    public String feignDemo() {
        return serviceDemoClient.serviceDemo();
    }
}

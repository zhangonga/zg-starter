package tech.zg.framework.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 服务
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * ribbon是一个负载均衡客户端
     * ribbon其实就是在一个eureka集群中，通过restTemplate调用服务
     * 建议使用feign，feign是服务端提供client，调用方只需要引入client jar即可。
     * <p>
     *
     * @return String
     * @author: 张弓
     * @version: 1.0.0
     */
    public String demoService() {
        String url = "http://SERVICE-DEMO/demo";
        return restTemplate.getForObject(url, String.class);
    }
}

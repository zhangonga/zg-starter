package tech.zg.framework.gateway.controller;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关路由
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@RestController
public class GatewayController {

    /*@Bean
    public RouteLocator gateway(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.
                        path("/get")
                        .filters(f -> f.
                                addRequestHeader("hell", "1"))
                        .uri("http://localhost:8793"))
                .build();
    }*/
}

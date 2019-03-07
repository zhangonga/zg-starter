package tech.zg.framework.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * zuul 网关过滤
 * <p>
 *
 * @author: 张弓
 * @version: 1.0.0
 */
@Component
public class ZuulDemoFilter extends ZuulFilter {

    private static final Logger LOG = LoggerFactory.getLogger(ZuulDemoFilter.class);

    /**
     * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * pre 路由之前
     * routing 路由之时
     * post 路由之后
     * error 发送错误调用
     * <p>
     *
     * @return String
     * @author: 张弓
     * @date: 2019/3/7
     * @version: 1.0.0
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * <p>
     *
     * @return int
     * @author: 张弓
     * @date: 2019/3/7
     * @version: 1.0.0
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤
     * true 永远过滤。
     * <p>
     *
     * @return boolean
     * @author: 张弓
     * @date: 2019/3/7
     * @version: 1.0.0
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。可以很复杂，包括查Sql, NoSql去判断该请求到底有没有权限访问
     * 本例校验访问的url有没有token参数
     * <p>
     *
     * @return 返回参数说明
     * @author: 张弓
     * @version: 1.0.0
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        LOG.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            LOG.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(403);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
            }
            return null;
        }
        LOG.info("token is {}", accessToken);
        return null;
    }
}

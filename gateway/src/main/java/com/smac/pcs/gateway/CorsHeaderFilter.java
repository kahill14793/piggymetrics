package com.smac.pcs.gateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

@Component
public class CorsHeaderFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.getResponse().addHeader("Access-Control-Allow-Headers", "*");
        
        ctx.getResponse().addHeader("Access-Control-Expose-Headers", "X-totalPages");
        ctx.getResponse().addHeader("Access-Control-Expose-Headers", "X-number");
        ctx.getResponse().addHeader("Access-Control-Expose-Headers", "X-numberOfElements");
        ctx.getResponse().addHeader("Access-Control-Expose-Headers", "X-totalElements");
        ctx.getResponse().addHeader("Access-Control-Expose-Headers", "X-size");
        return null;
    }
}
package com.bjpowernode.sprinngboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.sprinngboot.filter
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 8:46
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@WebFilter(urlPatterns = "/myFilter")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("俺们已经进入过滤器");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

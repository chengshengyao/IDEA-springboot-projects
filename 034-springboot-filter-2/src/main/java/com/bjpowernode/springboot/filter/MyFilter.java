package com.bjpowernode.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.filter
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/25 8:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("------");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

package com.atguigu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
        System.out.println("HelloFilter............放行之前");
        arg2.doFilter(arg0, arg1);
        System.out.println("HelloFilter............放行之后");

    }

    @Override
    public void destroy() {

    }
}

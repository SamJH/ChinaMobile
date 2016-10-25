package com.oracle.filter;

import java.io.IOException;





import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.po.Users;





public class LoginFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException{
    	

    	
    }
    public void doFilter(ServletRequest request, ServletResponse response,
    		FilterChain chain) throws IOException, ServletException {
    	//获得在下面代码中要用的request，response，session对象
    	HttpServletRequest servletRequest = (HttpServletRequest) request;
    	HttpServletResponse servletResponse = (HttpServletResponse) response;
    	HttpSession session = servletRequest.getSession();
    	//获得用户请求的URI
    	String path = servletRequest.getRequestURI();
    	System.out.println(path);
    	
    	
    	if(path.contains("index.jsp")||path.contains("login")||path.contains("images")||path.contains("style.css")){
    		chain.doFilter(request, response);
    		//System.out.println("放行登录页面");
    		return;
    	}
    	
    	
    	//从session力取员工工号
    	Users users = (Users) session.getAttribute("currentUser");
    	
    	
    	//System.out.println(users);
    	
    	//System.out.println("-------------");
    	
    	
    	if(users != null){
    		//已经登录，放行
    		
    		chain.doFilter(request, response); //doFilter方函数中的chian.doFilter方法的作用是过滤，放行
    		
    	}else{
    		//返回登录
    		servletResponse.sendRedirect("index.jsp");
    		//System.out.println("什么情况");
    	}
    	
    }
    public void destroy() {
    	// TODO Auto-generated method stub
    	
    }
	

}

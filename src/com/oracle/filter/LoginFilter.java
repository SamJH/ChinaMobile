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
    	//��������������Ҫ�õ�request��response��session����
    	HttpServletRequest servletRequest = (HttpServletRequest) request;
    	HttpServletResponse servletResponse = (HttpServletResponse) response;
    	HttpSession session = servletRequest.getSession();
    	//����û������URI
    	String path = servletRequest.getRequestURI();
    	System.out.println(path);
    	
    	
    	if(path.contains("index.jsp")||path.contains("login")||path.contains("images")||path.contains("style.css")){
    		chain.doFilter(request, response);
    		//System.out.println("���е�¼ҳ��");
    		return;
    	}
    	
    	
    	//��session��ȡԱ������
    	Users users = (Users) session.getAttribute("currentUser");
    	
    	
    	//System.out.println(users);
    	
    	//System.out.println("-------------");
    	
    	
    	if(users != null){
    		//�Ѿ���¼������
    		
    		chain.doFilter(request, response); //doFilter�������е�chian.doFilter�����������ǹ��ˣ�����
    		
    	}else{
    		//���ص�¼
    		servletResponse.sendRedirect("index.jsp");
    		//System.out.println("ʲô���");
    	}
    	
    }
    public void destroy() {
    	// TODO Auto-generated method stub
    	
    }
	

}

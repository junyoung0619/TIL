	package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class AdminInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		request.getMethod(); //GET, POST, PUT
		
		"Get".equals(request.getMethod());
		"Get".equalsIgnoreCase(request.getMethod());
		
		if(!"admin".equals(session.getAttribute("loginUser"))) {
			response.sendRedirect("list");
			return false;
		}
		return true;
	}
}

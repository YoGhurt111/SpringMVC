package com.yoghurt.interceptors;


import com.yoghurt.auth.AuthPassport;
import com.yoghurt.entity.User;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            AuthPassport authPassport = ((HandlerMethod) handler)
                    .getMethodAnnotation(AuthPassport.class);
            if (authPassport == null || authPassport.needAuth() == false) {
                return true;
            } else {
                String userName = request.getParameter("name");
                if (userName.equals("A"))
                    return true;
                else {
                    response.sendRedirect("fail");
                }
            }
        }
        return false;
    }

}

package com.yoghurt.interceptors;

import com.yoghurt.auth.BAuthPassport;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dell on 2017/3/17.
 */
public class BAuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        BAuthPassport bAuthPassport = ((HandlerMethod) handler)
                .getMethodAnnotation(BAuthPassport.class);
        if (bAuthPassport == null || bAuthPassport.needAuth() == false) {
            return true;
        } else {
            String userName = request.getParameter("name");
            if (userName.equals("B"))
                return true;
            else {
                response.sendRedirect("fail");
            }
        }
        return false;
    }

}

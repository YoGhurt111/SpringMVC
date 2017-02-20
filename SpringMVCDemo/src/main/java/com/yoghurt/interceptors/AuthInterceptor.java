package com.yoghurt.interceptors;


import com.yoghurt.auth.AuthPassport;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AuthInterceptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler.getClass().isAssignableFrom(HandlerMethod.class)){
            AuthPassport authPassport = ((HandlerMethod)handler).getMethodAnnotation(AuthPassport.class);
            if(authPassport == null || authPassport.needAuth() == false){
                return true;
            }
            else{
                //在这里实现自己的权限验证逻辑
                if(false)//如果验证成功返回true（这里直接写false来模拟验证失败的处理）
                    return true;
                else//如果验证失败
                {
                    //返回到登录界面
                    response.sendRedirect("user");
                    return false;
                }
            }
        }
        else{
            return false;
        }
    }

}

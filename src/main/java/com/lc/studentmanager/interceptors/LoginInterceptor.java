package com.lc.studentmanager.interceptors;

import com.lc.studentmanager.domain.Student;
import com.lc.studentmanager.domain.Teacher;
import com.lc.studentmanager.util.Const;
import com.lc.studentmanager.domain.Admin;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname LoginInterceptor
 * @Description 登录拦截器
 * @Date 2019/6/25 16:09
 * @Created by lc
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Admin user = (Admin)request.getSession().getAttribute(Const.ADMIN);
        Teacher teacher = (Teacher)request.getSession().getAttribute(Const.TEACHER);
        Student student = (Student)request.getSession().getAttribute(Const.STUDENT);
        if(!StringUtils.isEmpty(user) || !StringUtils.isEmpty(teacher) || !StringUtils.isEmpty(student)){
            return true;
        }
        response.sendRedirect(request.getContextPath() + "/system/login");
        return false;
    }

}
package com.songjiale.cms.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.bawei.commons.utils.StringUtil;
import com.songjiale.cms.service.UserService;

public class AuthAdminInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object userInfo = request.getSession().getAttribute(CmsConstant.UserAdminSessionKey);
		if(userInfo!=null) {
			return true;
		}
		//记登
				/*String username = CookieUtil.getCookieByName(request, "username");
				if(StringUtil.isBlank(username)) {
					UserService userService = SpringBeanUtils.getBean(UserService.class);
					userInfo = userService.getByUsername(username);
					request.getSession().setAttribute(CmsConstant.UserSessionKey,userInfo);
				}*/
	    response.sendRedirect("/admin/");
		return false;
	}

}

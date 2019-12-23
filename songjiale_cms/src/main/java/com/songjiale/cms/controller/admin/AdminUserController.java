package com.songjiale.cms.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.commons.utils.StringUtil;
import com.songjiale.cms.common.CmsConstant;
import com.songjiale.cms.common.CmsMd5Util;
import com.songjiale.cms.common.CookieUtil;
import com.songjiale.cms.common.JsonResult;
import com.songjiale.cms.pojo.User;
import com.songjiale.cms.service.UserService;

@Controller
@RequestMapping("/admin/user/")
public class AdminUserController {
	@Autowired
	private UserService userService;
	/**
	 * @Title: login   
	 * @Description: 后台登录接口   
	 * @param: @param user
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping("login")
	@ResponseBody
	public Object login(User user,HttpSession session) {
		//判断用户名和密码
		System.err.println("user"+user);
		System.err.println("用户名称结果"+StringUtil.isBlank(user.getUsername()));
		System.err.println("用户密码结果"+StringUtil.isBlank(user.getPassword()));
		if(StringUtil.isBlank(user.getUsername()) || StringUtil.isBlank(user.getPassword())) {
			return JsonResult.fail(1000, "用户名和密码不能为空");
		}
		//查询用户
		User userInfo = userService.getByUsername(user.getUsername());
		//用户为空
		if(userInfo==null) {
			return JsonResult.fail(1000, "用户名或密码错误");
		}
		//是否管理员
		if(!userInfo.isAdmin()) {
			return JsonResult.fail(1000, "权限不够");
		}
		//判断密码
		String string2md5 = CmsMd5Util.string2MD5(user.getPassword());
		System.err.println("1111");
		System.err.println("加密密码"+string2md5);
		
		if(string2md5.equals(userInfo.getPassword())) {
			session.setAttribute(CmsConstant.UserAdminSessionKey, userInfo);
			//记住密码
		/*	if("1".equals(user.getIsMima())) {
				int maxAge=1000*60*60*24;
				CookieUtil.addCookie(response, "username", user.getUsername(), null,null, maxAge);
			}
			*/
			return JsonResult.sucess();
		}
		System.err.println("1111");
		System.err.println(string2md5);
		return JsonResult.fail(500, "未知错误");
	}
	
	@RequestMapping("logout")
	public Object logout(HttpServletResponse response,HttpSession session) {
		session.removeAttribute(CmsConstant.UserAdminSessionKey);
		return "redirect:/admin/";
	}
}

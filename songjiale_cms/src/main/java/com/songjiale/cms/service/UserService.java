package com.songjiale.cms.service;

import com.songjiale.cms.pojo.User;

public interface UserService {
	/**
	 * 
	* @Title: register 
	* @Description: TODO 注册新增用户
	* @param @param user
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
    public boolean register(User user);
    /**
     * 
    * @Title: getByUsername 
    * @Description: TODO 根据登录名称，查询用户信息
    * @param @param username
    * @param @return    设定文件 
    * @return User    返回类型 
    * @throws
     */
    public User getByUsername(String username);
    /**
	 * 
	* @Title: locked 
	* @Description: TODO  加锁用户
	* @param @param userId
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	boolean locked(Integer userId);
	/**
	 * 
	* @Title: unLocked 
	* @Description: TODO  解锁用户
	* @param @param userId
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	boolean unLocked(Integer userId);
	/**
	 * 
	* @Title: addScore 
	* @Description: TODO 给用户添加积分,返回用户总积分
	* @param @param userId
	* @param @param score
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int addScore(Integer userId,int score);
	
}

package com.songjiale.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.songjiale.cms.pojo.Article;
import com.songjiale.cms.pojo.Article_Vote;
import com.songjiale.cms.pojo.Settings;
import com.songjiale.cms.pojo.User;

public interface SettingsDao {
	/**
	 * 
	* @Title: gerByid 
	* @Description: TODO 根据id,查询对象
	* @param @param id
	* @param @return    设定文件 
	* @return User    返回类型 
	* @throws
	 */
	User selectByid(Integer id);
	/**
	 * 
	* @Title: select 
	* @Description: TODO 根据User查询列表
	* @param @param article_vote
	* @param @return    设定文件 
	* @return List<settings>    返回类型 
	* @throws
	 */
	List<Article> select(@Param("settings")Settings settings);
	/**
	 * 
	* @Title: insert 
	* @Description: TODO 插入一条数据
	* @param @param article_vote
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int insert(@Param("settings")Settings settings);
	/**
	 * 
	* @Title: update 
	* @Description: TODO 更新一条是数据记录
	* @param @param settings
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int update(@Param("settings")Settings settings);
	/**
	 * 
	* @Title: deleteByid 
	* @Description: TODO 根据Id删除记录
	* @param @param settings
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int deleteByid(@Param("id")Integer id);
	/**
	 * 
	* @Title: deleteByids 
	* @Description: TODO 根据ids批量删除记录
	* @param @param ids
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int deleteByids(@Param("ids")String ids);

}

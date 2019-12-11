package com.songjiale.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.songjiale.cms.pojo.Article;
import com.songjiale.cms.pojo.Article_Vote;
import com.songjiale.cms.pojo.User;

public interface Article_VoteDao {
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
	* @return List<article_vote>    返回类型 
	* @throws
	 */
	List<Article> select(@Param("article_vote")Article_Vote article_vote);
	/**
	 * 
	* @Title: insert 
	* @Description: TODO 插入一条数据
	* @param @param article_vote
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int insert(@Param("article_vote")Article_Vote article_vote);
	/**
	 * 
	* @Title: update 
	* @Description: TODO 更新一条是数据记录
	* @param @param article_vote
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	int update(@Param("article_vote")Article_Vote article_vote);
	/**
	 * 
	* @Title: deleteByid 
	* @Description: TODO 根据Id删除记录
	* @param @param article_vote
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

package com.songjiale.cms.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.commons.utils.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songjiale.cms.dao.CommentDao;
import com.songjiale.cms.pojo.Comment;
@Service
public class CommentService {
	@Autowired
	private CommentDao commentDao;
	/**
	 * @Title: add   
	 * @Description: 添加评论   
	 * @param: @param comment
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean add(Comment comment) {
		SimpleDateFormat  f=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String createdStr = f.format(new Date());
		comment.setCreated(createdStr);
		return commentDao.insert(comment)>0;
	}
	/**
	 * @Title: getPageInfo   
	 * @Description: 根据文章Id,查询评论   
	 * @param: @param articleId
	 * @param: @param pageNum
	 * @param: @return      
	 * @return: PageInfo<Comment>      
	 * @throws
	 */
	public PageInfo<Comment> getPageInfo(Integer articleId,int pageNum){
		PageHelper.startPage(pageNum, 2);
		Comment comment = new Comment();
		comment.setArticleid(articleId);
		List<Comment> commentList = commentDao.select(comment);
		return new PageInfo<>(commentList);
	}
}

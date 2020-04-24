package com.swb.ssm.service.dao;

import com.swb.ssm.service.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserDao {

	/**
	 * 通过ID查询用户
	 * 
	 * @param id
	 * @return
	 */
	User queryById(@Param("userId")long id);

	/**
	 * 根据id更新
	 * @param user
	 */
	int update(User user);

	/**
	 * 根据id删除
	 * @param id
	 */
	int deleteById(@Param("userId") long id);

	/**
	 * 插入
	 * @param user
	 */
	int insert(User user);



}

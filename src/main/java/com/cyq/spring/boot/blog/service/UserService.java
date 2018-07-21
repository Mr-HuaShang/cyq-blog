package com.cyq.spring.boot.blog.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cyq.spring.boot.blog.domain.User;

/**
 * User 服务接口.
 */
public interface UserService {
	/**
	 * 保存用户
	 */
	User saveUser(User user);
	
	/**
	 * 删除用户
	 */
	void removeUser(Long id);
	
	/**
	 * 删除列表里面的用户
	 */
	void removeUsersInBatch(List<User> users);
	
	/**
	 * 更新用户
	 */
	User updateUser(User user);
	
	/**
	 * 根据id获取用户
	 */
	User getUserById(Long id);
	
	/**
	 */
	List<User> listUsers();
	
	/**
	 * 根据用户名进行分页模糊查询
	 */
	Page<User> listUsersByNameLike(String name, Pageable pageable);
	
	/**
	 * 更具名称列表查询
	 */
	List<User> listUsersByUsernames(Collection<String> usernames);

	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	User getUserByUsername(String username);

	/**
	 * 根据邮箱获取用户
	 */
	User getUserByEmail(String email);
}

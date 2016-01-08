package com.jp.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.jba.entity.Blog;
import com.jp.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer>{
	
	List<Blog> findByUser(User user);
}

package com.jp.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
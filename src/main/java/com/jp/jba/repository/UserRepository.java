package com.jp.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

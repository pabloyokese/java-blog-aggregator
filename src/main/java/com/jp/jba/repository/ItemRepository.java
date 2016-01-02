package com.jp.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}

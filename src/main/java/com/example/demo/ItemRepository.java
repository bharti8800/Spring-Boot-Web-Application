package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

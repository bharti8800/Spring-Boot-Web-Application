package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ItemRepository;
import com.example.demo.Model.Item;

@Controller
public class ItemController {

	@Autowired
	ItemRepository repo;
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("item")
	public String createItem(Item item) {
		repo.save(item);
		return "home.jsp";
	}
}

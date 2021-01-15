package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.ItemRepository;
import com.example.demo.Model.Item;

@Controller
public class ItemController {

	@Autowired
	ItemRepository repo;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		List<Item> itemList = repo.findAll();
		//System.out.println(itemList.toString());
		mv.addObject("itemList",itemList.toString()); 
		mv.setViewName("home.jsp");
		return mv;
	}
	
	
	@PostMapping("/item")
	public String createOrUpdateItem(Item item) {
		repo.save(item);
		return "home.jsp";
	}
	
	
	@GetMapping("/item")
	public ModelAndView viewItem(@RequestParam("serialId") int serialId) {
		ModelAndView mv = new ModelAndView();
		Item item = repo.findById(serialId).orElse(null);
		if(item!=null)
			mv.addObject("item", item);
		mv.setViewName("home.jsp");
		return mv;
	}
	
	
	  @GetMapping("/deleteItem") 
	  public String deleteItem(@RequestParam("id") int serialId) {
		  Item item = repo.findById(serialId).orElse(null);
		  if(item != null)
			  repo.deleteById(serialId);
		  return "home.jsp"; 
	  }
	 
	
	
	  @RequestMapping("/items") 
	  public ModelAndView viewItems() { 
		  ModelAndView mv = new ModelAndView();
		  List<Item> itemList = repo.findAll();
		  mv.addObject("itemList",itemList.toString()); 
		  mv.setViewName("home.jsp"); 
		  return mv;
	  
	  }
	 
	
}

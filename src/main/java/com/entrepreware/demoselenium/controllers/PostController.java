package com.entrepreware.demoselenium.controllers;

import com.entrepreware.demoselenium.entity.Post;
import com.entrepreware.demoselenium.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {
	@Autowired
	private PostService service;

	@GetMapping("/posts")
	public List<Post> getAll(){
		return  service.getAll();
	}
	@GetMapping("/posts/{id}")
	public Optional<Post> getOne(@PathVariable int id){
		return service.getOne(id);
	}

	@PostMapping("/posts")
	public Post addPost(@RequestBody Post post){
		return service.addPost(post);
	}

}

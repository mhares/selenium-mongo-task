package com.entrepreware.demoselenium.service;


import com.entrepreware.demoselenium.dao.PostRepository;
import com.entrepreware.demoselenium.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
	@Autowired
	private PostRepository repository;
	public List<Post> getAll(){
		return repository.findAll();
	}
	public Post addPost(Post post){
		return repository.save(post);
	}
	public Optional<Post> getOne(int id){
		return repository.findById(id);
	}
}

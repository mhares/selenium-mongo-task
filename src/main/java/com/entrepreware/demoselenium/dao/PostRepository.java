package com.entrepreware.demoselenium.dao;

import com.entrepreware.demoselenium.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,Integer> {
}

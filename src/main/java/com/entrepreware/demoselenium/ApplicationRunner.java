package com.entrepreware.demoselenium;

import com.entrepreware.demoselenium.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		mongoTemplate.save(new Post());
		System.out.println("Application ran");
	}
}

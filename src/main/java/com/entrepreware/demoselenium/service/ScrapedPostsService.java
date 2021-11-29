package com.entrepreware.demoselenium.service;


import com.entrepreware.demoselenium.entity.Post;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScrapedPostsService {
	@Autowired
	private PostService service;
	@PostConstruct
	public 	void postConstruct(){
		addPosts();
	}
	FirefoxDriver driver=new FirefoxDriver();
	List<Post> posts = new ArrayList<>();

	public void addPosts() {
		driver.get("https://thenextweb.com/latest");
		WebElement element = driver.findElement(By.id("articleList"));
		List<WebElement> header = element.findElements(By.className("c-listArticle__heading"));
		List<WebElement> desc = element.findElements(By.className("c-listArticle__intro"));
		List<WebElement> author = element.findElements(By.className("c-meta__link"));
		List<WebElement> img = element.findElements(By.tagName("img"));

			for (int i = 0; i < header.size(); i++) {
				posts.add(new Post(i+1
						,header.get(i).getText()
						,desc.get(i).getText()
						,author.get(i).getText()
						,img.get(i).getAttribute("src")));
			}
			driver.quit();
			for (Post temp : posts) {
				service.addPost(temp);
			}
		}




}

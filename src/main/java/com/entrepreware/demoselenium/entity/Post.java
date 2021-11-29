package com.entrepreware.demoselenium.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post {
	@Id
	private int id;
	private String title;
	private String description;
	private String author;
	private String img;

	public Post() {
	}

	public Post(int id , String title , String description , String author , String img) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
		this.img = img;
	}

	public Post(String title , String description, String author , String img) {
		this.title = title;
		this.description = description;
		this.author=author;
		this.img = img;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Post{" + "id=" + id + ", title='" + title + '\'' + ", description='" + description + '\'' + ", author='" + author + '\'' + ", img='" + img + '\'' + '}';
	}
}

package com.example.simple.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple.dto.Article;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {
	
	@GetMapping("/list")
	public List<Article> getArticles() {
		return Arrays.asList(
					new Article(1, "First Article", "This is the first article")
					, new Article(2, "Second Article", "This is the second article")
				);
	}

}

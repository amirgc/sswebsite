package dao;

import java.util.ArrayList;
import java.util.List;

import model.News;

public class NewsDAO {
	
	List<News> newsList = new ArrayList<>();
	
	public void addNews(News news) {
		newsList.add(news);
	}
	
	public List<News> getNews() {
		return newsList;
		
	}
	

}

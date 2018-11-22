package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Feedback;
import model.News;

public class NewsDAO {
	
	HashMap<String, News> AllNews = new HashMap<>();

	{
		AllNews.put("Sewasoft PremiumOne BI Claim Module Deployment", new News("Sewasoft PremiumOne BI Claim Module Deployment", "After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance."));
		AllNews.put("Sewasoft Billing System Released", new News("Sewasoft Billing System Released", "After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance."));
	
	}
	
	public void addNews(News news) {
		AllNews.put(news.getTitle(), news);
	}
	
	public List<News> getNews() {		
		return new ArrayList<News>(AllNews.values());
	}
	

}

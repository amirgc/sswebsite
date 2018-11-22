package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dal.Dao;
import dal.DataAccess;
import dal.DataAccessFactory;
import model.Feedback;
import model.News;

public class NewsDAO implements Dao {

	DataAccess da = DataAccessFactory.getDataAccess();
	static HashMap<String, News> AllNews = new HashMap<>();
	private ArrayList<News> news;

	private String sql;

	static {
		AllNews.put("Sewasoft PremiumOne BI Claim Module Deployment", new News(
				"Sewasoft PremiumOne BI Claim Module Deployment",
				"After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance."));
		AllNews.put("Sewasoft Billing System Released", new News("Sewasoft Billing System Released",
				"After successful deployment for Reinsurance and Renewal module of Insurance Software Gapsco deploy Claim Module at Himalayan General Insurance."));

	}

	public void addNews(News news) {
		AllNews.put(news.getTitle(), news);
	}

	public static List<News> getNews() {
		return new ArrayList<News>(AllNews.values());
	}

	@Override
	public String getSql() {
		// TODO Auto-generated method stub
		return this.sql;
	}

	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {

		news = new ArrayList<News>();
		while (rs.next()) {
			news.add(new News(rs.getString("title"), rs.getString("description")));
		}
	}

	@Override
	public boolean InsertUpdate(Object o) {
		News n = (News) o;
		this.sql = "Insert into News(title,description)" + " values('" + n.getTitle() + "','" + n.getDescription()
				+ "')";
		try {
			da.write(this);
			return true;
		} catch (SQLException e) {

		}
		return false;
	}

	@Override
	public List<News> Select() {
		this.sql = "Select * from News";
		try {
			da.read(this);
		} catch (SQLException e) {

		}
		return news;
	}

	@Override
	public Object SelectFirstOrDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}

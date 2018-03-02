package org.wecancodeit.reviewsfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnimeReview {
	@Id
	@GeneratedValue
	long id;
	private String title;
		
	@ManyToOne
	private Category category; 
	
	public AnimeReview(String title) {
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	public AnimeReview() {}
	
	public AnimeReview(String title, Category category) {
		this.title = title;
		this.category = category;
	}

	public String getAnimeReview() {
		// TODO Auto-generated method stub
		return title;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public Category getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

}

package org.wecancodeit.reviewsfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnimeReview {
	@Id
	@GeneratedValue
	long id;
	private String title;

	public AnimeReview(String title) {
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	public AnimeReview() {}
	
	
	public String getAnimeReview() {
		// TODO Auto-generated method stub
		return title;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

}

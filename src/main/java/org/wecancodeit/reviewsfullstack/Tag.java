package org.wecancodeit.reviewsfullstack;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Tag {

	@Id
	@GeneratedValue
	private long id; 
	private String type;

	
	@ManyToMany
	private Collection<AnimeReview> animeReviews; 
	
	
	public Tag(String type) {
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	public Tag() {}

	public String getTags() {
		// TODO Auto-generated method stub
		return type;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public Collection<AnimeReview> getAnimeReviews(){
		return animeReviews;
		
	}
	
}

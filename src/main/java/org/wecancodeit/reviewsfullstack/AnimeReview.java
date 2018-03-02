package org.wecancodeit.reviewsfullstack;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AnimeReview {
	@Id
	@GeneratedValue
	long id;
	private String title;
		
	@ManyToOne
	private Category category;
	
	@ManyToMany(mappedBy = "animeReviews")
	private Collection<Tag> tags; 
	
	public AnimeReview(String title) {
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	public AnimeReview() {}
	
	public AnimeReview(String title, Category category) {
		this.title = title;
		this.category = category;
	}

	public AnimeReview(String title, Category category, Tag...tags) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.category = category;
		this.tags = new HashSet<>(asList(tags)); 
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

	public Collection<Tag> getTags() {
		// TODO Auto-generated method stub
		return tags;
	}

}

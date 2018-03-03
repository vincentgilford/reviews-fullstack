package org.wecancodeit.reviewsfullstack;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class AnimeReview {
	@Id
	@GeneratedValue
	long id;
	private String title;
		
	@ManyToOne
	private Category category;
	
	@ManyToMany
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

	
	
	
	@Override
	public String toString() {
		return "AnimeReview Title:" + title;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimeReview other = (AnimeReview) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}

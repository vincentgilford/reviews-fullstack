package org.wecancodeit.reviewsfullstack;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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

	
	@ManyToMany(mappedBy="tags")
	private Collection<AnimeReview> animeReviews; 
	
	
	public Tag(String type) {
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	public Tag() {}

	public Tag(String type, AnimeReview...animeReviews) {
		this.type = type; 
		this.animeReviews = new HashSet<>(Arrays.asList(animeReviews));
		
	}
	
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
		Tag other = (Tag) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}

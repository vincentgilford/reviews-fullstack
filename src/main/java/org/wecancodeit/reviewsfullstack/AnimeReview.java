package org.wecancodeit.reviewsfullstack;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	
	
	@ManyToMany
	private Collection<Tag> tags;
	
	@OneToMany
	private Collection<Comment> comments; 
	
	

	@Lob
	private String animeDescription;
	private String imageURL; 
	

	public AnimeReview(String title) {
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	public AnimeReview() {}
	
//	public AnimeReview(String title, Category category) {
//		this.title = title;
//		this.category = category;
//	}
	
	public AnimeReview(String title, Category category, String animeDescription,  String imageURL, Tag...tags) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.category = category;
		this.animeDescription = animeDescription;
		this.imageURL = imageURL;
		this.tags = new HashSet<>(asList(tags)); 
	}

	
	public AnimeReview(String title, Category category, String animeDescription, Tag...tags) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.category = category;
		this.animeDescription = animeDescription;
		this.tags = new HashSet<>(asList(tags)); 
	}
	
	
	
	public String getAnimeDescription() {
		return animeDescription;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getImageURL() {
		return imageURL;
	}
	
	public Category getCategory() {
		// TODO Auto-generated method stub
		return category;
	}
	
	public Collection<Comment> getComments() {
		return comments;
	}

	public Collection<Tag> getTags() {

		return tags; 
		//		return tags.toString().replace("[", "").replace("]", "");
	}
	
	public void removeTag(Long id) {
		for(Tag tag: tags) {
			if(tag.getId() == id) {
				tags.remove(tag); 
			}
		}
		
		
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

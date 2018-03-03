package org.wecancodeit.reviewsfullstack;


import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Category {
	@Id
	@GeneratedValue
	long id;
	private String categoryTitle;
	
	@OneToMany(mappedBy = "category")
	private Collection<AnimeReview> animeReviews;
	private String categoryDescription;
	
	@SuppressWarnings("unused")
	private Category (){}
	
	public Category(String category) {
		this.categoryTitle = category;
		// TODO Auto-generated constructor stub
	}
	
	public Category(String category, String categoryDescription, AnimeReview...animeReviews) {
		this.categoryTitle = category;
		this.categoryDescription = categoryDescription;
		this.animeReviews = new HashSet<>(asList(animeReviews));
		// TODO Auto-generated constructor stub
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public String getCategoryTitle() {
		// TODO Auto-generated method stub
		return categoryTitle;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public Collection<AnimeReview> getAnimeReview(){
		return animeReviews;		
	}
	
	
	@Override
	public String toString() {
		return "Category:" + categoryTitle + "AnimeReviews:" + animeReviews;
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
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}

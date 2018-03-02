package org.wecancodeit.reviewsfullstack;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue
	long id;
	private String category;

	@SuppressWarnings("unused")
	private Category (){}
	
	public Category(String category) {
		this.category = category;
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
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

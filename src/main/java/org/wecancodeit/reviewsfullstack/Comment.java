package org.wecancodeit.reviewsfullstack;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	Long id; 
	
	
	@ManyToOne
	private AnimeReview review;
	
	private String commentBody;
	private Date date;
	

	public Comment(Date date, String comment, AnimeReview review) {
		this.date = date;
		this.commentBody = comment;
		this.review = review;			
	}
	
	public AnimeReview getReview() {
		return review;
	}


	public String getComment() {
		return commentBody;
	}


	public Date getDate() {
		return date;
	}
	
}

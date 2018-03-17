package org.wecancodeit.reviewsfullstack;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AnimeReviewRestController {
	
	@Resource
	private AnimeReviewRepository animeReview; 
	
	@Resource
	private CategoryRepository catergoryRepo;
	
	@Resource
	private TagRepository tagRepo; 
	
	
	@RequestMapping("/review/{id}/delete-tag")
	public AnimeReview deleteIndvidualTag(@PathVariable (value="id") long id){
		
		
		 
		return animeReview.findOne(id);
	}
	
	
	
	
}

package org.wecancodeit.reviewsfullstack;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@RequestMapping("/review/{animeTitle}/{id}/delete-tag")
	public AnimeReview deleteIndvidualTag(@PathVariable (value="id") long id, @PathVariable (value="animeTitle") String animeTitle){
		Tag tagRemove = tagRepo.findOne(id);
		AnimeReview animeReviewUpdate = animeReview.findByTitle(animeTitle);
		if(tagRemove != null) {
			tagRepo.delete(tagRemove.getId());
		}
		
		animeReview.save(animeReviewUpdate); 
		 
		return animeReview.findOne(id);
	}

	
	
	
	
}

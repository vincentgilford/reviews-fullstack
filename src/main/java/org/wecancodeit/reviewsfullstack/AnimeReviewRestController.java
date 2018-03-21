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
	
	
	@RequestMapping("/review/{id}/delete-tag")
	public AnimeReview deleteIndvidualTag(@PathVariable (value="id") long id){
		
		
		 
		return animeReview.findOne(id);
	}
	
	@RequestMapping("/review/{id}/delete-tag")
	public AnimeReview deleteIndvidualTag(@PathVariable (value="id") long id){
		
		
		 
		return animeReview.findOne(id);
	}
	
	
	
	
	
	
//	@RequestMapping("/delete-tag")
//	public String deleteIndvidualTag(@RequestParam Long id, String animeReviewTitle){
//		Tag tagRemoval = tags.findOne(id);
//		AnimeReview underReview = animeReviews.findByTitle(animeReviewTitle);
////		Long animeReviewid;
//		if(underReview == null) {
//			 return "reviewView";
//		}
//		
//		if(tagRemoval != null) {
//			underReview.removeTag(id);
//		}	 
//		animeReviews.save(underReview);
//		Long animeReviewid =underReview.getId();
//		
//		return "redirect:/reviewView?=" + animeReviewid;
//	 }//still not functioning
	
	
	
	
	
}

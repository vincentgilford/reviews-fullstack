package org.wecancodeit.reviewsfullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimeReviewController {

	@Resource
	CategoryRepository categories;

	@Resource
	AnimeReviewRepository animeReviews;

	@Resource
	TagRepository tags;

	@RequestMapping("categories")
	public String showCategories(Model model) {
		model.addAttribute("categoriesModel", categories.findAll());
		return "categoriesView";
	}

	@RequestMapping("category")
	public String showInidivualCateogory(@RequestParam Long id, Model model) {
		model.addAttribute("singleCategoryModel", categories.findOne(id));
		return "category";
	}

	@RequestMapping("review")
	public String showIndividualAnimeReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviewModel", animeReviews.findOne(id));
		return "reviewView";
	}
	
	@RequestMapping("tag")
	public String showTagsWithAnimeReview(@RequestParam Long id, Model model){
		model.addAttribute("tagModel", tags.findOne(id)); 
		return "tags";
	}
//	
//	@RequestMapping("/tags{id}")
//	public Tag findOneTag(@PathVariable(value="id") long id) {
//		return tags.findOne(id);
//	}
//	
}

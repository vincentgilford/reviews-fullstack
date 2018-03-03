package org.wecancodeit.reviewsfullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		return "singleCategoryView";
	}

	@RequestMapping("review")
	public String showIndividualAnimeReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviewModel", animeReviews.findOne(id));
		return "reviewView";
	}

}

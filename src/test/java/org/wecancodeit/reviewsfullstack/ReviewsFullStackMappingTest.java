package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ReviewsFullStackMappingTest {
	@Resource
	private TestEntityManager entityManger;
	
	@Resource
	private CategoryRepository categoryRepo;  
	
	@Resource
	private TagRepository tagRepo;
	
	@Resource
	private AnimeReviewRepository animeReviewRepo;
	
	
	@Test
	public void shouldSaveAndLoadCategories() {
		Category category = new Category("Fantasy");
		category = categoryRepo.save(category);
		long categoryId = category.getId();
		
		entityManger.flush();
		entityManger.clear();
		
		category = categoryRepo.findOne(categoryId);
		
		assertThat(category.getCategory(), is("Fantasy"));
	}
	
	
	@Test
	public void shouldSaveAndLoadTags() {
		Tag tag = new Tag("anti-hero");
		tag = tagRepo.save(tag);
		long id = tag.getId();
		
		entityManger.flush();
		entityManger.clear();
		
		tag = tagRepo.findOne(id);
		
		assertThat(tag.getTags(), is("anti-hero"));
	}
	
	
	@Test
	public void shouldSaveAndLoadAnimeReview() {
		AnimeReview animeReview = new AnimeReview("Naruto");
		animeReview = animeReviewRepo.save(animeReview);
		long id = animeReview.getId(); 
		
		entityManger.flush();
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(id);
		
		assertThat(animeReview.getAnimeReview(),is("Naruto"));
	}
	
	
	@Test
	public void shouldSaveCategoryToAnimeReviewRelationship() {
		//need category object
		Category category = new Category("Action");
		categoryRepo.save(category);
		
		AnimeReview animeReview = new AnimeReview("Naruto", category);
		animeReview = animeReviewRepo.save(animeReview);//id created in JPA
		long id = animeReview.getId(); 
		
		entityManger.flush(); 
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(id);
		
		assertThat(animeReview.getCategory(),is(category));
	}
	
	@Test
	public void shouldSaveTagToAnimeReviewRelationship() {
		Category category = new Category("Action");
		categoryRepo.save(category);
		
		Tag tagOne = new Tag("Shonen");
		tagRepo.save(tagOne);
		Tag tagTwo = new Tag("SuperPowers");
		tagRepo.save(tagTwo);
		
		AnimeReview animeReview = new AnimeReview("Naruto", category, tagOne, tagTwo);
		animeReview = animeReviewRepo.save(animeReview);//id created in JPA
		long id = animeReview.getId(); 
		
		entityManger.flush();
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(id);
		
		assertThat(animeReview.getTags(), containsInAnyOrder(tagOne,tagTwo));
	}
	
	
	
	
	
	
}

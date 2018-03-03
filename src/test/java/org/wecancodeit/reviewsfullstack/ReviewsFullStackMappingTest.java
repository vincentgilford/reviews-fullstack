package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.contains;

import javax.annotation.Resource;
import javax.swing.text.html.parser.TagElement;

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
		
		assertThat(category.getCategoryTitle(), is("Fantasy"));
	}
	
	
	@Test public void shouldSaveAndLoadCategoriesNewDescription(){
		Category category = new Category("Fantasy", "myth and magic");
		category = categoryRepo.save(category);
		long categoryId = category.getId();
		

		entityManger.flush();
		entityManger.clear();
		
		category = categoryRepo.findOne(categoryId);
		
		assertThat(category.getCategoryDescription(), is("myth and magic"));
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
		
		assertThat(animeReview.getTitle(),is("Naruto"));
	}
	
	@Test
	public void shouldSaveAndLoadAnimeReviewNewReviewDescripltion() {
		Category fantasy = new Category("Fantasy", "myth and magic");
		fantasy = categoryRepo.save(fantasy);
		
		Tag shonen = new Tag("Shonen");
		shonen = tagRepo.save(shonen);
		AnimeReview animeReview = new AnimeReview("Naruto", fantasy,"Hokage!!", shonen);
		animeReview = animeReviewRepo.save(animeReview);
		long id = animeReview.getId(); 
		
		entityManger.flush();
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(id);
		
		assertThat(animeReview.getAnimeDescription(),is("Hokage!!"));
	}
	
	
	
	@Test
	public void shouldSaveCategoryToAnimeReviewRelationship() {
		//need category object
		Category action = new Category("Action");
		categoryRepo.save(action);
		
		
		Tag shonen = new Tag("Shonen");
		shonen = tagRepo.save(shonen);
		
		AnimeReview animeReview = new AnimeReview("Naruto", action,"Hokage!!", shonen);
		animeReview = animeReviewRepo.save(animeReview);//id created in JPA
		long id = animeReview.getId(); 
		
		entityManger.flush(); 
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(id);
		
		assertThat(animeReview.getCategory(),is(action));
	}
	
	@Test
	public void shouldSaveTagToAnimeReviewRelationship() {
		Category category = new Category("Action");
		categoryRepo.save(category);
		
		Tag tagOne = new Tag("Shonen");
		Tag tagTwo = new Tag("SuperPowers");
		tagRepo.save(tagOne);
		tagRepo.save(tagTwo);
		
		AnimeReview animeReview = new AnimeReview("Naruto", category,"Hokage!!", tagOne, tagTwo);
		animeReview = animeReviewRepo.save(animeReview);//id created in JPA
		long animeId = animeReview.getId(); 
		
		entityManger.flush();
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(animeId);
	
		
		assertThat(animeReview.getTags(), containsInAnyOrder(tagOne,tagTwo));
	}
	
	
	@Test
	public void shouldSaveAndLoadFinalParametersForAnimeRevieSite() {
		Category category = new Category("Action");
		categoryRepo.save(category);
		
		Tag tagOne = new Tag("Shonen");
		Tag tagTwo = new Tag("SuperPowers");
		tagRepo.save(tagOne);
		tagRepo.save(tagTwo);
		
		AnimeReview animeReview = new AnimeReview("Naruto", category,"Hokage!!", "/images/naruto-and-crew.png", tagOne, tagTwo);
		animeReview = animeReviewRepo.save(animeReview);//id created in JPA
		long animeId = animeReview.getId(); 
		
		entityManger.flush();
		entityManger.clear();
		
		animeReview = animeReviewRepo.findOne(animeId);
	
		
		assertThat(animeReview.getImageURL(), is("/images/naruto-and-crew.png"));
		
	}
	
	
	
	
	
	
}

package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
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
		AnimeReview animeReview = new AnimeReview("Nautro");
		
		
	}
	
	
	
	
	
	
}

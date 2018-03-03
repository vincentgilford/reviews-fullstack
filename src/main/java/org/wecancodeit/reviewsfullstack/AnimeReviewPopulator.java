package org.wecancodeit.reviewsfullstack;

import javax.annotation.Resource;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimeReviewPopulator implements CommandLineRunner{
	
	@Resource
	private AnimeReviewRepository animeReviewRepo;
	
	@Resource
	private CategoryRepository categoryRepo;
	
	@Resource
	private TagRepository tagRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Category action = new Category("Action", "physical clashing");
		categoryRepo.save(action);
		Category fantasy = new Category("Fantasy", "myth and magic");
		categoryRepo.save(fantasy);
		
		Tag shonen = new Tag("Shonen");
		tagRepo.save(shonen);
		Tag superPowers = new Tag("Superpowers");
		tagRepo.save(superPowers);
		Tag videoGame = new Tag("Video Game"); 
		tagRepo.save(videoGame);
		
		

		
		
		
		
		AnimeReview naruto = new AnimeReview("Naruto", action, "he wants be Hokage", shonen, superPowers);
		animeReviewRepo.save(naruto);
		AnimeReview swordArtOnline = new AnimeReview("SwordArt Online", fantasy, "where game over means life over", shonen, videoGame);
		animeReviewRepo.save(swordArtOnline);
		
	}
	
}

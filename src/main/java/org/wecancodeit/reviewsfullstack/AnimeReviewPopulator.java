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
		Category action = new Category("Action");
		categoryRepo.save(action);
		
		Category fantasy = new Category("Fantasy");
		categoryRepo.save(fantasy);
		
		Tag shonen = new Tag("Shonen");
		tagRepo.save(shonen);
		Tag superPowers = new Tag("Superpowers");
		tagRepo.save(superPowers);
		Tag videoGame = new Tag("Video Game"); 
		tagRepo.save(videoGame);
		
		
		AnimeReview naruto = new AnimeReview("Naruto", action, shonen, superPowers);
		animeReviewRepo.save(naruto);
		AnimeReview swordArtOnline = new AnimeReview("SwordArt Online", fantasy, shonen, videoGame);
		animeReviewRepo.save(swordArtOnline);
		
	}
	
}

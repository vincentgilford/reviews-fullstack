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
		Category action = new Category("Action", "physical clashing","/images/goku_by_bpsola-d6j32pk.png");
		categoryRepo.save(action);
		Category fantasy = new Category("Fantasy", "myth and magic", "/images/Fate-stay-night-saber-hd-desktop-wallpaper.png");
		categoryRepo.save(fantasy);
		
		Tag shonen = new Tag("Shonen");
		tagRepo.save(shonen);
		Tag superPowers = new Tag("Superpowers");
		tagRepo.save(superPowers);
		Tag videoGame = new Tag("Video Game"); 
		tagRepo.save(videoGame);
		Tag female = new Tag("Female Protagonist");
		tagRepo.save(female);
		Tag violence = new Tag("Violence");
		tagRepo.save(violence);
		Tag magic = new Tag("Magic");
		tagRepo.save(magic);
		Tag military = new Tag ("Military");
		tagRepo.save(military);
		Tag sciFi = new Tag("Sci-Fi");
		tagRepo.save(sciFi);
		
		
		
		AnimeReview naruto = new AnimeReview("Naruto", action, "he wants be Hokage", "/images/naruto-and-crew.png", shonen, superPowers);
		animeReviewRepo.save(naruto);
		AnimeReview swordArtOnline = new AnimeReview("SwordArt Online", fantasy, "where game over means life over", "/images/sao_image.png", shonen, videoGame, magic);
		animeReviewRepo.save(swordArtOnline);
		AnimeReview michiko = new AnimeReview("Michiko & Hatchin", action, "Black woman is a main character!. The setting and characters are the real star of the show a lot of care went into capturing the essence of South American locals the series is based off of. I enjoyed the ride from beginning to end.", "/images/michiko.png", female, violence);
		animeReviewRepo.save(michiko);
		AnimeReview fullMetalAlchemist = new AnimeReview("Full Metal Alchemist", fantasy, "An anime with a well focused story line, balanced development of characters, and great ending", "/images/fullmetal_alchemist.png", shonen, military, magic,violence);
		animeReviewRepo.save(fullMetalAlchemist);
		AnimeReview ghostInTheShell = new AnimeReview("Ghost in the Shell: Stand Alone Complex", action, "A timeless anime that addresses social, economic and philsophical issues with our current generation.", "/images/ghost_in_the_shell.png", military, magic, violence, sciFi, female);
		animeReviewRepo.save(ghostInTheShell);
	}
	
}

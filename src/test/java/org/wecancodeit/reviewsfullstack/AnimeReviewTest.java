package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
 
public class AnimeReviewTest {
	
	
	@Test
	public void shouldRetrieveAnimeTitle() {
		AnimeReview underTest = new AnimeReview("Naruto");
		
		String check = underTest.getTitle(); 
		
		assertThat(check, is("Naruto"));
		
	}
	
}

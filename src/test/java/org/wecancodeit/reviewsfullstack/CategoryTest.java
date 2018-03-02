package org.wecancodeit.reviewsfullstack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class CategoryTest {
	
	@Test
	public void shouldGetCategoryForAnimeReview() {
		Category underTest = new Category("Fantasy");
		
		String check = underTest.getCategory();
		
		assertThat(check, is("Fantasy"));
		
		
	}
	
}

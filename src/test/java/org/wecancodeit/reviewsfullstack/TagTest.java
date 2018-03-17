package org.wecancodeit.reviewsfullstack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TagTest {
	 
	@Test
	public void shouldCreateMethodGetTag() {
		Tag underTest = new Tag("Post-Apocalyptic");
		
		String check = underTest.getTag(); //need to return a collection
		
		assertThat(check, is("Post-Apocalyptic"));

	}
	
	
}

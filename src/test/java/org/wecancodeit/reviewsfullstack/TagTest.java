package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import java.util.Collection;

import org.junit.Test;


public class TagTest {
	 
	@Test
	public void shouldCreateMethodGetTag() {
		Tag underTest = new Tag("Post-Apocalyptic");
		
		Collection<Tag> check = underTest.getTags(); //need to return a collection
		
		assertThat(check, contains(underTest));
		
	}
	
	
}

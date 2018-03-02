package org.wecancodeit.reviewsfullstack;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;
import java.util.Collection;
import static org.hamcrest.Matchers.is;

import org.hamcrest.core.Is;
import org.junit.Test;


public class TagTest {
	 
	@Test
	public void shouldCreateMethodGetTag() {
		Tag underTest = new Tag("Post-Apocalyptic");
		
		String check = underTest.getTags(); //need to return a collection
		
		assertThat(check, is("Post-Apocalyptic"));
		
	}
	
	
}

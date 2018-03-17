package org.wecancodeit.reviewsfullstack;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
	List<Tag> findByType(String type);
	
	Tag findByTypeIgnoreCase(String type);
	
	
}

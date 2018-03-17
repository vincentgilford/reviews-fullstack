/**
 * 
 */
package org.wecancodeit.reviewsfullstack;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author WeCanCodeIT
 *
 */
public interface AnimeReviewRepository extends CrudRepository<AnimeReview, Long> {
	AnimeReview findByTitle(String title);
	
	AnimeReview findOneByTags(Long id);
}

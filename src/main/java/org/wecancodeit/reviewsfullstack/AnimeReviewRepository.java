/**
 * 
 */
package org.wecancodeit.reviewsfullstack;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author WeCanCodeIT
 *
 */
public interface AnimeReviewRepository extends CrudRepository<AnimeReview, Long> {
	List<AnimeReview> findByTitle(String title);
}

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
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findByCategoryTitle(String categoryTitle);
	
}

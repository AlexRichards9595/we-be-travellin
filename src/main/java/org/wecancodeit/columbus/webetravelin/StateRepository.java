package org.wecancodeit.columbus.webetravelin;

import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, Long> {

	
	Iterable<State> findAllByAbbIgnoreCaseLike(String search);
}

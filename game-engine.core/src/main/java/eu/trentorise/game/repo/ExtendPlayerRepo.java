package eu.trentorise.game.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import eu.trentorise.game.model.core.ComplexSearchQuery;
import eu.trentorise.game.model.core.RawSearchQuery;
import eu.trentorise.game.model.core.SearchCriteria;
import eu.trentorise.game.model.core.StringSearchQuery;

public interface ExtendPlayerRepo {

	public Page<StatePersistence> search(SearchCriteria searchCriteria, Pageable pageable);

	public Page<StatePersistence> search(String gameId, RawSearchQuery query, Pageable pageable);

	public Page<StatePersistence> search(String gameId, ComplexSearchQuery query, Pageable pageable);

	public Page<StatePersistence> search(String gameId, StringSearchQuery query, Pageable pageable);

}

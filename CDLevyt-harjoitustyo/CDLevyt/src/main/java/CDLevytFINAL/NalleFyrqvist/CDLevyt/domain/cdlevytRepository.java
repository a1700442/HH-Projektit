package CDLevytFINAL.NalleFyrqvist.CDLevyt.domain;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface cdlevytRepository extends CrudRepository<cdlevyt, Long> {

//	List<CDLevy> findByArtisti(@Param("Artisti") String Artisti);

}

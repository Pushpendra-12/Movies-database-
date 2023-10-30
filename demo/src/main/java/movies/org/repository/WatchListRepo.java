package movies.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movies.org.model.WatchList;
@Repository("watchRepository")
public interface WatchListRepo extends JpaRepository<WatchList, Integer>{

}

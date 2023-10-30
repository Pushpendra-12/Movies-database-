package movies.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movies.org.model.WatchedSeries;

@Repository("seriesRepository")
public interface SeriesRepository extends JpaRepository<WatchedSeries,Integer>{

}

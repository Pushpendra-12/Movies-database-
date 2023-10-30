package movies.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movies.org.model.WatchedSeries;
import movies.org.repository.SeriesRepository;

@Service("seriesService")
public class SeriesServiceImpl implements SeriesService{
	
	@Autowired
	private SeriesRepository seriesRepository;

	@Override
	public WatchedSeries addSeries(WatchedSeries series) {
		
		return seriesRepository.save(series);
	}

	@Override
	public List<WatchedSeries> viewSeries() {
		
		return seriesRepository.findAll();
	}

}

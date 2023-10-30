package movies.org.service;

import java.util.List;

import movies.org.model.WatchedSeries;

public interface SeriesService {
	public WatchedSeries addSeries(WatchedSeries series);
	public List<WatchedSeries> viewSeries();

}

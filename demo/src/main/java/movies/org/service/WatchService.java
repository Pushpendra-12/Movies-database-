package movies.org.service;

import java.util.List;

import movies.org.model.WatchList;

public interface WatchService {
	public WatchList addIntoWatchList(WatchList movies);
	public WatchList remove(Integer id);
	public List<WatchList> viewList();
	public WatchList viewById(Integer id);
}

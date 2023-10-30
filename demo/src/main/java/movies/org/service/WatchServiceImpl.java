package movies.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movies.org.model.WatchList;
import movies.org.repository.WatchListRepo;
@Service("watchService")
public class WatchServiceImpl implements WatchService{
	
	@Autowired
	private WatchListRepo watchRepository;

	@Override
	public WatchList addIntoWatchList(WatchList movies) {
		
		return watchRepository.save(movies) ;
	}

	@Override
	public List<WatchList> viewList() {
		
		return watchRepository.findAll();
	}

	@Override
	public WatchList remove(Integer id) {
		WatchList list = watchRepository.findById(id).get();
		watchRepository.deleteById(id);
		return list;
//		 Optional<WatchList> optionalWatchList = watchRepository.findById(id);
//
//	        if (optionalWatchList.isPresent()) {
//	            WatchList watchList = optionalWatchList.get();
//	            watchRepository.delete(watchList);
//	            return watchList;
//	        } else {
//	            return null; // Movie with the given ID was not found
//	        }
	    }
	

	@Override
	public WatchList viewById(Integer id) {
		// TODO Auto-generated method stub
		Optional<WatchList> opt = watchRepository.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
		
	}
	
	

}

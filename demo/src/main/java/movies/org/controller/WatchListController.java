package movies.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import movies.org.model.WatchList;
import movies.org.service.WatchService;
@Controller
@RequestMapping("/watchlist")
public class WatchListController {
	@Autowired
	private WatchService watchService;
	
	@GetMapping("/list")
	public String addIntoList(Model model) {
		WatchList list = new WatchList();
		model.addAttribute("list", list);
		return "/watchlistform";
	}
	
	@PostMapping("/addlistprocess")
	public String addListProcess(@ModelAttribute("list") WatchList list, RedirectAttributes redirectAttributes) {
		WatchList addedList = watchService.addIntoWatchList(list);
	    
	    if (addedList == null) {
	        redirectAttributes.addFlashAttribute("errorMessage", "Failed to add the movie.");
	    } else {
	        redirectAttributes.addFlashAttribute("successMessage", "movie added successfully.");
	    }
	    
	    return "redirect:/watchlist/list";

	}
	
	@GetMapping("/yourlist")
	public String yourWatchList(Model model) {
		List<WatchList> list = watchService.viewList();
		model.addAttribute("list", list);
		return "/yourwatchlist";

	}
	
 @GetMapping("/deletelist")
	public String deleteMovieFromList(@RequestParam("id") Integer Id, RedirectAttributes redirectAttributes) {
	        WatchList deleted = watchService.remove(Id);

	        if (deleted == null) {
	            redirectAttributes.addFlashAttribute("errorMessage", "Faild to delete");
	        } else {
	            redirectAttributes.addFlashAttribute("successMessage", "Movie deleted successfully.");
	        }

	        return "redirect:/watchlist/yourlist";
	    }
	
	
	
	

}

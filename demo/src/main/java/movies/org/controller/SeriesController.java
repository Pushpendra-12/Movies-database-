package movies.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import movies.org.model.WatchedSeries;
import movies.org.service.SeriesService;

@Controller
@RequestMapping("/movies")
public class SeriesController {
	
	@Autowired
	private SeriesService seriesService;
	
	@GetMapping("/addseries")
	public String addSeries(Model model) {
		WatchedSeries series = new WatchedSeries();
		model.addAttribute("series",series);
		return "/addseries";
	}
	
	@PostMapping("/addseriesprocess")
	public String addSeriesProcess(@ModelAttribute("series") WatchedSeries series, RedirectAttributes redirectAttributes) {
	    WatchedSeries addedSeries = seriesService.addSeries(series);
	    
	    if (addedSeries == null) {
	        redirectAttributes.addFlashAttribute("errorMessage", "Failed to add the series.");
	    } else {
	        redirectAttributes.addFlashAttribute("successMessage", "Series added successfully.");
	    }
	    
	    return "redirect:/movies/addseries";

	}
	
	@GetMapping("/listseries")
	public String listSeries(Model model) {
		List<WatchedSeries> list = seriesService.viewSeries();
		model.addAttribute("series",list);
		return "/listseries";
		
	}



}

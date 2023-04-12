package com.tts.MapsApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MapController {
    private final MapService mapService;
	
    public MapController(MapService mapService) {
    	this.mapService = mapService;
    }
//    @GetMapping("/home")
//    public String getDefaultMap(Model model) {
//    	Location location = new Location();
//    	location.setCity("Dallas");
//    	location.setState("Texas");
//    	mapService.addCoordinates(location);
//    	System.out.println(location);
//	    model.addAttribute(location);
//
//        return "index.html";
//    }
	@GetMapping("/home")
	public String getDefaultMap(Model model) {
	    model.addAttribute(new Location());
	    return "index.html";
	}
//	@PostMapping("/home")
//	public String getMapForLocation(Location location, Model model) {
//	    mapService.addCoordinates(location);
//	    model.addAttribute(location);
//	    return "index.html";
//	}
	@PostMapping("/home")
	public String getMapForLocation(Location location, Model model) {
	    mapService.addCoordinates(location);
	    model.addAttribute(location);
	    return "index.html";
	}
	
}
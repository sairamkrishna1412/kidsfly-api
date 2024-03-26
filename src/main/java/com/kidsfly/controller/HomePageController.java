/**
 * 
 */
package com.kidsfly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kidsfly.entity.SectionConfig;
import com.kidsfly.service.HomePageService;

@RestController
@RequestMapping("/home") // Base mapping for the controller
public class HomePageController {
	private final HomePageService homePageService;

    @Autowired
    public HomePageController(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @GetMapping("/getHomePage")
    public List<SectionConfig> getHomePage() {
        // Delegate the request to the service layer to get the home page content
        return homePageService.getHomePageContent();
    }
}
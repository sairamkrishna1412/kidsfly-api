package com.kidsfly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kidsfly.entity.SectionConfig;
import com.kidsfly.repository.SectionConfigRepository;

@Service
public class HomePageService {
	
	@Autowired
	SectionConfigRepository sectionConfigRepository;

    public List<SectionConfig> getHomePageContent() {
        // Business logic to generate home page content
        List<SectionConfig> homePageSections = sectionConfigRepository.findHomeSections();
//        List<SectionConfig> homePageSections = sectionConfigRepository.findByProductId(6);
        System.out.println(homePageSections);
        return homePageSections;
    }
}
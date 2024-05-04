package com.bondesvick.JobAppRestApi.controller;

import com.bondesvick.JobAppRestApi.model.JobPost;
import com.bondesvick.JobAppRestApi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();

    }
}

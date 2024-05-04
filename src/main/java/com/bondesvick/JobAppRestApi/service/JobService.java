package com.bondesvick.JobAppRestApi.service;

import com.bondesvick.JobAppRestApi.model.JobPost;
import com.bondesvick.JobAppRestApi.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;

    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }
}
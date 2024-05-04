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

    public JobPost getJob(int postId) {

        return repo.getJob(postId);
    }

    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }
}

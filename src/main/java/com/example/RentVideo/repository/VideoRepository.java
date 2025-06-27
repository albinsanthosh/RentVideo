package com.example.RentVideo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RentVideo.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Long>{
    
}

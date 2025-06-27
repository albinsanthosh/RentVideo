package com.example.RentVideo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RentVideo.entity.Video;
import com.example.RentVideo.exchanges.VideoDto;
import com.example.RentVideo.mapper.VideoMapper;
import com.example.RentVideo.repository.VideoRepository;
import com.example.exception.ResourceNotFoundException;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;
    
    public VideoDto createVideo(VideoDto videoDto) {

        Video video = VideoMapper.mapToVideo(videoDto);
        Video savedVideo = videoRepository.save(video);
        return VideoMapper.mapToVideoDto(savedVideo);
    }

    public VideoDto getVideoById(Long id) {
        
        Video video = videoRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Video does not exits with id: " + id));

        return VideoMapper.mapToVideoDto(video);
    }

    public List<VideoDto> getAllVideos() {
        
        List<Video> videos = videoRepository.findAll();
        return videos.stream().map((video) -> VideoMapper.mapToVideoDto(video)).collect(Collectors.toList());
    }

    public VideoDto updateVideoById(VideoDto videoDto, Long id){

        Video video = videoRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Video does not exits with id: " + id));

        video.setTitle(videoDto.getTitle());
        video.setDirector(videoDto.getDirector());
        video.setGenre(videoDto.getGenre());
        video.setAvailabilityStatus(videoDto.getAvailabilityStatus());
        Video savedVideo = videoRepository.save(video);
        
        return VideoMapper.mapToVideoDto(savedVideo);
    }

    public void deleteVideoById(Long id) {

        Video video = videoRepository
            .findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Video does not exits with id: " + id));

        videoRepository.delete(video);
    }
}

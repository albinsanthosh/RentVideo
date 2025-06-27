package com.example.RentVideo.mapper;

import com.example.RentVideo.entity.Video;
import com.example.RentVideo.exchanges.VideoDto;

public class VideoMapper {
    
    public static Video mapToVideo(VideoDto videoDto) {
        if (videoDto == null){
            return null;
        }

        Video video = new Video();
        video.setTitle(videoDto.getTitle());
        video.setDirector(videoDto.getDirector());
        video.setGenre(videoDto.getGenre());
        video.setAvailabilityStatus(videoDto.getAvailabilityStatus());
        
        return video;
    }

    public static VideoDto mapToVideoDto(Video video) {
        if (video == null){
            return null;
        }

        VideoDto videoDto = new VideoDto(
            video.getId(),
            video.getTitle(),
            video.getDirector(),
            video.getGenre(),
            video.getAvailabilityStatus()
        );

        return videoDto;
    }
}

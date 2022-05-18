package com.codeup.springblog.repositories;

import com.codeup.springblog.models.PostImages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostImagesRepository extends JpaRepository <PostImages, Long> {
}

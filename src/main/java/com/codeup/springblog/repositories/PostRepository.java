package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

//    Post getById(long id);

//    List<Post> findByTitle(String title);

//    @Query("FROM Post p WHERE p.title LIKE %?1%")
//    List<Post> searchByTitleLike(String term);

}

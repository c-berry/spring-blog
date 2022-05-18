package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "post_images")
public class PostImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String url;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public PostImages(){}

    public PostImages(long id, String image_title, String url) {
        this.id = id;
        this.title = image_title;
        this.url = url;
    }

    public PostImages(String image_title, String url) {
        this.title = image_title;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}

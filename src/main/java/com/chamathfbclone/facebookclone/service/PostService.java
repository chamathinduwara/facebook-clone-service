package com.chamathfbclone.facebookclone.service;

import com.chamathfbclone.facebookclone.model.Post;

import java.util.List;

public interface PostService {

    Post addPost(Post post) throws Exception;

    List<Post> getPost();
}

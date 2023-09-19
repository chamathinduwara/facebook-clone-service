package com.chamathfbclone.facebookclone.controller;

import com.chamathfbclone.facebookclone.model.Post;
import com.chamathfbclone.facebookclone.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


@CrossOrigin(value = "*")
@RestController
@RequestMapping("/api/v1/post")
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @PostMapping
    public Post addPost(@RequestParam Map<String , String > requestparams)
    throws Exception{
        String strPost = requestparams.get("post");
        String name = requestparams.get("name");
        String email = requestparams.get("email");
        String file = requestparams.get("file");
        String profilePic = requestparams.get("profilePic");

        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timestamp(new Date().toString())
                .build();
        post = postService.addPost(post);
        return post;
    }

    @GetMapping
    public List<Post> getPost(){
        return postService.getPost();
    }
}

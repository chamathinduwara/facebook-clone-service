package com.chamathfbclone.facebookclone.service;

import com.chamathfbclone.facebookclone.entity.PostEntity;
import com.chamathfbclone.facebookclone.model.Post;
import com.chamathfbclone.facebookclone.repository.PostEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostEntityRepository postEntityRepository;
    @Override
    public Post addPost(Post post) throws Exception {
        try{
            PostEntity postEntity = new PostEntity();
            BeanUtils.copyProperties(post, postEntity);
            if (post.getFile() != null && !post.getFile().equalsIgnoreCase("null")){
                postEntity.setImage(post.getFile());
            }else {
                postEntity.setImage(null);
            }
            postEntity = postEntityRepository.save(postEntity);

            post.setId(postEntity.getId());
            post.setFile(null);
            post.setImage(postEntity.getImage());

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return post;
    }

    @Override
    public List<Post> getPost() {
        List<PostEntity> postEntityList = postEntityRepository.findAll();

        List<Post> posts;

        posts = postEntityList.stream()
                .map(postEntity -> Post.builder()
                        .id(postEntity.getId())
                        .post(postEntity.getPost())
                        .name(postEntity.getName())
                        .email(postEntity.getEmail())
                        .image(postEntity.getImage())
                        .profilePic(postEntity.getProfilePic())
                        .timestamp(postEntity.getTimestamp())
                        .imageName(postEntity.getImageName())
                        .build()).collect(Collectors.toList());
        return posts;
    }
}

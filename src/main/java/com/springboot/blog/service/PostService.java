package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostReponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostReponse getAllPosts(int pageNo, int pageSize);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}

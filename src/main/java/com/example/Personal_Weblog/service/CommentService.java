package com.example.Personal_Weblog.service;

import com.example.Personal_Weblog.model.Comment;
import com.example.Personal_Weblog.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }

    public void deleteById(Long blogId){
        commentRepository.deleteById(blogId);
    }
}

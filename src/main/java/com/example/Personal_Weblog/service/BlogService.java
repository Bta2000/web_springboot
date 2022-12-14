package com.example.Personal_Weblog.service;

import com.example.Personal_Weblog.model.Blog;
import com.example.Personal_Weblog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }

    public List<Blog> getAll(){
        return blogRepository.getAllByOrderByIdDesc();
    }

    public List<Blog> getAllFirstNCharacters(int numOfCharacters){
        return getAll().stream()
                .map(blog -> {
                            blog.setContent(blog.getContent().substring(0, Math.min(blog.getContent().length(), numOfCharacters)));
                            return blog;
                        }
                )
                .collect(Collectors.toList());
    }

    public void deleteBlog(Blog blog) {
        blogRepository.delete(blog);
    }
}

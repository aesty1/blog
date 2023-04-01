package dev.aesty.blog;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> allPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> singlePost(ObjectId id) {
        return postRepository.findById(id);
    }
}

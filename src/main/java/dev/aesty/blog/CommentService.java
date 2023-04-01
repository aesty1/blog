package dev.aesty.blog;

import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public void addComment(ObjectId postId, String comment) {
        Document filter = new Document("_id", postId);
        Document newComment = new Document("content", comment);
        Document update = new Document("$push", new Document("comments", newComment));

        commentRepository.insert(newComment);
    }
}

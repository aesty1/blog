package dev.aesty.blog;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends MongoRepository<Post, ObjectId> {
}

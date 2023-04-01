package dev.aesty.blog;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    private ObjectId id;
    private String title;
    private String date;
    private String time;
    private List<String> tags;
    private String content;
    private List<Object> comments;
}

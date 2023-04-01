package dev.aesty.blog;

import com.mongodb.client.FindIterable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Comment {
    private String id;
    private String author;
    private String date;
    private String time;
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}

package dev.aesty.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comments")

public class CommentController {
    @Autowired
    private CommentService commentService;
//    //@PostMapping
//    //public Comment addComment(@RequestBody Comment comment) {
//    //    // добавить комментарий в базу данных и вернуть сохраненный объект
//    //    return commentService.save(comment);
//    //}
//
//
//
    @PostMapping("/{postId}")
    public void myEndPoint() {
        Comment comment = new Comment();
        comment.setContent("The comment");

        String content = comment.getContent();

        commentService.addComment("1680124949", content);
    }
}

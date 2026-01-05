package org.example.services;

import java.util.logging.Logger;
import org.example.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
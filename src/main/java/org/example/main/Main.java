package org.example.main;


import org.example.configuration.ProjectConfig;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("CommentService 건드리기 전!!!");
        var service = c.getBean(CommentService.class);
        System.out.println("CommentService 건드린 후!!!");
    }
}
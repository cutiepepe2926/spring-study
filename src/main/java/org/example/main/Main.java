package org.example.main;

import java.util.function.Supplier;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = new Parrot();
        p.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> p;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot x = context.getBean(Parrot.class);
        System.out.println(x.getName());
    }
}
package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p = context.getBean(Parrot.class);
        Parrot p = context.getBean("parrot2",Parrot.class);
        System.out.println(p.getName());
        Parrot p2 = context.getBean("Riko",Parrot.class);
        System.out.println(p2.getName());
        Parrot p3 = context.getBean(Parrot.class);
        System.out.println(p3.getName());

        String s = context.getBean(String.class);
        System.out.println(s);
        Integer i = context.getBean(Integer.class);
        System.out.println(i);
//        Character c = context.getBean(Character.class);
//        System.out.println(c);
    }
}
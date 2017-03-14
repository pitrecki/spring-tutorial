package org.pitrecki.spring_learnining;

import org.pitrecki.spring_learnining.r1.knights.Knight;
import org.pitrecki.spring_learnining.r1.knights.KnightConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App
{

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfiguration.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        ((AnnotationConfigApplicationContext) context).close();
    }
}

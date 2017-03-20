package org.pitrecki.spring_learnining.r4.withoutaround;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-19.
 */
public class App
{
    private final static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Performance performance = applicationContext.getBean(Performance.class);
        performance.perform();
    }
}

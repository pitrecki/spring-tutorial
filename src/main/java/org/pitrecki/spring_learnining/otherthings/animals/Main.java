package org.pitrecki.spring_learnining.otherthings.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-17.
 */
class Main
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnimalConfig.class);
        Animal animal = applicationContext.getBean(Animal.class);
        animal.doNoise();
    }
}

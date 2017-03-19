package org.pitrecki.spring_learnining.otherthings.animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-17.
 */
@Component
class Dog implements  Animal
{
    private final Logger logger = LogManager.getLogger(Dog.class);
    private final String name;

    @Autowired
    public Dog(@Qualifier(value = "dogName") String name) {
        this.name = name;
    }
    

    @Override
    public void doNoise() {
        logger.info(name + " is barking");
    }
}

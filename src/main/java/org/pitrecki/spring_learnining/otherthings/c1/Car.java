package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Component
class Car implements Vehicle
{
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
    private Color color;

    @Autowired
    public Car(@Qualifier("redColor")Color color) {
        this.color = color;
    }

    @Override
    public void drive() {
        logger.info("Jedzie samochod w kolorze " + color.getColor());
        logger.info("Brummm, Brummm");
    }
}

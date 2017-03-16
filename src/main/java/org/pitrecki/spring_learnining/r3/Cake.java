package org.pitrecki.spring_learnining.r3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Component
@Primary
public class Cake implements  Dessert
{
    private Dessert dessert;

    @Override
    public void setDesser(Dessert dessert) {
        this.dessert = dessert;
    }
}

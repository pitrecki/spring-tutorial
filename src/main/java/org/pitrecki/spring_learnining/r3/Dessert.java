package org.pitrecki.spring_learnining.r3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
public interface Dessert
{
    @Autowired
    void setDesser(Dessert dessert);
}

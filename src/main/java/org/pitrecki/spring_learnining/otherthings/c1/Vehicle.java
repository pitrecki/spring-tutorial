package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
interface Vehicle
{
    @Autowired
    void drive();
}

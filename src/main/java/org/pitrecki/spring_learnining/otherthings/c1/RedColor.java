package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.stereotype.Component;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Component
class RedColor implements Color
{

    public RedColor() {
    }

    @Override
    public String getColor() {
        return "czerowny";
    }
}

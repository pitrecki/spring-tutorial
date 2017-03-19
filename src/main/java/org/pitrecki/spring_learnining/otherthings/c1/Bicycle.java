package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Component
class Bicycle
{

    private Color color;

    @Autowired
    @Qualifier("yellowColor")
    void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle w kolorze " + color.getColor();
    }
}

package org.pitrecki.spring_learnining.r3;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
public class IceCream implements Dessert
{
    private Dessert dessert;

    @Override
    public void setDesser(Dessert dessert) {
        this.dessert = dessert;
    }
}

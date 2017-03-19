package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
class App
{
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        vehicle.drive();

        System.out.println("\n");
        Bicycle bicycle = applicationContext.getBean(Bicycle.class);
        System.out.println(bicycle.toString());
        
    }
}

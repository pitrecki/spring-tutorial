package org.pitrecki.spring_learnining.otherthings.c1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-16.
 */
@Configuration
@ComponentScan(basePackageClasses = Vehicle.class)
class VehicleConfig
{
    @Bean
    Color yellowColor() {
        return new YellowColor();
    }
}



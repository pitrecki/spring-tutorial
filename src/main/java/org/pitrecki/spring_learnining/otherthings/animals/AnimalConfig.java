package org.pitrecki.spring_learnining.otherthings.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-17.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:/")
class AnimalConfig
{
    @Autowired
    private Environment environment;

    @Bean(name = "dogName")
    String getName() {
        return environment.getProperty("dog.name", "Azor");
    }

    @Bean(name = "humanName")
    String anotherName() {
        return "Piotr";
    }
    
}

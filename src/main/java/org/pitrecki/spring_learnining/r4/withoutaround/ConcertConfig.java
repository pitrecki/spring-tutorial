package org.pitrecki.spring_learnining.r4.withoutaround;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-19.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConcertConfig
{
    @Bean
    Audience audience() {
        return new Audience();
    }
}

package org.pitrecki.spring_learnining.r2.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-13.
 */
@Configuration
@ComponentScan(basePackageClasses = CompactDisc.class)
//You can specify componets to scan by enter package classes or package name
public class CDPlayerConfig
{
}

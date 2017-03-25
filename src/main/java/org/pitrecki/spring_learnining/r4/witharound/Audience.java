package org.pitrecki.spring_learnining.r4.witharound;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-19.
 */
@Aspect
public class Audience
{
    private final Logger logger = LogManager.getLogger();

    @Pointcut("execution(* org.pitrecki.spring_learnining.r4.witharound.Performance.perform(..)) && bean(concert)")
    public void performance() {
    }

    @Around("performance()")
    public void watchPerfomance(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Silencing cell phones");
            logger.info("Taking seats");
            joinPoint.proceed();
            logger.info("CLAP CLAP CLAP!!");
        } catch (Throwable throwable) {
            logger.info("Demanding refund");
        }
    }


}

package org.pitrecki.spring_learnining.r4.withoutaround;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.*;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-19.
 */
@Aspect
public class Audience
{
    private final Logger logger = LogManager.getLogger();

    @Pointcut("execution(* org.pitrecki.spring_learnining.r4.withoutaround.Performance.perform(..)) && bean(concert)")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhonse() {
        logger.info("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        logger.info("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        logger.info("CLAP CLAP CLAP!!!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        logger.info("Demanding a refund");
    }


}

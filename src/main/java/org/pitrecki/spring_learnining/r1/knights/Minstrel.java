package org.pitrecki.spring_learnining.r1.knights;

import org.apache.logging.log4j.Logger;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
public class Minstrel
{
    private Logger logger;

    public Minstrel(Logger logger) {
        this.logger = logger;
    }

    public void singBeforeQuest() {
        logger.info("Fa la la " + Knight.class.getSimpleName() + " is so brave!");
    }

    public void singAfterQuest() {
        logger.info("Tee hee hee, the brave knight did embark on a quest.");
    }
}

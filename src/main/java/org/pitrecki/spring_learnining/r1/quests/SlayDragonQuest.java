package org.pitrecki.spring_learnining.r1.quests;

import java.util.logging.Logger;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
public class SlayDragonQuest implements Quest
{
    Logger logger;

    public SlayDragonQuest(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void embark() {
        logger.info("Embarking on quest to slay dragon!");
    }
}

package org.pitrecki.spring_learnining.r1.knights;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pitrecki.spring_learnining.r1.quests.Quest;
import org.pitrecki.spring_learnining.r1.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
@Configuration
public class KnightConfiguration
{
    private final Logger logger = LogManager.getLogger();

    @Bean
    public Knight knight() {
        return new BraveKinght(quest(), minstrel());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(logger);
    }

    @Bean
    public  Minstrel minstrel() {
        return new Minstrel(logger);
    }
}

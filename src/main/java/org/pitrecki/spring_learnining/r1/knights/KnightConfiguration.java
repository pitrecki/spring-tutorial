package org.pitrecki.spring_learnining.r1.knights;

import org.pitrecki.spring_learnining.r1.quests.Quest;
import org.pitrecki.spring_learnining.r1.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
@Configuration
public class KnightConfiguration
{
    @Bean
    public Knight knight() {
        return new BraveKinght(quest(), minstrel());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(Logger.getGlobal());
    }

    @Bean
    public  Minstrel minstrel() {
        return new Minstrel(Logger.getAnonymousLogger());
    }
}

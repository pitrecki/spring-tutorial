package org.pitrecki.spring_learnining.r2.soundsystem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;



/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-13.
 */
@Component("lonelyHeartClub")
public class SgtPeppers implements CompactDisc
{
    private final Logger logger = LogManager.getLogger();

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    @Override
    public void play() {
        logger.info("Playing" + title  + " by " + artist);
    }
}

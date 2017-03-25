package org.pitrecki.spring_learnining.r4.handlingaspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-25.
 */
class SgtPeppers extends BlankDisc implements CompactDisc
{
    private final Logger logger = LogManager.getLogger();

    public SgtPeppers() {
    }

    @Override
    public void playTrack(int trackNumber) {

    }
}

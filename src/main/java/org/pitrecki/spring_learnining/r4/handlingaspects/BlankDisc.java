package org.pitrecki.spring_learnining.r4.handlingaspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-25.
 */
class BlankDisc implements CompactDisc
{
    private final Logger logger = LogManager.getLogger();

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int trackNumber) {
        logger.info("Current play is" + artist + " album" + title +  " track "+ tracks.get(trackNumber) + " track number " + trackNumber);
    }
}

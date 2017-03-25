package org.pitrecki.spring_learnining.r4.handlingaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-25.
 */
@Aspect
class TrackCounter
{
    private Map<Integer, Integer> trackCounts;

    public TrackCounter() {
        this.trackCounts = new HashMap<>();
    }

    @Pointcut("execution(* CompactDisc.playTrack(int)) && args(trackNumber)" )
    public void trackPlayed(int trackNumber) {}

    public void countTrack(int trackNumber) {
        int currentTrack = getPlayTrack(trackNumber);
        trackCounts.put(trackNumber, currentTrack);
    }

    public int getPlayTrack(int trackNumber) {
        return trackCounts.getOrDefault(trackNumber, 0);
    }
}

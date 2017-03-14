package org.pitrecki.spring_learnining.r1.knights;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.pitrecki.spring_learnining.r1.quests.Quest;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
public class BraveKinghtTest
{
    private Knight knight;
    @Mock private Minstrel minstrel;
    @Mock private Quest quest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        knight = new BraveKinght(quest, minstrel);
    }

    @Test
    public void testBraveKnightShouldEmbarkOnAnyQuest() {
        knight.embarkOnQuest();
        Mockito.verify(quest, Mockito.times(1)).embark();
    }
}
package org.pitrecki.spring_learnining.r4.handlingaspects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest
{
    
    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTracksCounter() throws Exception {
        for (int i = 0; i < 5; i++)
            cd.playTrack(i);

        assertSoftly(softly -> {
            assertThat(trackCounter.getPlayTrack(2)).isEqualTo(1);
            assertThat(trackCounter.getPlayTrack(1)).isEqualTo(1);
            assertThat(trackCounter.getPlayTrack(3)).isEqualTo(4);
            assertThat(trackCounter.getPlayTrack(4)).isEqualTo(0);
            assertThat(trackCounter.getPlayTrack(5)).isEqualTo(0);
        });
    }
}

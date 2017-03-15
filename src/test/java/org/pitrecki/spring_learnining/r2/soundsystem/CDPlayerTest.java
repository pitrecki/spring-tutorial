package org.pitrecki.spring_learnining.r2.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-13.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest
{
    //private LoggerContext logger = LogManager.getContext(false);
    @Rule
    public SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void testCDShouldNotBeNull() {
        assertThat(compactDisc).isNotNull();
    }

    @Test
    public void testMediaPlayerShouldPlaySeargentPepperSong() throws Exception {
        mediaPlayer.play();
        String expected = "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles";
        assertThat(systemOutRule.getLog()).isEqualTo(expected);
    }
}
package org.pitrecki.spring_learnining.r2.soundsystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-13.
 */
@ContextConfiguration(classes = CDPlayerConfig.class)
class CDPlayerTest
{
    @Autowired
    private CompactDisc compactDisc;


    @Test
    void testCDShouldNotNull() {
        assertThat(compactDisc).isNotNull();
    }
}
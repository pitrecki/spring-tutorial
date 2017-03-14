package org.pitrecki.spring_learnining.r1.knights;

import org.pitrecki.spring_learnining.r1.quests.Quest;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-12.
 */
public class BraveKinght implements Knight
{
    private Quest quest;
    private Minstrel minstrel;

    public BraveKinght(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}

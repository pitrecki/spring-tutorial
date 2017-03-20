package org.pitrecki.spring_learnining.r4.withoutaround;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-20.
 */
@Component
public class Concert implements Performance
{
    private Audience audience;

    @Autowired
    public Concert(Audience audience) {
        this.audience = audience;
    }

    @Override
    public void perform() {
        audience.performance();
    }

}

package com.kristich.story.model;

import com.kristich.story.R;

/**
 * Created by Kristich on 5/17/16.
 */
public class Story {

    private Page[] pages;


    public Story () {

        pages = new Page[7];

        pages[0] = new Page();

        pages[0].setImageId(R.drawable.page0);

        pages[0].setText("test");

        pages[0].setChoice1(new Choice());

        pages[0].setChoice2(new Choice());

    }

}

package com.kristich.story.model;

/**
 * Created by Kristich on 5/17/16.
 */
public class Choice {

    private String text;

    private int nextPage;



    public Choice (String mText, int mNextPage) {

        text = mText;

        nextPage = mNextPage;

    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}

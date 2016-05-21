package com.kristich.story.model;

/**
 * Created by Kristich on 5/17/16.
 */
public class Page {

    private int imageId;

    private String text;

    private Choice choice1;

    private Choice choice2;

    private boolean isFinal = false;



    public Page (int mImageId, String mText, Choice mChoice1, Choice mChoice2) {

        imageId = mImageId;

        text = mText;

        choice1 = mChoice1;

        choice2 = mChoice2;

    }




    public Page (int mImageId, String mText) {

        imageId = mImageId;

        text = mText;

        choice1 = null;

        choice2 = null;

        isFinal = true;

    }



    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
}

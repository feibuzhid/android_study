package com.example.helloworld.bean;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import com.example.helloworld.R;

import java.util.Objects;

/**
 * @author fei
 * @since 2023/10/6
 */

public class ListPatternBase {

    private String textMessage1;
    private int image = R.drawable.car;
    private Drawable drawableImage;

    public ListPatternBase(String textMessage, int image) {
        this.textMessage1 = textMessage;
        this.image = image;
    }

    public ListPatternBase(String textMessage, Drawable drawableImage) {
        this.textMessage1 = textMessage;
        this.drawableImage = drawableImage;
    }

    public String getTextMessage1() {
        return textMessage1;
    }

    public void setTextMessage1(String textMessage1) {
        this.textMessage1 = textMessage1;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Drawable getDrawableImage() {
        return drawableImage;
    }

    public void setDrawableImage(Drawable drawableImage) {
        this.drawableImage = drawableImage;
    }


}

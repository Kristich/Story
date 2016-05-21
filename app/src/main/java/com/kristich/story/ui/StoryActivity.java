package com.kristich.story.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kristich.story.R;
import com.kristich.story.model.Page;

public class StoryActivity extends AppCompatActivity {


    public  static final String TAG = StoryActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.name_key));

        if (name == null) {

            name = "Friend";

        }

        Log.d(TAG, name);



    }
}

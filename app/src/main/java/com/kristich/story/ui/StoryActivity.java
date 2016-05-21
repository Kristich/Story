package com.kristich.story.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kristich.story.R;
import com.kristich.story.model.Page;
import com.kristich.story.model.Story;

public class StoryActivity extends AppCompatActivity {


    public  static final String TAG = StoryActivity.class.getSimpleName();



    private Story story = new Story();

    private ImageView imageView;

    private TextView textView;

    private Button choice1;

    private Button choice2;

    private String name;

    private Page currentPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        Intent intent = getIntent();
        name = intent.getStringExtra(getString(R.string.name_key));

        if (name == null) {

            name = "Friend";

        }

        Log.d(TAG, name);


        imageView = (ImageView) findViewById(R.id.storyImageView);

        textView = (TextView) findViewById(R.id.storyText);

        choice1 = (Button) findViewById(R.id.choiceButton1);

        choice2 = (Button) findViewById(R.id.choiceButton2);


        loadPage(0);


    }



    private void loadPage(int choice) {

        currentPage = story.getPage(choice);


        Drawable drawable = getResources().getDrawable(currentPage.getImageId());

        imageView.setImageDrawable(drawable);


        String pageText = currentPage.getText();
        pageText = String.format(pageText, name);


        textView.setText(pageText);


        if (currentPage.isFinal()) {


            choice1.setVisibility(View.INVISIBLE);
            choice2.setText("Play Again");

            choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    finish();

                }
            });


        } else {


                choice1.setText(currentPage.getChoice1().getText());

                choice2.setText(currentPage.getChoice2().getText());



                choice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int nextPage = currentPage.getChoice1().getNextPage();
                        loadPage(nextPage);

                    }
                });



                choice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int nextPage = currentPage.getChoice2().getNextPage();
                        loadPage(nextPage);

                    }
                });


        }

    }


    @Override
    protected void onResume() {
        super.onResume();


        View decorView = getWindow().getDecorView();
// Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
// Remember that you should never show the action bar if the
// status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }
}

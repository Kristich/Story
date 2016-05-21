package com.kristich.story.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kristich.story.R;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.nameEditText);

        startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();


                if (name.isEmpty()) {

                    Toast.makeText(MainActivity.this, "Please enter your name!", Toast.LENGTH_LONG).show();



                } else {

                    startStory(name);

                }




            }
        });



    }


    private void startStory (String name) {

        Intent intent = new Intent(this, StoryActivity.class);

        intent.putExtra(getString(R.string.name_key), name);

        startActivity(intent);

    }
}

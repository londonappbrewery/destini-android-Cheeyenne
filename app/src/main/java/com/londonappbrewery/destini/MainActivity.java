package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button topButton;
    private Button bottomButton;
    private int storyIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIndex) {
                    case 1:
                        storyTextView.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        storyIndex = 3;
                        break;
                    case 2:
                        storyTextView.setText(R.string.T3_Story);
                        topButton.setText(R.string.T3_Ans1);
                        bottomButton.setText(R.string.T3_Ans2);
                        storyIndex = 3;
                        break;
                    case 3:
                        storyTextView.setText(R.string.T6_End);
                        topButton.setVisibility(View.INVISIBLE);
                        bottomButton.setVisibility(View.INVISIBLE);
                        storyIndex = 6;
                        break;
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (storyIndex) {
                    case 1:
                        storyTextView.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        bottomButton.setText(R.string.T2_Ans2);
                        storyIndex = 2;
                        break;
                    case 2:
                        storyTextView.setText(R.string.T4_End);
                        topButton.setVisibility(View.INVISIBLE);
                        bottomButton.setVisibility(View.INVISIBLE);
                        storyIndex = 4;
                        break;
                    case 3:
                        storyTextView.setText(R.string.T5_End);
                        topButton.setVisibility(View.INVISIBLE);
                        bottomButton.setVisibility(View.INVISIBLE);
                        storyIndex = 5;
                        break;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}

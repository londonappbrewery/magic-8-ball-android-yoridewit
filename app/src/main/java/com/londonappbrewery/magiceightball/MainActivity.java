package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAsk = (Button) findViewById(R.id.buttonAsk);
        final ImageView imgBall = (ImageView) findViewById(R.id.imgBall);
        final int randImg[] = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randNumbGen = new Random();
                imgBall.setImageResource(randImg[randNumbGen.nextInt(5)]);

            }
        });
    }
}

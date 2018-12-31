package com.basics.android.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView d1;

    public ImageView d2;

    public Button btn;
    public Random randomGenerator = new Random();

//    public MainActivity(Button btn) {
//        this.btn = btn;
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1);
        d2 = findViewById(R.id.img3);

        d1 = findViewById(R.id.img1);
        //d2 = findViewById(R.id.img2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result1 = randomGenerator.nextInt(6) + 1;
                switch (result1) {
                    case 1:
                        d1.setImageResource(R.drawable.dice1);

                //d2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        d1.setImageResource(R.drawable.dice2);
                //d2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        d1.setImageResource(R.drawable.dice3);
                //d2.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        d1.setImageResource(R.drawable.dice4);
                //d2.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        d1.setImageResource(R.drawable.dice5);
                //d2.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        d1.setImageResource(R.drawable.dice6);
                //d2.setImageResource(R.drawable.dice6);
                        break;

                }

                int result2 = randomGenerator.nextInt(6)+1;
                switch(result2){
                    case 1:
                    d2.setImageResource(R.drawable.dice1);
                    break;
                    case 2:
                        d2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        d2.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        d2.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        d2.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        d2.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });

    }
    }
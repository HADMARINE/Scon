package com.example.scon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1,button2;
    private ImageView img_01,img_02,img_03,img_04;
    private int imageIndex =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img_01 = findViewById(R.id.image_01);
        img_02 = findViewById(R.id.image_02);
        img_03 = findViewById(R.id.image_03);
        img_04 = findViewById(R.id.image_04);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageIndex--;
                switch (imageIndex){
                    case 1:
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.VISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        img_01.setVisibility(View.INVISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.VISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        img_01.setVisibility(View.INVISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.VISIBLE);
                        img_04.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    default:
                        imageIndex =4;
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                }



            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageIndex++;
                switch (imageIndex){
                    case 1:
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.VISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        img_01.setVisibility(View.INVISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.VISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        img_01.setVisibility(View.INVISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.VISIBLE);
                        img_04.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.INVISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                    default:
                        imageIndex =1;
                        img_01.setVisibility(View.VISIBLE);
                        img_02.setVisibility(View.VISIBLE);
                        img_03.setVisibility(View.INVISIBLE);
                        img_04.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });



    }
}
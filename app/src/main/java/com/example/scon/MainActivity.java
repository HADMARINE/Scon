package com.example.scon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

//20620 이예찬

public class MainActivity extends AppCompatActivity {

    private Button bt_1,bt_2;
    private EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_1 = findViewById(R.id.BT_1);
        bt_2 = findViewById(R.id.BT_2);
        et = findViewById(R.id.ET);

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String asd = et.getText().toString();

                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+asd));
                startActivity(intent1);
            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),MenuActivity.class);

                intent2.putExtra("name","sunrin");
                startActivity(intent2);
                finish();
            }
        });






    }


}
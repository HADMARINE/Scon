package com.example.scon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1,tv2,tv3;
    private Button bt1,bt2,bt3,bt4;
    private CheckBox check1,check2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        bt1 = findViewById(R.id.bt_1);
        bt2 = findViewById(R.id.bt_2);
        bt3 = findViewById(R.id.bt_3);
        bt4 = findViewById(R.id.bt_4);
        check1 = findViewById(R.id.check_1);
        check2 = findViewById(R.id.check_2);





        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setVisibility(View.INVISIBLE);
                if (check1.isChecked()){
                    tv1.setVisibility(View.VISIBLE);
                }else{
                    tv1.setVisibility(View.GONE);
                }
                if (check2.isChecked()){
                    tv2.setVisibility(View.VISIBLE);
                }else{
                    tv2.setVisibility(View.GONE);
                }

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1.setChecked(true);
                check2.setChecked(true);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1.setChecked(false);
                check2.setChecked(false);
            }
        });


        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check1.toggle();
                check2.toggle();
            }
        });

    }

    public void onCheckBoxClicked(View view){
        switch (view.getId()) {
            case R.id.check_1:
                if (check1.isChecked()) {
                    Toast.makeText(this, "체크박스1이 체크되었습니다", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "체크박스1가 해제되었습니다", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.check_2:

                if (check2.isChecked()) {
                    Toast.makeText(this, "체크박스2이 체크되었습니다", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, "체크박스2가 해제되었습니다", Toast.LENGTH_SHORT).show();
                }
        }
    }


}
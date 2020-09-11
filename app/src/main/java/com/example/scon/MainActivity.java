package com.example.scon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

//20620 이예찬

public class MainActivity extends AppCompatActivity {


    private Switch check;
    private CheckBox checkBox_1,checkBox_2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = findViewById(R.id.check);
        checkBox_1 = findViewById(R.id.checkbox_1);
        checkBox_2 = findViewById(R.id.checkbox_2);

        




    }

    public void onClickChecked(View view){
        switch (view.getId()){
            case R.id.check:
                if (check.isChecked()){
                    Toast.makeText(this, "알람이 설정되었습니다", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "알람이 울리지 않습니다", Toast.LENGTH_SHORT).show();

                }

    
                break;
            case R.id.checkbox_1:
                if (checkBox_1.isChecked()){
                    Toast.makeText(this, "알람을 반복합니다", Toast.LENGTH_SHORT).show();
                    
                }else{
                    Toast.makeText(this, "반복설정이 해제되었습니다", Toast.LENGTH_SHORT).show();
                    
                }
                break;
            case R.id.checkbox_2:
                if (checkBox_2.isChecked()){
                    Toast.makeText(this, "진동을 설정합니다", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "진동이 해제되었습니다", Toast.LENGTH_SHORT).show();

                }
                break;

        }
    }


}
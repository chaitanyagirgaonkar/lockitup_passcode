package com.example.lockitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class unlock_app extends AppCompatActivity {
    public static String PREFS_NAME="MyPrefsFile";
    View view_01,view_02,view_03,view_04,view_05,view_06;
    public static String  unlockPassCode ="";
    private String text_pass ;
    String num_01,num_02,num_03,num_04,num_05,num_06;
    ArrayList<String> numbers_list = new ArrayList<>();
    TextView textView5;
    public String password;
    String new_unlock_pass = save_lock_screen.save_screen_passCode;
    androidx.appcompat.widget.AppCompatButton btn_01,btn_02,btn_03,btn_04,btn_05,btn_06,btn_07,btn_08,btn_09,btn_00,btn_clear;
    androidx.appcompat.widget.AppCompatButton create_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock_app);
        initializeComponents();



        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("1");
                passNumber(numbers_list);
            }
        });
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("2");
                passNumber(numbers_list);
            }
        });
        btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("3");
                passNumber(numbers_list);
            }
        });
        btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("4");
                passNumber(numbers_list);
            }
        });
        btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("5");
                passNumber(numbers_list);
            }
        });
        btn_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("6");
                passNumber(numbers_list);
            }
        });
        btn_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("7");
                passNumber(numbers_list);
            }
        });
        btn_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("8");
                passNumber(numbers_list);
            }
        });
        btn_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("9");
                passNumber(numbers_list);
            }
        });
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.add("0");
                passNumber(numbers_list);
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numbers_list.clear();
                passNumber(numbers_list);
            }
        });


        create_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences getpref = getSharedPreferences("password",MODE_PRIVATE);
                password = getpref.getString("pass","");
                if(unlockPassCode.equals(password)) {

                    Toast.makeText(unlock_app.this, "hua"+password+"jjd"+unlockPassCode, Toast.LENGTH_SHORT).show();
                    Intent unlock = new Intent(unlock_app.this, MainActivity.class);
                    startActivity(unlock);
                    finish();

                }
                else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            textView5.setText("Try Again...");
                        }
                    },2000);

                    Toast.makeText(unlock_app.this, "nahi hua"+password+"jjd"+unlockPassCode, Toast.LENGTH_SHORT).show();
                }
                }


        });



    }
    private void initializeComponents() {
        view_01 =findViewById(R.id.view_01);
        view_02 =findViewById(R.id.view_02);
        view_03 =findViewById(R.id.view_03);
        view_04 =findViewById(R.id.view_04);
        view_05 =findViewById(R.id.view_05);
        view_06 =findViewById(R.id.view_06);

        btn_01 = findViewById(R.id.btn_01);
        btn_02 = findViewById(R.id.btn_02);
        btn_03 = findViewById(R.id.btn_03);
        btn_04 = findViewById(R.id.btn_04);
        btn_05 = findViewById(R.id.btn_05);
        btn_06 = findViewById(R.id.btn_06);
        btn_07 = findViewById(R.id.btn_07);
        btn_08 = findViewById(R.id.btn_08);
        btn_09 = findViewById(R.id.btn_09);
        btn_00 = findViewById(R.id.btn_00);
        btn_clear = findViewById(R.id.btn_clear);

        create_btn = findViewById(R.id.create_btn);
        textView5 = findViewById(R.id.textView5);



    }
    private void passNumber(ArrayList<String> numbers_list) {
        if(numbers_list.size() !=0){
            switch(numbers_list.size()){
                case 1:
                    num_01 = numbers_list.get(0);
                    view_01.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    break;
                case 2:
                    num_02 = numbers_list.get(1);
                    view_02.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    break;
                case 3:
                    num_03 = numbers_list.get(2);
                    view_03.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    break;
                case 4:
                    num_04 = numbers_list.get(3);
                    view_04.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    break;
                case 5:
                    num_05 = numbers_list.get(4);
                    view_05.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    break;
                case 6:
                    num_06 = numbers_list.get(5);
                    view_06.setBackgroundResource(R.drawable.bg_view_gray_oval);
                    unlockPassCode = num_01+num_02+num_03+num_04+num_05+num_06;
                    break;

            }
        }
        else{
            view_01.setBackground(null);
            view_02.setBackground(null);
            view_03.setBackground(null);
            view_04.setBackground(null);
            view_05.setBackground(null);
            view_06.setBackground(null);

        }
    }
}
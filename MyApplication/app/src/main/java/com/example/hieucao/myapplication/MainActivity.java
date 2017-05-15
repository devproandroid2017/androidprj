package com.example.hieucao.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    Button btnCancel;
    EditText txtUserName;
    EditText txtUserId;
    Button btnSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int userId = getIntent().getIntExtra("userid",0);
        String userName = getIntent().getStringExtra("username");

//        btnSubmit =(Button) findViewById(R.id.btnSubmit);
//        btnSubmit.setOnClickListener(btnClick);
//
//        btnCancel =(Button) findViewById(R.id.btnCancel);
//        btnCancel.setOnClickListener(btnClick);
//
        txtUserName = (EditText) findViewById(R.id.txtMainUserName);
        txtUserId = (EditText) findViewById(R.id.txtMainUserId);
        btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(btnClick);

        txtUserName.setText(userName);
        txtUserId.setText(Integer.toString(userId));
    }

    //UI
    //UX

    View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.btnSubmit) {
                Log.d("MainActivity", "Button submit click!");
                txtUserName.setText("Submit");
            }else if(view.getId() == R.id.btnCancel){
                Log.d("MainActivity","Button cancel click!");
                txtUserId.setText("Cancel");
            }else if(view.getId() == R.id.btnSetting){
                //Chuyen sang man hinh setting
                Intent intent = new Intent(MainActivity.this,SettingActivity.class);
                MainActivity.this.startActivity(intent);
            }
        }
    };

    @Override
    protected void onStart() {
        Log.d("MainActivity","onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("MainActivity","onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity","onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.d("MainActivity","onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity","onStop");
        super.onStop();
    }
}

package com.example.hieucao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    Button btnCancel;
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnSubmit =(Button) findViewById(R.id.btnSubmit);
//        btnSubmit.setOnClickListener(btnClick);
//
//        btnCancel =(Button) findViewById(R.id.btnCancel);
//        btnCancel.setOnClickListener(btnClick);
//
//        txtName = (TextView) findViewById(R.id.editText);
    }

    //UI
    //UX

    View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.btnSubmit) {
                Log.d("MainActivity", "Button submit click!");
                txtName.setText("Submit");
            }else if(view.getId() == R.id.btnCancel){
                Log.d("MainActivity","Button cancel click!");
                txtName.setText("Cancel");
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

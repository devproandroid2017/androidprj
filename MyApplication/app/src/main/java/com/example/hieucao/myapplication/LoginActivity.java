package com.example.hieucao.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hieucao on 5/8/17.
 */

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtName;
    EditText txtPassword;
    TextView txtErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set layout
        setContentView(R.layout.activity_login);
        //connect to component
        btnLogin = (Button)findViewById(R.id.login_btnLogin);
        txtName = (EditText) findViewById(R.id.login_txtName);
        txtPassword = (EditText) findViewById(R.id.login_txtPassword);
        txtErrorMessage = (TextView) findViewById(R.id.login_txtErrorMessage);

        //event handle
        btnLogin.setOnClickListener(onClickListener);
//        LoginActivity.this.startActivity(null);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.equals(btnLogin)){
                //do something
                //check user/pass
                if("hieu".equals(txtName.getText().toString())){
                    //chuyen sang screen main
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(intent);
                    //startActivity(intent);
                }else {
                    //khong chuyen trang

                    //hien message loi
                    txtErrorMessage.setVisibility(View.VISIBLE);
                }
            }
        }
//        public void startActivity(Intent intent){
//            Log.d("listener","test");
//        }
    };
}

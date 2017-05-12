package com.example.hieucao.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by hieucao on 5/12/17.
 */

public class SettingActivity extends Activity {
    TextView txtTitle;
    Switch swLanguage;
    CheckBox checkboxAutostart;
    Button btnLanguageApply;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);//set activity's resource

        txtTitle = (TextView) findViewById(R.id.txtSettingTitle);
        swLanguage = (Switch) findViewById(R.id.swLanguage);
        checkboxAutostart = (CheckBox) findViewById(R.id.checkBox);
        btnLanguageApply = (Button) findViewById(R.id.btnSettingApply);

        btnLanguageApply.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Locale locale = Locale.ENGLISH;
            Configuration config = getBaseContext().getResources().getConfiguration();
            if(v.getId() == R.id.btnSettingApply){
                //change language
                if(swLanguage.isChecked()){
                    //english
                    locale = new Locale("en");
                }else{
                    //vietnamese
                    locale = new Locale("vi");
                }
                config.locale = locale;
                config.setLocale(locale);
//                getApplicationContext().createConfigurationContext(config);
                getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                //switch to main screen
                Intent intent = new Intent(SettingActivity.this, MainActivity.class);
                SettingActivity.this.startActivity(intent);
            }
        }
    };

}

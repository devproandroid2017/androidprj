package com.example.hieucao.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.hieucao.myapplication.bean.Recipe;

import java.util.ArrayList;

/**
 * Created by hieucao on 5/22/17.
 */

public class ListViewExampleActivity extends AppCompatActivity {
    ListView listView;
    Button btnBack;

    protected void onCreate(Bundle savedInstanceState) {
        Log.d("ListViewExampleActivity","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_example);

        listView = (ListView) findViewById(R.id.listItem);
        btnBack = (Button) findViewById(R.id.btnBackListview);

        btnBack.setOnClickListener(onClickListener);

        //1. datasource
//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add(0,"Item 0");
//        arr.add(1,"Item 1");
//        arr.add(2,"Item 2");
//        arr.add(3,"Item 3");
        ArrayList<Recipe> arr = new ArrayList<Recipe>();
        Recipe r1 = new Recipe();
        r1.setTitle("Title 1");
        r1.setDetail("Detail 1");

        Recipe r2 = new Recipe();
        r2.setTitle("Title 1");
        r2.setDetail("Detail 1");

        arr.add(r1);
        arr.add(r2);
        //2. init adapter
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_view_item, arr);
        //3. set adapter cho listview
        listView.setAdapter(adapter);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ListViewExampleActivity.this, MainActivity.class);
            ListViewExampleActivity.this.startActivity(intent);
        }
    };
}

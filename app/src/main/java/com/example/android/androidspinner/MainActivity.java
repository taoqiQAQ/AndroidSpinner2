package com.example.android.androidspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
//82
public class MainActivity extends AppCompatActivity {

    ArrayList<String> alItem = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        alItem.add("游泳");
        alItem.add("篮球");
        alItem.add("足球");
        setContentView(R.layout.activity_main);
        Spinner sp = (Spinner)findViewById(R.id.Spinner01);
        BaseAdapter ba = new BaseAdapter() {
            @Override
            public int getCount() {
                return alItem.size();
            }

            @Override
            public Object getItem(int arg0) {
                return null;
            }

            @Override
            public long getItemId(int arg0) {
                return 0;
            }

            @Override
            public View getView(int arg0, View arg1, ViewGroup arg2) {
                LinearLayout ll = new LinearLayout(MainActivity.this);
                ll.setOrientation(LinearLayout.HORIZONTAL);
                TextView tv = new TextView(MainActivity.this);
                tv.setText(alItem.get(arg0));
                ll.addView(tv);
                return ll;
            }
        };

        sp.setAdapter(ba);
        Button addbutton01 = (Button)findViewById(R.id.Button01);
        addbutton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edit01 = (EditText)findViewById(R.id.EditText01);
                String edit = edit01.getText().toString();
                alItem.add(edit);
                Toast.makeText(MainActivity.this,edit,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

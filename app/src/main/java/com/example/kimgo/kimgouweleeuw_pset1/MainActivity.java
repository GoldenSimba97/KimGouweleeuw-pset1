package com.example.kimgo.kimgouweleeuw_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    private CheckBox arms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void addBodyPart(View view) {
//        arms = (CheckBox) findViewById(R.id.arms);
//        arms.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (((CheckBox) v).isChecked()) {
//
//                }
//            }
//        });
//    }
}

package com.example.kimgo.kimgouweleeuw_pset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {

    private CheckBox arms;
//    private Integer images[] = {R.drawable.arms, R.drawable.ears, R.drawable.eyebrows,
//            R.drawable.eyes, R.drawable.glasses, R.drawable.hat, R.drawable.mouth,
//            R.drawable.mustache, R.drawable.nose, R.drawable.shoes};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.activity_main);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.landscape);
                break;
        }
    }

//    public void addBodyPart(View view) {
//        arms = (CheckBox) findViewById(R.id.arms);
//        arms.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (arms.isChecked()) {
//
//                }
//            }
//        });
//    }

//    private void addImage() {
//
//        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
//        imageView.setImageResource(images[currImage]);
//
//    }
}

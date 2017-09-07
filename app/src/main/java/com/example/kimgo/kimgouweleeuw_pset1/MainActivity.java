package com.example.kimgo.kimgouweleeuw_pset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;



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
//                final ImageView image = (ImageView)findViewById(R.id.armsim);
//                image.setVisibility(View.VISIBLE);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.landscape);
                break;
        }
    }

    /* Create bundle when onSaveInstanceState is called */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    /* Do something with the bundle when the state is restored */
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
    }

    public void addBodyPart(View view) {
//        final CheckBox arms = (CheckBox)findViewById(R.id.arms);
//        final ImageView image = (ImageView)findViewById(R.id.armsim);

        switch(view.getId()) {
            case R.id.arms:
                ImageView image = (ImageView)findViewById(R.id.armsim);
                if (((CheckBox) view).isChecked()) {
                    image.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.hat:
                ImageView image2 = (ImageView)findViewById(R.id.hatim);
                if (((CheckBox) view).isChecked()) {
                    image2.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image2.setVisibility(View.INVISIBLE);
                    break;
                }
        }
    }

//    private void addImage() {
//
//        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
//        imageView.setImageResource(images[currImage]);
//
//    }
}

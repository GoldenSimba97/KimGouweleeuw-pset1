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
            case R.id.ears:
                ImageView image2 = (ImageView)findViewById(R.id.earsim);
                if (((CheckBox) view).isChecked()) {
                    image2.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image2.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.eyebrows:
                ImageView image3 = (ImageView)findViewById(R.id.eyebrowsim);
                if (((CheckBox) view).isChecked()) {
                    image3.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image3.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.eyes:
                ImageView image4 = (ImageView)findViewById(R.id.eyesim);
                if (((CheckBox) view).isChecked()) {
                    image4.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image4.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.glasses:
                ImageView image5 = (ImageView)findViewById(R.id.glassesim);
                if (((CheckBox) view).isChecked()) {
                    image5.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image5.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.hat:
                ImageView image6 = (ImageView)findViewById(R.id.hatim);
                if (((CheckBox) view).isChecked()) {
                    image6.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image6.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.mouth:
                ImageView image7 = (ImageView)findViewById(R.id.mouthim);
                if (((CheckBox) view).isChecked()) {
                    image7.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image7.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.mustache:
                ImageView image8 = (ImageView)findViewById(R.id.mustacheim);
                if (((CheckBox) view).isChecked()) {
                    image8.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image8.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.nose:
                ImageView image9 = (ImageView)findViewById(R.id.noseim);
                if (((CheckBox) view).isChecked()) {
                    image9.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image9.setVisibility(View.INVISIBLE);
                    break;
                }
            case R.id.shoes:
                ImageView image10 = (ImageView)findViewById(R.id.shoesim);
                if (((CheckBox) view).isChecked()) {
                    image10.setVisibility(View.VISIBLE);
                    break;
                } else {
                    image10.setVisibility(View.INVISIBLE);
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

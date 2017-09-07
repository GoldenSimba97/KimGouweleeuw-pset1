package com.example.kimgo.kimgouweleeuw_pset1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    /* Switch between portrait and landscape orientation when
     * state gets changed */
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

    /* Create bundle when onSaveInstanceState is called */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ImageView armsim = (ImageView)findViewById(R.id.armsim);
        int armsval = armsim.getVisibility();
        if(armsval == View.VISIBLE) {
            outState.putInt("arms",1);
        }

        ImageView earsim = (ImageView)findViewById(R.id.earsim);
        int earsval = earsim.getVisibility();
        if(earsval == View.VISIBLE) {
            outState.putInt("ears",1);
        }

        ImageView eyebrowsim = (ImageView)findViewById(R.id.eyebrowsim);
        int eyebrowsval = eyebrowsim.getVisibility();
        if(eyebrowsval == View.VISIBLE) {
            outState.putInt("eyebrows",1);
        }

        ImageView eyesim = (ImageView)findViewById(R.id.eyesim);
        int eyesval = eyesim.getVisibility();
        if(eyesval == View.VISIBLE) {
            outState.putInt("eyes",1);
        }

        ImageView glassesim = (ImageView)findViewById(R.id.glassesim);
        int glassesval = glassesim.getVisibility();
        if(glassesval == View.VISIBLE) {
            outState.putInt("glasses",1);
        }

        ImageView hatim = (ImageView)findViewById(R.id.hatim);
        int hatval = hatim.getVisibility();
        if(hatval == View.VISIBLE) {
            outState.putInt("hat",1);
        }

        ImageView mouthim = (ImageView)findViewById(R.id.mouthim);
        int mouthval = mouthim.getVisibility();
        if(mouthval == View.VISIBLE) {
            outState.putInt("mouth",1);
        }

        ImageView mustacheim = (ImageView)findViewById(R.id.mustacheim);
        int mustacheval = mustacheim.getVisibility();
        if(mustacheval == View.VISIBLE) {
            outState.putInt("mustache",1);
        }

        ImageView noseim = (ImageView)findViewById(R.id.noseim);
        int noseval = noseim.getVisibility();
        if(noseval == View.VISIBLE) {
            outState.putInt("nose",1);
        }

        ImageView shoesim = (ImageView)findViewById(R.id.shoesim);
        int shoesval = shoesim.getVisibility();
        if(shoesval == View.VISIBLE) {
            outState.putInt("shoes",1);
        }
    }

    /* If image was visible in previous state, this will be restored */
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        ImageView armsim = (ImageView)findViewById(R.id.armsim);
        int armsval = inState.getInt("arms",0);
        if(armsval == 1) {
            armsim.setVisibility(View.VISIBLE);
        }

        ImageView earsim = (ImageView)findViewById(R.id.earsim);
        int earsval = inState.getInt("ears",0);
        if(earsval == 1) {
            earsim.setVisibility(View.VISIBLE);
        }

        ImageView eyebrowsim = (ImageView)findViewById(R.id.eyebrowsim);
        int eyebrowsval = inState.getInt("eyebrows",0);
        if(eyebrowsval == 1) {
            eyebrowsim.setVisibility(View.VISIBLE);
        }

        ImageView eyesim = (ImageView)findViewById(R.id.eyesim);
        int eyesval = inState.getInt("eyes",0);
        if(eyesval == 1) {
            eyesim.setVisibility(View.VISIBLE);
        }

        ImageView glassesim = (ImageView)findViewById(R.id.glassesim);
        int glassesval = inState.getInt("glasses",0);
        if(glassesval == 1) {
            glassesim.setVisibility(View.VISIBLE);
        }

        ImageView hatim = (ImageView)findViewById(R.id.hatim);
        int hatval = inState.getInt("hat",0);
        if(hatval == 1) {
            hatim.setVisibility(View.VISIBLE);
        }

        ImageView mouthim = (ImageView)findViewById(R.id.mouthim);
        int mouthval = inState.getInt("mouth",0);
        if(mouthval == 1) {
            mouthim.setVisibility(View.VISIBLE);
        }

        ImageView mustacheim = (ImageView)findViewById(R.id.mustacheim);
        int mustacheval = inState.getInt("mustache",0);
        if(mustacheval == 1) {
            mustacheim.setVisibility(View.VISIBLE);
        }

        ImageView noseim = (ImageView)findViewById(R.id.noseim);
        int noseval = inState.getInt("nose",0);
        if(noseval == 1) {
            noseim.setVisibility(View.VISIBLE);
        }

        ImageView shoesim = (ImageView)findViewById(R.id.shoesim);
        int shoesval = inState.getInt("shoes",0);
        if(shoesval == 1) {
            shoesim.setVisibility(View.VISIBLE);
        }
    }

    /* Adds the parts of Mr. Potato when the corresponding checkbox is checked */
    public void addBodyPart(View view) {
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
}

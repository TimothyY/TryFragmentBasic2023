package com.example.tryfragmentbasic2023;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements UpperFragment.OnFragmentInteractionListener{

    UpperFragment upperFragment;
    LowerFragment lowerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.upperContainer) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            upperFragment = new UpperFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            upperFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getSupportFragmentManager().beginTransaction().add(R.id.upperContainer, upperFragment).commit();
        }

        if (findViewById(R.id.lowerContainer) != null) {
            if (savedInstanceState != null) {return;}
            lowerFragment = new LowerFragment();
            lowerFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.lowerContainer, lowerFragment).commit();
        }
    }

    @Override
    public void onFragmentInteraction(String sentence) {
        if(lowerFragment!=null)
            lowerFragment.updateSentence(sentence);
    }

}
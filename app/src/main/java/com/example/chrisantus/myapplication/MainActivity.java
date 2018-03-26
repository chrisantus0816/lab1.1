package com.example.chrisantus.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //create main layout object

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }
    //We use onClick:"method in java"
    //first we declare the method onButton1Clicked, and then
    //We make the method(code) implementation.
    public void onButton1Clicked(View v) {
        changeImage();
    }

    // If imageIndex is zero , I put the setVisibility method's state differently.
    //first imageView is Visible second is Invisible
    //and then I click the button(changeImage) this state is change to 1
    //Whenever we click the button, this state is change to just two state(0,1)

    private void changeImage() {
        if (imageIndex == 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        } else if (imageIndex == 1) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }
    }

}

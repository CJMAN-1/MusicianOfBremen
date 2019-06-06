/*
package com.example.musicianofbremen;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {

    private DrawerLayout drawerLayout;
    private View drawerView;
    private TextView txtPrompt, txtPrompt2;
    ImageButton buttonCloseDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrompt = (TextView) findViewById(R.id.prompt);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerView = (View) findViewById(R.id.drawer);


        buttonCloseDrawer = (ImageButton) findViewById(R.id.guitar);
        buttonCloseDrawer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                txtPrompt.setText("시발");
                drawerLayout.closeDrawers();
            }
        });

        drawerView.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                return true;
            }
        });
    }

}
*/
package com.nathantonani.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Handles onClick event of project buttons
    public void onProjectClick(View view){

        //Toast text
        String toastText = "";

        //Determine which button was pressed
        switch(view.getId()){
            case R.id.popularMoviesBtn:
                toastText = "'Popular Movies'";
                break;
            case R.id.stockHawkBtn:
                toastText = "'Stock Hawk'";
                break;
            case R.id.buildItBiggerBtn:
                toastText = "'Build it Bigger'";
                break;
            case R.id.makeYourAppMaterialBtn:
                toastText = "'Make Your App Material'";
                break;
            case R.id.goUbiquitousBtn:
                toastText = "'Go Ubiquitous'";
                break;
            case R.id.capstoneBtn:
                toastText = "'Capstone'";
                break;
            default:
                toastText = "Unrecognized";
        }

        toastText +=  " app coming soon...";

        //Display short Toast
        Toast.makeText(view.getContext(), toastText, Toast.LENGTH_SHORT).show();
    }

}

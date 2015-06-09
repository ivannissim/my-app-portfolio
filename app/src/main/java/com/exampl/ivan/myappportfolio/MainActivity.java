package com.exampl.ivan.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button ButtonStreamer;
    Button ButtonScores;
    Button ButtonLybrary;
    Button ButtonBiger;
    Button ButtonReader;
    Button ButtonCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonStreamer = (Button) findViewById(R.id.ButtonStreamer);
        ButtonStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Streamer app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });


        ButtonScores = (Button) findViewById(R.id.ButtonScores);
        ButtonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Scores app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        ButtonLybrary = (Button) findViewById(R.id.ButtonLybrary);
        ButtonLybrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Lybrary  app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        ButtonBiger = (Button) findViewById(R.id.ButtonBiger);
        ButtonBiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Biger app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        ButtonReader = (Button) findViewById(R.id.ButtonReader);
        ButtonReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Reader app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        ButtonCapstone = (Button) findViewById(R.id.ButtonCapstone);
        ButtonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Click code
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

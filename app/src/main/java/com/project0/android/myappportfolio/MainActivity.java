package com.project0.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Main Activity for P0-My App Portfolio
 * @author Ruchita_Maheshwary
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method will be called on click of Spotify Streamer button
     * @param view
     */
    public void spotifyStreamer(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my Media Streamer App!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }


    /**
     * This method will be called on click of Build It Bigger button
     * @param view
     */

    public void buildItBigger(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my Grade Project app!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }


    /**
     * This method will be called on click of Scores App button
     * @param view
     */

    public void scoresApp(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my Scores app!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method will be called on click of Library App button
     * @param view
     */

    public void libraryApp(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my Library app!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method will be called on click of XYZ Reader button
     * @param view
     */

    public void xyzReader(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my XYZ Reader app!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method will be called on click of My Capstone App button
     * @param view
     */


    public void capstoneApp(View view)
    {
        Context context = getApplicationContext();
        String str = "This button will launch my Capstone app!";
        Toast toast = Toast.makeText(context,str,Toast.LENGTH_SHORT);
        toast.show();
    }

}

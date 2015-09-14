package com.example.lukemiller18.soundapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private MediaPlayer soundPlayer [] = new MediaPlayer[6];


    private int soundRecources [] = {R.raw.ballbounce, R.raw.baseballhit, R.raw.goal,
                                     R.raw.hockeysound, R.raw.swish, R.raw.touchdown};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < soundPlayer.length; i++) {
            soundPlayer[i] = MediaPlayer.create(this, soundRecources[i]);

        }
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

    public void buttonClicked(View view) {

        switch (view.getId()) {
            case R.id.btnBase:
                soundPlayer[1].start();
                break;

            case R.id.btnFoot:
                soundPlayer[5].start();
                break;


            case R.id.btnBasket:
                soundPlayer[4].start();
                break;

            case R.id.btnPuck:
                soundPlayer[3].start();
                break;

            case R.id.btnTennis:
                soundPlayer[0].start();
                break;

            case R.id.btnSoccer:
                soundPlayer[2].start();
                break;

            case R.id.button:

                for (int s = 0; s < soundPlayer.length; s++) {
                    if (soundPlayer[s].isPlaying()) {
                        soundPlayer[s].pause();
                        soundPlayer[s].seekTo(0);
                    }
                }
                break;

            default:
                break;
        }




            }
    }


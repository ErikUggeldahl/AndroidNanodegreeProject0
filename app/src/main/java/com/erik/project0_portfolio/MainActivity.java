package com.erik.project0_portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onMainItemSelected(View view) {
        String toastMessage = buttonIDToToastMessage(view.getId());

        Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
    }

    private String buttonIDToToastMessage(int buttonID) {
        String toastMessage = "";

        switch (buttonID) {
            case R.id.spotify:
                toastMessage = getString(R.string.spotify_toast);
                break;
            case R.id.superduo:
                toastMessage = getString(R.string.superduo_toast);
                break;
            case R.id.bigger:
                toastMessage = getString(R.string.bigger_toast);
                break;
            case R.id.reader:
                toastMessage = getString(R.string.reader_toast);
                break;
            case R.id.capstone:
                toastMessage = getString(R.string.capstone_toast);
                break;
        }

        return toastMessage;
    }
}

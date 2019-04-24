package com.example.filenber.ethiopis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Thread thread = new Thread()
{
    @Override
    public void run() {
        try
        {
            sleep(3000);
            Intent intent = new Intent(MainActivity.this , Main_Page.class);
            startActivity(intent);
            finish();
        }
        catch (Exception ex)
        {

        }

    }
};
thread.start();
    }
}

package com.example.luv.med;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.ContentProviderResult;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;





public class MainActivity extends AppCompatActivity {

    EditText emailText;
    EditText passsword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailText = (EditText) findViewById(R.id.emailText);
        passsword = (EditText) findViewById(R.id.password);
    }

    void notify(View v){
        Log.e("1","was here");

        Intent activate = new Intent(this, NavigationActivity.class);
        AlarmManager alarms ;
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, activate, 0);
        alarms = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarms.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+5000, alarmIntent);
    }
    void login_f(View v){
//        need to verify data api
        Intent i = new Intent(this , User_profile.class);
        finish();
        startActivity(i);
    }
}

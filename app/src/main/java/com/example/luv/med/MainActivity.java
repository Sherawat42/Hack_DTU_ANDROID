package com.example.luv.med;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.ContentProviderResult;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void notify(View v){
        Log.e("1","was here");
//        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
//        mBuilder.setSmallIcon(R.drawable.abc);
//        mBuilder.setContentTitle("Notification Alert, Click Me!");
//        mBuilder.setContentText("Hi, This is Android Notification Detail!");
//        Intent resultIntent = new Intent(this, ResultActivity.class);
//        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//        stackBuilder.addParentStack(ResultActivity.class);
//        stackBuilder.addNextIntent(resultIntent);
//       PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
//        mBuilder.setContentIntent(resultPendingIntent);
//        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        mNotificationManager.notify(0, mBuilder.build());

        // requestWindowFeature(Window.FEATURE_NO_TITLE);
//        Date dat  = new Date();//initialises to now
//        Calendar cal_alarm = Calendar.getInstance();
//        Calendar cal_now = Calendar.getInstance();
//        cal_now.setTime(dat);
//        cal_alarm.setTime(dat);
//        cal_alarm.set(Calendar.HOUR_OF_DAY,23);//set the alarm time
//        cal_alarm.set(Calendar.MINUTE, 37);
//        cal_alarm.set(Calendar.SECOND,0);
//        if(cal_alarm.before(cal_now)){//if its in the past increment
//            cal_alarm.add(Calendar.DATE,1);
//        }
//        Intent intent = new Intent(this, ResultActivity.class);
//        PendingIntent AlarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//        AlarmManager am = (AlarmManager) this.getSystemService(this.ALARM_SERVICE);
//        am.set(AlarmManager.RTC,cal_alarm.getTimeInMillis(), AlarmIntent);

        Intent activate = new Intent(this, NavigationActivity.class);
        AlarmManager alarms ;
        PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, activate, 0);
        alarms = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarms.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+5000, alarmIntent);
    }
}

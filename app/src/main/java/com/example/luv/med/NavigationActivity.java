package com.example.luv.med;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NavigationActivity extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = "Hellooo, alrm worked ----";
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(context, ResultActivity.class);
        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent2);
    }
}

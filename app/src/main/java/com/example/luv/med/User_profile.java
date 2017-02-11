package com.example.luv.med;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class User_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }
    public void appointment(View v )
    {
        Intent i = new Intent(this,Appointment.class);
        startActivity(i);
    }
    public void history(View v )
    {
        Intent i = new Intent(this,History.class);
        startActivity(i);
    }
    public void signout(View v )
    {
        Intent i = new Intent(this,MainActivity.class);
        finish();
        startActivity(i);
    }
    public void Dosage_Knowledge( View view )
    {
        Intent i = new Intent(this,Dosage_Knowledge.class);
        finish();
        startActivity(i);
    }

}

package com.example.luv.med;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class Appointment extends AppCompatActivity {

    JSONArray Global_Json_array;
    String result = "";
    public class DownloadTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {
            int res=0;
            String url="http://192.168.43.136:3000/test/"+"manish"+"/"+"bbbb";
            HttpURLConnection connection=null;
            BufferedReader bufferedReader=null;
            Log.e("!!!!!!!!!!! ","input stream is null");

            try{
                String response="";
                URL url1=new URL(url);
                connection= (HttpURLConnection) url1.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                InputStream inputStream=connection.getInputStream();
                if(inputStream==null){
                    Log.e("!!!!!!!!!!! ","input stream is null");
                }
                StringBuffer buffer=new StringBuffer();
                String line="";
                bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
                while((line=bufferedReader.readLine())!=null){
                    buffer.append(line+"\n");
                }
                response=buffer.toString();
                Log.i("response",response);
                JSONObject object = new JSONObject(response);
                JSONArray Jarray  = object.getJSONArray("NAME OF THE JSON");
                Global_Json_array = Jarray ;
            }
            catch(IOException e){
                Log.e("2222222222222"," "+e+"errorororororororor");
            }catch(JSONException e){
                Log.e("2222222222222"," "+e+"errorororororororor");
            }finally {
                if (connection != null) {
                    connection.disconnect();
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        Log.e("33333333333", "" + e);
                    }
                }
            }
            return  "abc";
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(result);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        DownloadTask task = new DownloadTask();
        task.execute("192.168.43.85:4567/test");
        Log.i("hello", result);
    }
}
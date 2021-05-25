package com.teajintech.sql_test;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "sqltest";
    private UserDao userDao;
    private TodoDao todoDao;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "nd.db").build();
        userDao = db.userDao();
        todoDao = db.todoDao();


        Log.d(TAG,"data inserted");
    }
}




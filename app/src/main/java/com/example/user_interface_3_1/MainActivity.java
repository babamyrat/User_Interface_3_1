package com.example.user_interface_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Data;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Cursor cursor; // database cursor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME,
                ContactsContract.CommonDataKinds.Phone.NUMBER};
        int[] toViews = {R.id.display_name, R.id.phone_number};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                R.layout.person_name_and_number, cursor, fromColumns, toViews, 0);
        listView.setAdapter(adapter);

    }
}
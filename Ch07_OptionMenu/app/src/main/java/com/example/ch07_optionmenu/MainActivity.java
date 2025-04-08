package com.example.ch07_optionmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    View view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if( id == R.id.blue ) {
            view1.setBackgroundColor(Color.BLUE);
            return true;
        }
        else if( id == R.id.green ) {
            view1.setBackgroundColor(Color.GREEN);
            return true;
        }
        else if( id == R.id.red ) {
            view1.setBackgroundColor(Color.RED);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

/**
 * Problemm: 에러 발생
 * ERROR: D:\AndroidStudioProjects\Ch07_OptionMenu\app\src\main\res\menu\mymenu.xml:9: AAPT: error: 'id/blue' is incompatible with attribute id (attr) reference.
 * 
 * [Android / Kotlin ] is incompatible with attribute id (attr) reference 에러해결
 * 출처: https://rlory.tistory.com/27 [우당탕탕 개발공부:티스토리]
 */
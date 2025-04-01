package com.example.ch05_checkbox;

import static com.example.ch05_checkbox.R.id.checkBox;
import static com.example.ch05_checkbox.R.id.checkBox2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
    }
    @SuppressLint("NonConstantResourceId")
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        int id = view.getId();
        if (id == checkBox) {
            if (checked) imageView1.setImageResource(R.drawable.sand1);
            else imageView1.setImageResource(0);
        } else if (id == checkBox2) {
            if (checked) imageView2.setImageResource(R.drawable.sand2);
            else imageView2.setImageResource(0);
        }
    }
}
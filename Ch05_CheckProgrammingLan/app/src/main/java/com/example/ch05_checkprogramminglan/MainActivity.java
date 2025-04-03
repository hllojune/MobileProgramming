package com.example.ch05_checkprogramminglan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("20210843 박효준");

        CheckBox ch1 = (CheckBox)findViewById(R.id.Python);
        CheckBox ch2 = (CheckBox)findViewById(R.id.JavaScript);
        CheckBox ch3 = (CheckBox)findViewById(R.id.Go);
        CheckBox ch4 = (CheckBox)findViewById(R.id.Rust);
        CheckBox ch5 = (CheckBox)findViewById(R.id.Kotlin);
        Button btn1 = (Button)findViewById(R.id.DoneButton);
        Button btn2 = (Button)findViewById(R.id.cancelButton);
        TextView tv = (TextView)findViewById(R.id.showResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onCheckboxClicked(View view) {
                boolean checked = ((CheckBox) view).isChecked();
                String result = "";

                switch (view.getId()) {
                    case R.id.Python:
                        if (checked) {
                            result += ch1.getText() + " ";
                            tv.setText(result);
                        }
                        else tv.setText(0);
                        break;
                }

//                if (ch1.isChecked()) result += ch1.getText() + " ";
//                if (ch2.isChecked()) result += ch2.getText() + " ";
//                if (ch3.isChecked()) result += ch3.getText() + " ";
//                if (ch4.isChecked()) result += ch4.getText() + " ";
//                if (ch5.isChecked()) result += ch5.getText() + " ";
//                tv.setText(result);
            }
        });
    }
}
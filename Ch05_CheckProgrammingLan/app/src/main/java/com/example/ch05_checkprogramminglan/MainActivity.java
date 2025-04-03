package com.example.ch05_checkprogramminglan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox pythonCheckBox, jsCheckBox, goCheckBox, rustCheckBox, kotlinCheckBox;
    private TextView showResult;
    private Button doneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("20210843 박효준");

        // 체크박스 및 버튼 초기화
        pythonCheckBox = findViewById(R.id.Python);
        jsCheckBox = findViewById(R.id.JavaScript);
        goCheckBox = findViewById(R.id.Go);
        rustCheckBox = findViewById(R.id.Rust);
        kotlinCheckBox = findViewById(R.id.Kotlin);
        showResult = findViewById(R.id.showResult);
        doneButton = findViewById(R.id.Done);

        // Done 버튼 클릭 이벤트 설정
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSelectedLanguages();
            }
        });
    }

    private void showSelectedLanguages() {
        ArrayList<String> selectedLanguages = new ArrayList<>();

        if (pythonCheckBox.isChecked()) selectedLanguages.add("Python");
        if (jsCheckBox.isChecked()) selectedLanguages.add("JavaScript");
        if (goCheckBox.isChecked()) selectedLanguages.add("Go");
        if (rustCheckBox.isChecked()) selectedLanguages.add("Rust");
        if (kotlinCheckBox.isChecked()) selectedLanguages.add("Kotlin");

        if (selectedLanguages.isEmpty()) {
            showResult.setText("No language selected.");
        } else {
            showResult.setText(String.join(" ", selectedLanguages));
        }
    }
}

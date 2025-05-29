package com.example.quizapp;

import android.app.AlertDialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class QuizActivity extends AppCompatActivity {
    private int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        loadQuestion(0);
    }

    public void loadQuestion(int index) {
        Fragment fragment = null;
        switch (index) {
            case 0: fragment = new Question1Fragment(); break;
            case 1: fragment = new Question2Fragment(); break;
            case 2: fragment = new Question3Fragment(); break;
        }
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    public void addCorrectAnswer() {
        correctAnswers++;
    }

    public void showResult() {
        new AlertDialog.Builder(this)
                .setTitle("퀴즈 결과")
                .setMessage("3문제 중 " + correctAnswers + "문제를 맞췄습니다.")
                .setPositiveButton("확인", (dialog, which) -> finish())
                .show();
    }
}

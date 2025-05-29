package com.example.quizapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question1Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question1, container, false);

        RadioGroup radioGroup = view.findViewById(R.id.radio_group);
        Button btnNext = view.findViewById(R.id.btn_next);

        btnNext.setOnClickListener(v -> {
            int checkedId = radioGroup.getCheckedRadioButtonId();
            if (checkedId == -1) {
                Toast.makeText(getActivity(), "정답을 선택하세요", Toast.LENGTH_SHORT).show();
                return;
            }
            // 정답: radio_option4 (Java)
            if (checkedId == R.id.radio_option4) {
                ((QuizActivity)getActivity()).addCorrectAnswer();
            }
            ((QuizActivity)getActivity()).loadQuestion(1);
        });

        return view;
    }
}

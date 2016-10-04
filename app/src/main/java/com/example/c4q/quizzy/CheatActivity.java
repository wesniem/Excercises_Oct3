package com.example.c4q.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends QuizActivity {

    private Question currentQuestion;
    private Question[] copyOfQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        Button button = (Button) findViewById(R.id.cheat_btn);
        copyOfQuestions = super.questionBank;
        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);

        Intent intent = getIntent();
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
        currentQuestion = copyOfQuestions[myIndex];
        boolean answer = currentQuestion.isAnswerTrue();
        questionTV.setText(currentQuestion.getTextResId());
        questionTV.append(" " + currentQuestion.isAnswerTrue());
//        questionTV.setText("I didn't implement this yet.  Need to figure out how to read from Intent.");

    }

}

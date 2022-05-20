package sg.edu.rp.c36.id21028831.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AnswerActivity1 extends AppCompatActivity {

    TextView revealingQ1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Log.d("AnswerActivity1", "onCreate() called.");

        revealingQ1=findViewById(R.id.displayQ1);
//        revealingQ1.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        revealingQ1.setText(questionsSelected + " answer is: Queue");

    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }



}
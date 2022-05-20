package sg.edu.rp.c36.id21028831.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity2 extends AppCompatActivity {

    TextView revealingQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        revealingQ2=findViewById(R.id.revealingQ2);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        revealingQ2.setText(questionsSelected + " answer is: Gone");
    }
}
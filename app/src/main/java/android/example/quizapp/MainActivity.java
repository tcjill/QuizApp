package android.example.quizapp;

import android.app.Notification;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method works when the submit answer button is pressed.
     */
    public void submitAnswers(View view) {
        int points = 0;
        // This gets the answer for Question 1
        RadioButton radioButtonSaturnYes = (RadioButton) findViewById(R.id.saturn_yes);
        if (radioButtonSaturnYes.isChecked()) {
            points++;
        }
        // This gets the material entered in Question 2
        EditText mercuryArea = (EditText) findViewById(R.id.mercury_answer);
        String mercury = mercuryArea.getText().toString();
        boolean mercuryAnswer = "Mercury".equals(mercury);
        if (mercuryAnswer) {
            points++;
        }
        // This gets the answers for Question 3
        CheckBox checkBoxQuestion3Answer2 = (CheckBox) findViewById(R.id.question3_answer2_true);
        CheckBox checkBoxQuestion3Answer4 = (CheckBox) findViewById(R.id.question3_answer4_true);
        if (checkBoxQuestion3Answer2.isChecked()) {
            points++;
        }
        if (checkBoxQuestion3Answer4.isChecked()) {
            points++;
        }
        // This gets the  entered in Question 4
        EditText jupiterArea = (EditText) findViewById(R.id.jupiter_answer);
        String jupiter = jupiterArea.getText().toString();
        boolean jupiterAnswer = "Jupiter".equals(jupiter);
        if (jupiterAnswer) {
            points++;
        }
        // This gets the answer for Question 5
        RadioButton Flat_y = (RadioButton) findViewById(R.id.Flat_y);
        if (Flat_y.isChecked()) {
            points++;
        }
        // Shows score
        Toast.makeText(this, "Your score is: " + points + " out of 6", Toast.LENGTH_LONG).show();
    }
}






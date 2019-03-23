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
        CheckBox Mars = (CheckBox) findViewById(R.id.Mars);
        CheckBox Mercury = (CheckBox) findViewById(R.id.Mercury);
        CheckBox Earth = (CheckBox) findViewById(R.id.Earth);
        CheckBox Venus = (CheckBox) findViewById(R.id.Venus);


        if (Mars.isChecked() && Mercury.isChecked() && Earth.isChecked() && !Venus.isChecked()) {
            points += 1;

        }
        // This gets the  entered in Question 4
        EditText jupiterArea = (EditText) findViewById(R.id.jupiter_answer);
        String jupiter = jupiterArea.getText().toString();
        boolean jupiterAnswer = "Jupiter".equals(jupiter);
        if (jupiterAnswer) {
            points++;
        }
        // This gets the answer for Question 5
        RadioButton Flat_n = (RadioButton) findViewById(R.id.Flat_n);
        if (Flat_n.isChecked()) {
            points++;
        }
        // Shows score
        Toast.makeText(this, "You Got : " + points + " out of 7", Toast.LENGTH_LONG).show();
    }


}
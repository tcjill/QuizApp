
package android.example.quizapp;

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
    int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // ImageView picture = (ImageView) findViewById(R.id.profile_picture);
    // picture.setImageResource(R.drawable.googl);

    //TextView name = (TextView) findViewById(R.id.name);
    //name.setText("");


    //TextView birthday = (TextView) findViewById(R.id.birthday);
    //birthday.setText("");

    // TextView country = (TextView) findViewById(R.id.country);
    // country.setText("");

    public void writeIn(View view) {

        //write in text answer Q1
        EditText writeIn = (EditText) findViewById(R.id.write_in);
        String name = writeIn.getText().toString();
    }

    public void checkResult(View view) {
        RadioButton rb;
        rb = (RadioButton) findViewById(R.id.radio_question_saturnyes);

        if (rb.isChecked()) {
            ((TextView) findViewById(R.id.radio_question_saturnyes)).setText("@string/correct");
        } else {
            ((TextView) findViewById(R.id.radio_question_saturnyes)).setText("@string/incorrect");
        }

//radio group all
        RadioGroup radioGroup = findViewById(R.id.radio_questions);
        radioGroup.clearCheck();

        radioGroup = findViewById(R.id.radio_questions);
        radioGroup.clearCheck();
    }

//checkboxes

    public void onCheckBoxClicked(View view) {

        CheckBox marsCheckBox = (CheckBox) findViewById(R.id.checkbox_mars);
        boolean chooseMars = marsCheckBox.isChecked();

        CheckBox mercuryCheckBox = (CheckBox) findViewById(R.id.checkbox_mercury);
        boolean chooseMercury = mercuryCheckBox.isChecked();

        CheckBox earthCheckBox = (CheckBox) findViewById(R.id.checkbox_earth);
        boolean chooseEarth = earthCheckBox.isChecked();

        CheckBox venusCheckBox = (CheckBox) findViewById(R.id.checkbox_venus);
        boolean chooseVenus = venusCheckBox.isChecked();

        if (points <= 1) {
            Toast.makeText(this, "okay", Toast.LENGTH_SHORT).show();
            return;
        }
        if (points == 2) {
            Toast.makeText(this, "better", Toast.LENGTH_SHORT).show();
            return;
        }
        if (points >= 3) {
            Toast.makeText(this, "best", Toast.LENGTH_SHORT).show();
            return;
        }


        /*if (points <=1){
        Toast.makeText(this, "yuck", Toast.LENGTH_SHORT).show();
        // Exit this method early because there's nothing left to do
        //   return;
        // }
        // quantity = quantity + 1;
        // displayQuantity(quantity);
        }

        if (points ==2){
        Toast.makeText(this, "okayy", Toast.LENGTH_SHORT).show();
        // Exit this method early because there's nothing left to do
        //   return;
        // }
        // quantity = quantity + 1;
        // displayQuantity(quantity);
        }
        if (points ==3){
            Toast.makeText(this, "great", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
            }
            /points = points + 1;
            // displayQuantity(quantity);


    }

*/

    }
}
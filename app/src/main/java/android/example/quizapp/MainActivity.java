
package android.example.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    // ImageView picture = (ImageView) findViewById(R.id.profile_picture);
    // picture.setImageResource(R.drawable.googl);

    //TextView name = (TextView) findViewById(R.id.name);
    //name.setText("");


    //TextView birthday = (TextView) findViewById(R.id.birthday);
    //birthday.setText("");

    // TextView country = (TextView) findViewById(R.id.country);
    // country.setText("");

    public void reset(View view) {

        //write in text answer Q1
        EditText editText = findViewById(R.id.write_in);
        editText.setText("");

//q 2 and 3 radio buttons
        RadioGroup radioGroup = findViewById(R.id.radio_questions);
        radioGroup.clearCheck();

        radioGroup = findViewById(R.id.radio_questions);
        radioGroup.clearCheck();

//q 4 checkboxes a,b,c,d.
        CheckBox checkBox = findViewById(R.id.checkbox_one);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.checkbox_two);
        checkBox.setChecked(false);

        checkBox = findViewById(R.id.checkbox_three);
        checkBox.setChecked(false);


        checkBox = findViewById(R.id.checkbox_four);
        checkBox.setChecked(false);


    }


}
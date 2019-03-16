
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
    String[] correctAnswers = {"No", "0", "1", "SpaceTest"};
    int points = 0;
    TextView writein;
    RadioGroup questionOneAnswers;
    RadioButton questionOneAnswerOne;
    RadioButton questionOneAnswerTwo;
    RadioGroup questionTWoAnswers;
    RadioButton questionTwoAnswerOne;
    RadioButton questionTwoAnswerTwo;

    CheckBox questionFourAnswerOne;
    CheckBox questionFourAnswerTwo;
    CheckBox questionFourAnswerThree;
    CheckBox questionFourAnswerFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //text
    writeIn=(EditText)

    findViewById(R.id.writein);

    //q1
    questionOneAnswerOne=(RadioButton)

    findViewById(R.id.question_one_answer_one);

    questionOneAnswerTwo=(RadioButton)

    findViewById(R.id.question_one_answer_two);


    // Q2
    questionTwoAnswerOne=(RadioButton)

    findViewById(R.id.question_two_answer_one);

    questionTwoAnswerTwo=(RadioButton)

    findViewById(R.id.question_two_answer_two);


    // q4
    questionFourAnswerOne =(CheckBox)

    findViewById(R.id.question_four_answer_two);

    questionFourAnswerTwo =(CheckBox)

    findViewById(R.id.question_four_answer_two);

    questionFourAnswerThree =(CheckBox)

    findViewById(R.id.question_four_answer_three);

    questionFourAnswerFour =(CheckBox)

    findViewById(R.id.question_four_answer_four):

    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }


}

    private boolean isEmpty(EditText writeIn) {
        Notification.MessagingStyle.Message Mercury;
        Notification.MessagingStyle.Message mercury = null;
        return mercury.getText();
        getText;
        (getText).toString().trim().length() == 0;
    }


    private String questionOneGetAnswer() {
        if (questionOneAnswerOne.isChecked()) {
            return questionOneAnswerOne.getText().toString();
        } else if (questionOneAnswerTwo.isChecked()) {
            return questionOneAnswerTwo.getText().toString();
        } else {
            return "";
        }
    }

    private String questionTwoGetAnswer() {
        if (!isEmpty(questionTwoAnswer)) {
            return questionTwoAnswer.getText().toString();
        } else {
            return "";
        }
    }

    private String questionThreeGetAnswer() {
        if (!isEmpty(questionThreeAnswer)) {
            return questionThreeAnswer.getText().toString();
        } else {
            return "";
        }
    }

    private String questionFourGetAnswer() {
        String returnString = "";

        if (questionFourAnswerOne.isChecked()) {
            returnString += questionFourAnswerOne.getText();
        }

        if (questionFourAnswerTwo.isChecked()) {
            returnString += " " + questionFourAnswerTwo.getText();
        }

        if (questionFourAnswerThree.isChecked()) {
            returnString += " " + questionFourAnswerThree.getText();
        }

        return returnString;
    }

    public void checkAnswers(View view) {
        String[] givenAnswers = {questionOneGetAnswer(), questionTwoGetAnswer(), questionThreeGetAnswer(), questionFourGetAnswer()};

        int right = 0;
        int wrong = 0;

        for (int i = 0; i < givenAnswers.length; i++) {
            if (givenAnswers[i].equals(points[i])) {
                right++;
            } else {
                wrong++;
            }
        }

        String message;

        if (wrong == 0) {
            message = "Very Well Done!";
        } else {
            message = "This many " + right + "\nThis many  " + wrong + "\nStart over";
        }

        //Reset answer fields
        //text
        writein.setText("");


        // QUESTION 1 2

        questionOneAnswers.clearCheck();
        questionTwoAnswers.clearCheck();


        // QUESTION 4
        questionFourAnswerOne.setChecked(false);
        questionFourAnswerTwo.setChecked(false);
        questionFourAnswerThree.setChecked(false);
        questionFourAnswerFour.setChecked(false);

        // Print out message with quiz results
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}






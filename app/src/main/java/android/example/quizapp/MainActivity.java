package android.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void submitOrder(View view) {

//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("geo:47.6, -122.3"));
//            if (intent.resolveActivity(getPackageManager()) != null) {   * this is here because it needs the info to tell if it will have condition availb. somewhere in the app****
//                startActivity(intent);
//            }


        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

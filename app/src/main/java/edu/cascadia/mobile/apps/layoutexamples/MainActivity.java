package edu.cascadia.mobile.apps.layoutexamples;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final ArrayList<CharSequence> TeaGoodies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox milkCheck = findViewById(R.id.milkBox);
        CheckBox sugarCheck = findViewById(R.id.sugarBox);
        CheckBox lemonCheck = findViewById(R.id.lemonBox);

        //TODO: Assign each checkbox an onClick EventHandler that calls the onCheckboxClicked method

    }

    public void onCheckboxClicked(View view) {
        CheckBox clicked = (CheckBox)view;
        //Add or remove the checkboxes label to the ArrayList
        if(clicked.isChecked())
            TeaGoodies.add(clicked.getText());
        else
            TeaGoodies.remove(clicked.getText());

        //Create a String of the current set of labels
        StringBuilder teaTime = new StringBuilder("Tea with ");
        for (CharSequence goodies :TeaGoodies) {
            teaTime.append(goodies).append((", "));
        }
        //Display the string as a temporary popup - called a "Toast"
        Toast.makeText(MainActivity.this, teaTime, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        String teaWith = "Tea with ";
        teaWith = teaWith + TeaGoodies;
        Toast.makeText(MainActivity.this, teaWith, Toast.LENGTH_SHORT).show();

    }
}

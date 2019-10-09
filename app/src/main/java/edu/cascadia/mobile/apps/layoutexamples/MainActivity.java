package edu.cascadia.mobile.apps.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonToMakeTea;
    CharSequence toastText = "Test"; // what the toast says
    CheckBox checkBoxMilk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToMakeTea =(Button)findViewById(R.id.makeTea);
        checkBoxMilk = (CheckBox) findViewById(R.id.milkBox);

        buttonToMakeTea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toastText = toastText.toString() + " Milk";
                teaTea();
            }
        });
    }

    public void teaTea()
    {

        int duration = Toast.LENGTH_SHORT; // length of time toast is display

        Toast toast = Toast.makeText(this, toastText, duration);
        toast.show();
    }
}

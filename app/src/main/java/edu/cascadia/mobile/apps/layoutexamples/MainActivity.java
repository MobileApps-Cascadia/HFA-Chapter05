package edu.cascadia.mobile.apps.layoutexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tButton = (Button) findViewById(R.id.buttonToast);

        tButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showToast();
            }
        });
    }

    private void showToast(){
        CheckBox milk = (CheckBox) findViewById(R.id.milkBox);
        CheckBox sugar = (CheckBox) findViewById(R.id.sugarBox);
        CheckBox lemon = (CheckBox) findViewById(R.id.lemonBox);

        Spinner teaType = (Spinner) findViewById(R.id.teaType);

        String selection = teaType.getSelectedItem().toString();

        int duration = Toast.LENGTH_SHORT;

        StringBuilder output = new StringBuilder("Tea: " + selection + " with");

        if (milk.isChecked()){
            output.append(" milk,");
        }

        if (sugar.isChecked()){
            output.append(" sugar,");
        }

        if (lemon.isChecked()){
            output.append(" lemon,");
        }

        Toast toast = Toast.makeText(this, output, duration);
        toast.show();
    }
}

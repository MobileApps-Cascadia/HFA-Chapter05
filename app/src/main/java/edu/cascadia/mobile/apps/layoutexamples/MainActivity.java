package edu.cascadia.mobile.apps.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox boxmilk;
CheckBox boxsugar;
CheckBox boxlemon;
Spinner teatemp;
Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boxmilk = (CheckBox) findViewById(R.id.milkBox);
        boxsugar = (CheckBox) findViewById(R.id.sugarBox);
        boxlemon = (CheckBox) findViewById(R.id.lemonBox);
        teatemp = (Spinner) findViewById(R.id.teaType);
        submit = (Button) findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToast();
            }
        });


    }
    private void DisplayToast(){
        String message = "Your order of ";
        String teatempchoice = String.valueOf(teatemp.getSelectedItem());
        boolean checkmilk = boxmilk.isChecked();
        boolean checksugar = boxsugar.isChecked();
        boolean checklemon = boxlemon.isChecked();
        message += teatempchoice + " coffee with";
        if (checkmilk){
            message += " milk";
        }
        if (checksugar){
            message += " sugar";
        }
        if (checklemon){
            message += " lemon";
        }
        message += " has been placed. :)";
        Toast feedback = Toast.makeText(this, message, Toast.LENGTH_LONG);
        feedback.show();
    }

}

package edu.cascadia.mobile.apps.layoutexamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button_submit;
    Spinner spinner_teaTypes;
    CheckBox checkBox_milk;
    CheckBox checkBox_sugar;
    CheckBox checkBox_lemon;

    ArrayList<CheckBox> boxes = new ArrayList<CheckBox>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_submit = (Button)findViewById(R.id.button_submit);
        spinner_teaTypes = (Spinner)findViewById(R.id.teaType);
        checkBox_milk = (CheckBox)findViewById(R.id.milkBox);
        checkBox_sugar = (CheckBox)findViewById(R.id.sugarBox);
        checkBox_lemon = (CheckBox) findViewById(R.id.lemonBox);

        boxes.add(checkBox_milk);
        boxes.add(checkBox_lemon);
        boxes.add(checkBox_sugar);

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setToastText();
            }
        });
    }

    private void setToastText(){
        StringBuilder sb = new StringBuilder();


        sb.append("Tea: ");
        sb.append(spinner_teaTypes.getSelectedItem());
        sb.append(" with ");
        sb.append(getCheckedInformation());


        Toast toast = Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT);
        toast.show();
    }

    private String getCheckedInformation(){
        StringBuilder ret = new StringBuilder();
        boolean hasOtherValue = false;

        for(CheckBox box : boxes){
            if(box.isChecked()){
                if(hasOtherValue){
                    ret.append(" ");
                    ret.append(box.getText());
                }
                else{
                    ret.append(box.getText());
                    hasOtherValue = true;
                }
            }
        }

        return ret.toString();
    }
}

package edu.cascadia.mobile.apps.layoutexamples;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button buttonToToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById(R.id.teaType);
        buttonToToast = (Button) findViewById(R.id.button);
        buttonToToast.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                getToast();
            }
        });

    }

    public void getTea(){

        android.widget.Spinner spinner = (android.widget.Spinner) findViewById(R.id.teaType);
    }

    public void getToast(){
        Context context = getApplicationContext();
        CharSequence text = "Toasty!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

}

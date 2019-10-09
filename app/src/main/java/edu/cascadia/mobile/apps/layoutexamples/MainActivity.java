package edu.cascadia.mobile.apps.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getTea(){

        android.widget.Spinner spinner = (android.widget.Spinner) findViewById(R.id.teaType);
    }


}

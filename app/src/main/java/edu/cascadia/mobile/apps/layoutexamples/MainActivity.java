package edu.cascadia.mobile.apps.layoutexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_OrderButton(View view) {

        // Get the values from the on-screen controls
        String selection = ((Spinner) findViewById(R.id.teaType))
                .getSelectedItem().toString();
        Boolean withLemon = ((CheckBox) findViewById(R.id.lemonBox)).isChecked();
        Boolean withSugar = ((CheckBox) findViewById(R.id.sugarBox)).isChecked();
        Boolean withMilk = ((CheckBox) findViewById(R.id.milkBox)).isChecked();

        // Create the confirmation message
        StringBuilder message = new StringBuilder(selection).append(" tea");
        int options = (withLemon ? 1 : 0)  // 1 for lemon
                + 2 * (withSugar ? 1 : 0)  // 2 for sugar
                + 4 * (withMilk ? 1 : 0); // 4 for milk
        switch (options) {
            case 0: break;
            case 1: message.append(" with lemon"); break;
            case 2: message.append(" with sugar"); break;
            case 3: message.append(" with sugar and lemon"); break;
            case 4: message.append(" with milk"); break;
            case 5: message.append(" with milk and lemon"); break;
            case 6: message.append(" with milk and sugar"); break;
            case 7: message.append(" with milk, sugar, and lemon"); break;
        }
        // Display a confirmation message
        Toast toastMessage = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toastMessage.show();
    }
}

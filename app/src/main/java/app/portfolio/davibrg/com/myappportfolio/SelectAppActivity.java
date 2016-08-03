package app.portfolio.davibrg.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_app);

        ArrayList<Button> buttonArrayList = new ArrayList<Button>();

        buttonArrayList.add((Button) findViewById(R.id.button));
        buttonArrayList.add((Button) findViewById(R.id.button2));
        buttonArrayList.add((Button) findViewById(R.id.button3));
        buttonArrayList.add((Button) findViewById(R.id.button4));
        buttonArrayList.add((Button) findViewById(R.id.button5));
        buttonArrayList.add((Button) findViewById(R.id.button6));


        for(Button button : buttonArrayList) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showAppNameToast((Button) v);
                }
            });
        }
    }

    private void showAppNameToast(Button button) {
        String toastString = "This button will launch " + button.getText().toString().toLowerCase()
                + " app!";
        Toast.makeText(getApplicationContext(),toastString, Toast.LENGTH_SHORT).show();
    }
}

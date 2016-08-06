package app.portfolio.davibrg.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_app);

    }

    public void showAppNameToast(View v) {
        Button button = (Button) v;
        String toastString = String.format(getResources().getString(R.string.portfolio_toast),
                button.getText().toString().toLowerCase());
        Toast.makeText(getApplicationContext(),toastString, Toast.LENGTH_SHORT).show();
    }
}

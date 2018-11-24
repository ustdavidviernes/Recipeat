package ust.com.recipeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void home(View v) {
        Intent i = null, chooser = null;
        i = new Intent(this, HomeActivity.class);
        startActivity(i);

    }
    public void lab(View v) {
        Intent i = null, chooser = null;
        i = new Intent(this, Cuisines.class);
        startActivity(i);

    }
    public void cuisine(View v) {
        Intent i = null, chooser = null;
            i = new Intent(this, Cuisines.class);
            startActivity(i);

    }
    public void inventory(View v) {
        Intent i = null, chooser = null;
        i = new Intent(this, Cuisines.class);
        startActivity(i);

    }
}

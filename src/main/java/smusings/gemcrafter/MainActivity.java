package smusings.gemcrafter;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends SetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define the button
        calculateButton = (Button)findViewById(R.id.calculate_button);

        //define the need
        need_flawless_royal = (EditText)findViewById(R.id.need_flawless_royal);
        need_royal = (EditText)findViewById(R.id.need_royal);
        need_flawless_imperial = (EditText)findViewById(R.id.need_flawless_imperial);
        need_imperial = (EditText)findViewById(R.id.need_imperial);
        need_marquise = (EditText)findViewById(R.id.need_marquise);

        //define the have
        have_flawless_royal = (EditText)findViewById(R.id.have_flawless_royal);
        have_royal = (EditText)findViewById(R.id.have_royal);
        have_flawless_imperial = (EditText)findViewById(R.id.have_flawless_imperial);
        have_imperial = (EditText)findViewById(R.id.have_imperial);
        have_marquise = (EditText)findViewById(R.id.have_marquise);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flawlessRoyal();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

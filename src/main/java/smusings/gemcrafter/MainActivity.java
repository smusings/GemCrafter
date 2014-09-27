package smusings.gemcrafter;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends SetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define the button
        calculateButton = (Button) findViewById(R.id.calculate_button);
        gold_amount= (TextView) findViewById(R.id.gold_display);

        //define the need
        need_flawless_royal = (EditText) findViewById(R.id.need_flawless_royal);
        need_royal = (EditText) findViewById(R.id.need_royal);
        need_flawless_imperial = (EditText) findViewById(R.id.need_flawless_imperial);
        need_imperial = (EditText) findViewById(R.id.need_imperial);
        need_marquise = (EditText) findViewById(R.id.need_marquise);

        //define the have
        have_flawless_royal = (EditText) findViewById(R.id.have_flawless_royal);
        have_royal = (EditText) findViewById(R.id.have_royal);
        have_flawless_imperial = (EditText) findViewById(R.id.have_flawless_imperial);
        have_imperial = (EditText) findViewById(R.id.have_imperial);
        have_marquise = (EditText) findViewById(R.id.have_marquise);

        need_flawless_royal.setOnClickListener(clearField);

        //onclick runs flawlessRoyal, which triggers a chain of methods
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
        if (id == R.id.action_reset) {
            need_flawless_royal.setText("0");
            need_royal.setText("0");
            need_flawless_imperial.setText("0");
            need_imperial.setText("0");
            need_marquise.setText("0");

            have_flawless_royal.setText("0");
            have_royal.setText("0");
            have_flawless_imperial.setText("0");
            have_imperial.setText("0");
            have_marquise.setText("0");
            return true;
        }
        if (id == R.id.action_gem_type) {
            DialogFragment dialogFragment = new GemDialogFragment();
            dialogFragment.show(getFragmentManager(), "GemDialogFragment");
        }
        return super.onOptionsItemSelected(item);
    }
}
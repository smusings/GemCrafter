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

        //define the need int
        needFlawlessRoyal = Integer.parseInt(need_flawless_royal.getText().toString());
        if (needFlawlessRoyal.equals("")){
            needFlawlessRoyal = 0;
        }
        needRoyal = Integer.parseInt(need_royal.getText().toString());
        if (needRoyal.equals("")){
            needRoyal = 0;
        }
        needFlawlessImperial = Integer.parseInt(need_flawless_imperial.getText().toString());
        if (needFlawlessImperial.equals("")){
            needFlawlessImperial = 0;
        }
        needImperial = Integer.parseInt(need_imperial.getText().toString());
        if (needImperial.equals("")){
            needImperial = 0;
        }
        needMarquise = Integer.parseInt(need_marquise.getText().toString());
        if (needMarquise.equals("")){
            needMarquise = 0;
        }

        haveFlawlessRoyal = Integer.parseInt(have_flawless_royal.getText().toString());
        if (haveFlawlessRoyal.equals("")){
            haveFlawlessRoyal=0;
        }
        haveRoyal = Integer.parseInt(have_royal.getText().toString());
        if (haveRoyal.equals("")){
            haveRoyal=0;
        }
        haveFlawlessImperial = Integer.parseInt(have_flawless_imperial.getText().toString());
        if (haveFlawlessImperial.equals("")){
            haveFlawlessImperial=0;
        }
        haveImperial = Integer.parseInt(have_imperial.getText().toString());
        if (haveImperial.equals("")){
            haveImperial=0;
        }
        haveMarquise = Integer.parseInt(have_marquise.getText().toString());
        if (haveMarquise.equals("")){
            haveMarquise=0;
        }



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

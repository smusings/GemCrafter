package smusings.gemcrafter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    public Button calculateButton;
    // the edit textx
    public EditText need_flawless_royal;
    public EditText need_royal;
    public EditText need_flawless_imperial;
    public EditText need_imperial;
    public EditText need_marquise;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        need_flawless_royal=(EditText)findViewById(R.id.need_flawless_royal);
        need_royal=(EditText)findViewById(R.id.need_royal);
        need_flawless_imperial=(EditText)findViewById(R.id.need_flawless_imperial);
        need_imperial=(EditText)findViewById(R.id.need_imperial);
        need_marquise=(EditText)findViewById(R.id.need_marquise);
        calculateButton=(Button)findViewById(R.id.calculate_button);


        //set initial count to 0
        need_flawless_royal.setText("0");
        need_royal.setText("0");
        need_flawless_imperial.setText("0");
        need_imperial.setText("0");
        need_marquise.setText("0");



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //for the need
                int needFlawlessRoyal=new Integer(need_flawless_royal.getText().toString()).intValue();
                int needRoyal=new Integer(need_royal.getText().toString()).intValue();
                int needFlawlessImperial=new Integer(need_flawless_imperial.getText().toString()).intValue();
                int needImperial=new Integer(need_imperial.getText().toString()).intValue();

                if (needFlawlessRoyal!=0){
                    need_royal.setText(Integer.toString(needFlawlessRoyal*3));
                    need_flawless_imperial.setText(Integer.toString(needFlawlessRoyal*9));
                    need_imperial.setText(Integer.toString(needFlawlessRoyal*27));
                    need_marquise.setText(Integer.toString(needFlawlessRoyal*81));
                } else if(needRoyal != 0){
                    need_flawless_imperial.setText(Integer.toString(needRoyal*3));
                    need_imperial.setText(Integer.toString(needRoyal*9));
                    need_marquise.setText(Integer.toString(needRoyal*27));
                }else if(needFlawlessImperial !=0){

                    need_imperial.setText(Integer.toString(needFlawlessImperial*3));
                    need_marquise.setText(Integer.toString(needFlawlessImperial*9));

                }else if(needImperial != 0){

                    need_marquise.setText(Integer.toString(needImperial*3));

                } else{
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                }

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

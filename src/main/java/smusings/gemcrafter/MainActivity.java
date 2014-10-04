package smusings.gemcrafter;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends SetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define the button
        calculateButton = (Button) findViewById(R.id.calculate_button);

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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //the imageviews to change gem type
        ImageView flawless_royal_image = (ImageView)findViewById(R.id.flawless_royal_gem);
        ImageView royal_image = (ImageView)findViewById(R.id.royal_gem);
        ImageView flawless_imperal_image = (ImageView)findViewById(R.id.flawless_imperial_gem);
        ImageView imperal_image = (ImageView)findViewById(R.id.imperial_gem);
        ImageView marquise_image = (ImageView)findViewById(R.id.marquise_gem);

        int id = item.getItemId();
        if (id == R.id.action_reset) {
            //need
            need_flawless_royal.setText("0");
            need_royal.setText("0");
            need_flawless_imperial.setText("0");
            need_imperial.setText("0");
            need_marquise.setText("0");
            //have
            have_flawless_royal.setText("0");
            have_royal.setText("0");
            have_flawless_imperial.setText("0");
            have_imperial.setText("0");
            have_marquise.setText("0");
            return true;
        }
        if (id == R.id.action_amethyst){
            flawless_royal_image.setImageResource(R.drawable.flawless_royal_amethyst);
            royal_image.setImageResource(R.drawable.royal_amethyst);
            flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_amethyst);
            imperal_image.setImageResource(R.drawable.imperial_amethyst);
            marquise_image.setImageResource(R.drawable.marq_amethyst);
        }
        if (id == R.id.action_diamond){
            flawless_royal_image.setImageResource(R.drawable.flawless_royal_diamond);
            royal_image.setImageResource(R.drawable.royal_diamond);
            flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_diamond);
            imperal_image.setImageResource(R.drawable.imperial_diamond);
            marquise_image.setImageResource(R.drawable.marq_diamond);
        }
        if (id == R.id.action_Emerald){
            flawless_royal_image.setImageResource(R.drawable.flawless_royal_emerald);
            royal_image.setImageResource(R.drawable.royal_emerald);
            flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_emerald);
            imperal_image.setImageResource(R.drawable.imperial_emerald);
            marquise_image.setImageResource(R.drawable.marq_emerald);
        }
        if (id == R.id.action_Ruby){
            flawless_royal_image.setImageResource(R.drawable.flawless_royal_ruby);
            royal_image.setImageResource(R.drawable.royal_ruby);
            flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_ruby);
            imperal_image.setImageResource(R.drawable.imperial_ruby);
            marquise_image.setImageResource(R.drawable.marq_ruby);
        }
        if (id == R.id.action_topaz){
            flawless_royal_image.setImageResource(R.drawable.flawless_royal_topaz);
            royal_image.setImageResource(R.drawable.royal_topaz);
            flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_topaz);
            imperal_image.setImageResource(R.drawable.imperial_topaz);
            marquise_image.setImageResource(R.drawable.marq_topaz);
        }
        return super.onOptionsItemSelected(item);
    }
}
package smusings.gemcrafter;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SetUpActivity extends Activity{

    public Button calculateButton;
    public TextView gold_amount;
    // the edit text for need
    public EditText need_flawless_royal;
    public EditText need_royal;
    public EditText need_flawless_imperial;
    public EditText need_imperial;
    public EditText need_marquise;
    //the edit text for have
    public EditText have_flawless_royal;
    public EditText have_royal;
    public EditText have_flawless_imperial;
    public EditText have_imperial;
    public EditText have_marquise;

    /*
        First it checks to see if the edittext is blank, if so it sets it to 0

        then we get the int value of edittext, and do some maths and decesions
        if less than 0 we stop and set it to 0
        if greater than 0 we go forward
        if 0 we go forward to see if we need to do more maths
     */

    public void flawlessRoyal(){
        if (need_flawless_royal.getText().toString().matches("")){
            need_flawless_royal.setText("0");
        }
        if (have_flawless_royal.getText().toString().matches("")){
            have_flawless_royal.setText("0");
        }

        int flawless_Royal_Count = Integer.parseInt(need_flawless_royal.getText().toString())
                - Integer.parseInt(have_flawless_royal.getText().toString());


        if (flawless_Royal_Count > 0){
            need_flawless_royal.setText(Integer.toString(flawless_Royal_Count));
        }
        else if (flawless_Royal_Count < 0){
            need_flawless_royal.setText("0");
        }
        else if (flawless_Royal_Count == 0){
            need_flawless_royal.setText(Integer.toString(flawless_Royal_Count));
        }

        royalGem();
    }

    public void royalGem(){
        if (need_royal.getText().toString().matches("")){
            need_royal.setText("0");
        }
        if (have_royal.getText().toString().matches("")){
            have_royal.setText("0");
        }

        int royal_Count;
        if (Integer.parseInt(need_flawless_royal.getText().toString()) == 0){
            royal_Count = (Integer.parseInt(need_royal.getText().toString()))
                    - Integer.parseInt(have_royal.getText().toString());
        } else {
            royal_Count = (Integer.parseInt(need_flawless_royal.getText().toString()) * 3)
                    - Integer.parseInt(have_royal.getText().toString());
        }

            if (royal_Count > 0){
                need_royal.setText(Integer.toString(royal_Count));
            }
            else if (royal_Count < 0){
                need_royal.setText("0");
            }
            else if (royal_Count == 0){
                need_royal.setText(Integer.toString(royal_Count));
            }
        flawlessImperial();

    }

    public void flawlessImperial(){
        if (need_flawless_imperial.getText().toString().matches("")){
            need_flawless_imperial.setText("0");
        }
        if (have_flawless_imperial.getText().toString().matches("")){
            have_flawless_imperial.setText("0");
        }

        int flawless_imperial_Count;
        if (Integer.parseInt(need_royal.getText().toString()) == 0){
            flawless_imperial_Count = (Integer.parseInt(need_flawless_imperial.getText().toString()))
                    - Integer.parseInt(have_flawless_imperial.getText().toString());
        } else {
            flawless_imperial_Count = (Integer.parseInt(need_royal.getText().toString())*3)
                    - Integer.parseInt(have_flawless_imperial.getText().toString());
        }

        if (flawless_imperial_Count > 0){
            need_flawless_imperial.setText(Integer.toString(flawless_imperial_Count));
        }
        else if (flawless_imperial_Count < 0){
            need_flawless_imperial.setText("0");
        }
        else if (flawless_imperial_Count == 0){
            need_flawless_imperial.setText(Integer.toString(flawless_imperial_Count));
        }
        imperialGem();
    }

    public void imperialGem(){
        if (need_imperial.getText().toString().matches("")){
            need_imperial.setText("0");
        }
        if (have_imperial.getText().toString().matches("")){
            have_imperial.setText("0");
        }

        int imperial_Count;
        if (Integer.parseInt(need_flawless_imperial.getText().toString()) == 0){
            imperial_Count = (Integer.parseInt(need_imperial.getText().toString()))
                    - Integer.parseInt(have_imperial.getText().toString());
        } else {
            imperial_Count = (Integer.parseInt(need_flawless_imperial.getText().toString())*3)
                    - Integer.parseInt(have_imperial.getText().toString());
        }


        if (imperial_Count > 0){
            need_imperial.setText(Integer.toString(imperial_Count));
        }
        else if (imperial_Count < 0){
            need_imperial.setText("0");
        }
        else if (imperial_Count == 0){
            need_imperial.setText(Integer.toString(imperial_Count));
        }

        marquiseCount();
    }

    public void marquiseCount(){
        if (need_marquise.getText().toString().matches("")){
            need_marquise.setText("0");
        }
        if (have_marquise.getText().toString().matches("")){
            have_marquise.setText("0");
        }

        int marquise_Count;
        if (Integer.parseInt(need_imperial.getText().toString()) == 0){
            marquise_Count = Integer.parseInt(need_marquise.getText().toString())
                    - Integer.parseInt(have_marquise.getText().toString());
        } else {
          marquise_Count = (Integer.parseInt(need_imperial.getText().toString())*3)
                    - Integer.parseInt(have_marquise.getText().toString());
        }


        if (marquise_Count > 0){
            need_marquise.setText(Integer.toString(marquise_Count));
        }
        else if (marquise_Count < 0){
            need_marquise.setText("0");
        }
        else if (marquise_Count == 0){
            need_marquise.setText(Integer.toString(marquise_Count));
        }
        totalGold();
    }

    public void totalGold(){
        int flawlessRoyalSum = Integer.parseInt(need_flawless_royal.getText().toString()) * 500000;
        int RoyalSum = Integer.parseInt(need_royal.getText().toString()) * 400000;
        int flawlessImperialSum = Integer.parseInt(need_flawless_imperial.getText().toString()) * 300000;
        int ImperialSum = Integer.parseInt(need_imperial.getText().toString()) * 200000;

        int totalSum = flawlessRoyalSum + RoyalSum + flawlessImperialSum + ImperialSum;

        gold_amount.setText(Integer.toString(totalSum));


    }

    public void zeroAll(){
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
    }
}

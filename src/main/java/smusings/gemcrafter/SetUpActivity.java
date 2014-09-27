package smusings.gemcrafter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SetUpActivity extends Activity {

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
    //ints for need/have
    public Integer needFlawlessRoyal;
    public Integer needRoyal;
    public Integer needFlawlessImperial;
    public Integer needImperial;
    public Integer needMarquiese;
    public Integer haveFlawlessRoyal;
    public Integer haveRoyal;
    public Integer haveFlawlessImperial;
    public Integer haveImperial;
    public Integer haveMarquiese;
    //ints for the values
    public int flawless_Royal_Count;
    public int royal_Count;
    public int flawless_imperial_Count;
    public int imperial_Count;
    public int marquise_Count;

    //we will use this to calculate how much of each gem we need per gem type
    public int getGemCount(int upper, int lowerNeed, int lowerHave){
        int gemCount;
        if (upper == 0){
            gemCount = lowerNeed - lowerHave;
        } else {
            gemCount = upper*3 - lowerHave;
        }
        return gemCount;
    }

    public void amountNeeded(int count, EditText need){
        if (count >= 0){
            need.setText(Integer.toString(count));
        }
        else if (count < 0){
            //depending on what it is we need to zero different things for money calc
            if (need == need_flawless_royal){
                need_flawless_royal.setText("0");
                need_royal.setText("0");
                need_flawless_imperial.setText("0");
                need_imperial.setText("0");
                need_marquise.setText("0");
            }
            else if (need == need_royal){
                need_royal.setText("0");
                need_flawless_imperial.setText("0");
                need_imperial.setText("0");
                need_marquise.setText("0");
            }
            else if (need == need_flawless_imperial){
                need_flawless_imperial.setText("0");
                need_imperial.setText("0");
                need_marquise.setText("0");
            }
            else if (need == need_imperial){
                need_imperial.setText("0");
                need_marquise.setText("0");
            }
            else if (need == need_marquise){
                need_marquise.setText("0");
            }
        }
    }

    public void flawlessRoyal(){
        //check to see if blank, if blank we set to 0
        if (need_flawless_royal.getText().toString().matches("")){
            need_flawless_royal.setText("0");
        }
        if (have_flawless_royal.getText().toString().matches("")){
            have_flawless_royal.setText("0");
        }

        //defines the int we use
        needFlawlessRoyal = Integer.parseInt(need_flawless_royal.getText().toString());
        haveFlawlessRoyal = Integer.parseInt(have_flawless_royal.getText().toString());


        //maths to see how many we need
        flawless_Royal_Count = needFlawlessRoyal - haveFlawlessRoyal;

        //number determines what we do
        amountNeeded(flawless_Royal_Count, need_flawless_royal);

        //send to next gem
        need_flawless_royal.setCursorVisible(false);
        have_flawless_royal.setCursorVisible(false);
        royalGem();
    }

    public void royalGem(){
        //check to see if blank, if blank we set to 0
        if (need_royal.getText().toString().matches("")){
            need_royal.setText("0");
        }
        if (have_royal.getText().toString().matches("")){
            have_royal.setText("0");
        }


        needRoyal = Integer.parseInt(need_royal.getText().toString());
        haveRoyal = Integer.parseInt(have_royal.getText().toString());

        //maths to see how many we need
        royal_Count = getGemCount(flawless_Royal_Count, needRoyal, haveRoyal);

        //numebr determiend what we do
        amountNeeded(royal_Count, need_royal);


        need_royal.setCursorVisible(false);
        have_royal.setCursorVisible(false);
        flawlessImperial();

    }

    public void flawlessImperial(){
        //check to see if blank, if blank we set to 0
        if (need_flawless_imperial.getText().toString().matches("")){
            need_flawless_imperial.setText("0");
        }
        if (have_flawless_imperial.getText().toString().matches("")){
            have_flawless_imperial.setText("0");
        }
        needFlawlessImperial = Integer.parseInt(need_flawless_imperial.getText().toString());
        haveFlawlessImperial = Integer.parseInt(have_flawless_imperial.getText().toString());


        //maths to see how many we need
        flawless_imperial_Count = getGemCount(royal_Count,
                needFlawlessImperial, haveFlawlessImperial);

        //number determiend what we do
       amountNeeded(flawless_imperial_Count, need_flawless_imperial);

        need_flawless_imperial.setCursorVisible(false);
        have_flawless_imperial.setCursorVisible(false);
        imperialGem();
    }

    public void imperialGem(){
        //check to see if blank, if blank we set to 0
        if (need_imperial.getText().toString().matches("")){
            need_imperial.setText("0");
        }
        if (have_imperial.getText().toString().matches("")){
            have_imperial.setText("0");
            need_marquise.setText("0");
        }
        needImperial = Integer.parseInt(need_imperial.getText().toString());
        haveImperial = Integer.parseInt(have_imperial.getText().toString());


        //maths to see how many we need
        imperial_Count = getGemCount(flawless_imperial_Count,
                needImperial, haveImperial);

        //number determined what we do
        amountNeeded(imperial_Count, need_imperial);

        need_imperial.setCursorVisible(false);
        have_imperial.setCursorVisible(false);
        marquiseCount();
    }

    public void marquiseCount(){
        //check to see if blank, if blank we set to 0
        if (need_marquise.getText().toString().matches("")){
            need_marquise.setText("0");
        }
        if (have_marquise.getText().toString().matches("")){
            have_marquise.setText("0");
        }
        needMarquiese = Integer.parseInt(need_marquise.getText().toString());
        haveMarquiese = Integer.parseInt(have_marquise.getText().toString());

        //maths to see how many we need
        marquise_Count = getGemCount(imperial_Count,
                needMarquiese, haveMarquiese);

        //number determines what we do
        amountNeeded(marquise_Count, need_marquise);

        need_marquise.setCursorVisible(false);
        have_marquise.setCursorVisible(false);
        totalGold();
    }

    public void totalGold(){
        //multiplies how many gems you need times the cost to make one of those gems
        int flawlessRoyalSum = Integer.parseInt(need_flawless_royal.getText().toString()) * 500000;
        int RoyalSum = Integer.parseInt(need_royal.getText().toString()) * 400000;
        int flawlessImperialSum = Integer.parseInt(need_flawless_imperial.getText().toString()) * 300000;
        int ImperialSum = Integer.parseInt(need_imperial.getText().toString()) * 200000;

        //sums up the total amount of gold needed to make a gem
        int totalSum = flawlessRoyalSum + RoyalSum + flawlessImperialSum + ImperialSum;

        //sets the gold amount to text
        gold_amount.setText(Integer.toString(totalSum));
    }

    public void clearFieldTest(View v){
        ((EditText) v).setText("");
        ((EditText) v).setCursorVisible(true);
    }
}
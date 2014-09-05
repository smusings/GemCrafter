package smusings.gemcrafter;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class SetUpActivity extends Activity{

    public Button calculateButton;
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

    //the ints we need/have
    public Integer needFlawlessRoyal;
    public Integer needRoyal;
    public Integer needFlawlessImperial;
    public Integer needImperial;
    public Integer needMarquise;
    public Integer haveFlawlessRoyal;
    public Integer haveRoyal;
    public Integer haveFlawlessImperial;
    public Integer haveImperial;
    public Integer haveMarquise;

    /*
        each method will get the need-have count and do one of 3 results from the number gotten

        if the number is not negative it goes to the next method inline
        there it sees if it needs to start the calculation or continue it

        this goes on until we reach the end
     */

    public void flawlessRoyal(){
        int flawless_Royal_Count = needFlawlessRoyal - haveFlawlessRoyal;

        if (flawless_Royal_Count > 0){
            need_flawless_imperial.setText(Integer.toString(flawless_Royal_Count));
            royalGem();
        }
        else if (flawless_Royal_Count < 0){
            need_flawless_imperial.setText("0");
        }
        else if (flawless_Royal_Count == 0){
            need_flawless_imperial.setText(Integer.toString(flawless_Royal_Count));
            royalGem();
        }
    }

    public void royalGem(){
        int royal_Count;
        if (Integer.parseInt(need_flawless_imperial.getText().toString()) == 0){
            royal_Count = (Integer.parseInt(need_royal.getText().toString()))
                    - Integer.parseInt(have_royal.getText().toString());
        } else {
            royal_Count = (Integer.parseInt(need_flawless_royal.getText().toString()) * 3)
                    - Integer.parseInt(have_royal.getText().toString());
        }

            if (royal_Count > 0){
                need_royal.setText(Integer.toString(royal_Count));
                flawlessImperial();
            }
            else if (royal_Count < 0){
                need_royal.setText("0");
            }
            else if (royal_Count == 0){
                need_royal.setText(Integer.toString(royal_Count));
                flawlessImperial();
            }

    }

    public void flawlessImperial(){
        int flawless_imperial_Count;
        if (Integer.parseInt(need_royal.getText().toString()) == 0){
            flawless_imperial_Count = (Integer.parseInt(need_flawless_imperial.getText().toString()))
                    - Integer.parseInt(have_flawless_imperial.getText().toString());
        } else {
            flawless_imperial_Count = (Integer.parseInt(need_royal.getText().toString()))
                    - Integer.parseInt(have_flawless_imperial.getText().toString());
        }

        if (flawless_imperial_Count > 0){
            need_flawless_imperial.setText(Integer.toString(flawless_imperial_Count));
            imperialGem();
        }
        else if (flawless_imperial_Count < 0){
            need_flawless_imperial.setText("0");
        }
        else if (flawless_imperial_Count == 0){
            need_flawless_imperial.setText(Integer.toString(flawless_imperial_Count));
            imperialGem();
        }
    }

    public void imperialGem(){
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
            marquiseCount();
        }
        else if (imperial_Count < 0){
            need_imperial.setText("0");
        }
        else if (imperial_Count == 0){
            need_imperial.setText(Integer.toString(imperial_Count));
            marquiseCount();
        }
    }

    public void marquiseCount(){
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
    }

}

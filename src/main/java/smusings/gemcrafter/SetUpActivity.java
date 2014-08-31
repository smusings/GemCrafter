package smusings.gemcrafter;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetUpActivity extends Activity {

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

    //need listeners
    public View.OnClickListener flawlessRoyalNeedListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            need_flawless_royal.setText("");
        }
    };

    public View.OnClickListener RoyalNeedListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            need_royal.setText("");
        }
    };

    public View.OnClickListener flawlessImperialNeedListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            need_flawless_imperial.setText("");
        }
    };

    public View.OnClickListener ImperialNeedListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            need_imperial.setText("");
        }
    };

    public View.OnClickListener marquiseNeedListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            need_marquise.setText("");
        }
    };

    // have listeners

    public View.OnClickListener flawlessRoyalHaveListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            have_flawless_royal.setText("");
        }
    };

    public View.OnClickListener RoyalHaveListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            have_royal.setText("");
        }
    };

    public View.OnClickListener flawlessImperialHaveListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            have_flawless_imperial.setText("");
        }
    };

    public View.OnClickListener ImperialHaveListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            have_imperial.setText("");
        }
    };

    public View.OnClickListener marquiseHaveListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            have_marquise.setText("");
        }
    };

    //button listener
    public View.OnClickListener buttonListener=new View.OnClickListener() {
        //so the ints are returning "" if empty giving error
        //find a way around that

        @Override
        public void onClick(View v) {
            Integer needFR=new Integer(need_flawless_royal.getText().toString()).intValue();
            Integer needR=new Integer(need_royal.getText().toString()).intValue();
            Integer needFI=new Integer(need_flawless_imperial.getText().toString()).intValue();
            Integer needI=new Integer(need_imperial.getText().toString()).intValue();
            Integer needM=new Integer(need_marquise.getText().toString()).intValue();


            Integer haveFR=new Integer(have_flawless_royal.getText().toString()).intValue();
            Integer haveR=new Integer(need_royal.getText().toString()).intValue();
            Integer haveFI=new Integer(need_flawless_imperial.getText().toString()).intValue();
            Integer haveI=new Integer(need_imperial.getText().toString()).intValue();
            Integer haveM=new Integer(need_marquise.getText().toString()).intValue();


            Integer intFR=needFR-haveFR;
            Integer intR=needR-haveR;
            Integer intFI=needFI-haveFI;
            Integer intI=needI-haveI;
            Integer intM=needM-haveM;   //do i really need this one?


            //can i break this up into methods?
            if(intFR > 0){
                //TODO: make the numbers count the have
                need_royal.setText(Integer.toString(intFR*3));
                need_flawless_imperial.setText(Integer.toString(intFR*9));
                need_imperial.setText(Integer.toString(intFR*27));
                need_marquise.setText(Integer.toString(intFR*81));
            } else if (intFR < 0){
                need_flawless_royal.setText("0");
            } else if (intFR==0){
                //here we will keep going down the list to see if we need to count the others.
                if (intR >0){
                    need_flawless_imperial.setText(Integer.toString(intR*3));
                    need_imperial.setText(Integer.toString(intR*9));
                    need_marquise.setText(Integer.toString(intR*27));
                } else if (intR < 0){
                    need_royal.setText("0");
                } else if (intR == 0){
                    if(intFI > 0){

                    }
                }
            }
        }
    };


    public void zeroSum(){
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

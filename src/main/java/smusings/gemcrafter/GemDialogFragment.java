package smusings.gemcrafter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


public class GemDialogFragment extends DialogFragment {

    static GemDialogFragment newInstance(){
        return new GemDialogFragment();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        String[] gems = new String[] {"Ruby", "Topaz", "Emerald", "Amethyst", "Diamond"};

        final ImageView flawless_royal_image = (ImageView)getActivity().findViewById(R.id.flawless_royal_gem);
        final ImageView royal_image = (ImageView)getActivity().findViewById(R.id.royal_gem);
        final ImageView flawless_imperal_image = (ImageView)getActivity().findViewById(R.id.flawless_imperial_gem);
        final ImageView imperal_image = (ImageView)getActivity().findViewById(R.id.imperial_gem);
        final ImageView marquise_image = (ImageView)getActivity().findViewById(R.id.marquise_gem);

        builder.setItems(gems, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        //ruby
                        Toast.makeText(getActivity(), "ruby", Toast.LENGTH_SHORT).show();
                        flawless_royal_image.setImageResource(R.drawable.flawless_royal_ruby);
                        royal_image.setImageResource(R.drawable.royal_ruby);
                        flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_ruby);
                        imperal_image.setImageResource(R.drawable.imperial_ruby);
                        marquise_image.setImageResource(R.drawable.marq_ruby);
                        break;
                    case 1:
                        //topaz
                        Toast.makeText(getActivity(), "topaz", Toast.LENGTH_SHORT).show();
                        flawless_royal_image.setImageResource(R.drawable.flawless_royal_topaz);
                        royal_image.setImageResource(R.drawable.royal_topaz);
                        flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_topaz);
                        imperal_image.setImageResource(R.drawable.imperial_topaz);
                        marquise_image.setImageResource(R.drawable.marq_topaz);
                        break;
                    case 2:
                        //emerald
                        Toast.makeText(getActivity(), "emerald", Toast.LENGTH_SHORT).show();
                        flawless_royal_image.setImageResource(R.drawable.flawless_royal_emerald);
                        royal_image.setImageResource(R.drawable.royal_emerald);
                        flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_emerald);
                        imperal_image.setImageResource(R.drawable.imperial_emerald);
                        marquise_image.setImageResource(R.drawable.marq_emerald);
                        break;
                    case 3:
                        //amethyst
                        Toast.makeText(getActivity(), "amethyst", Toast.LENGTH_SHORT).show();
                        flawless_royal_image.setImageResource(R.drawable.flawless_royal_amethyst);
                        royal_image.setImageResource(R.drawable.royal_amethyst);
                        flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_amethyst);
                        imperal_image.setImageResource(R.drawable.imperial_amethyst);
                        marquise_image.setImageResource(R.drawable.marq_amethyst);
                        break;
                    case 4:
                        //diamond
                        Toast.makeText(getActivity(), "diamond", Toast.LENGTH_SHORT).show();
                        flawless_royal_image.setImageResource(R.drawable.flawless_royal_diamond);
                        royal_image.setImageResource(R.drawable.royal_diamond);
                        flawless_imperal_image.setImageResource(R.drawable.flawless_imperial_diamond);
                        imperal_image.setImageResource(R.drawable.imperial_diamond);
                        marquise_image.setImageResource(R.drawable.marq_diamond);
                        break;
                }
            }
        });
        return builder.create();
    }

    public interface GemDialogListener{
    }

    GemDialogListener mListener;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try {
            mListener = (GemDialogListener) activity;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must impliemnt GemDialogListener");
        }
    }
}
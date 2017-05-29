package com.example.copelabs.myapplication;

import android.app.DialogFragment;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by copelabs on 26/05/2017.
 */

public class DialogRange {

    private int mValue;

    public DialogRange(Context c, final int value){

        mValue=value;

        LayoutInflater layoutInflater = LayoutInflater.from(c);

        View promptView = layoutInflater.inflate(R.layout.dialog_range, null);

        final AlertDialog alertD = new AlertDialog.Builder(c).create();

        ImageButton btnAdd1 = (ImageButton) promptView.findViewById(R.id.imageButton);

        ImageButton btnAdd2 = (ImageButton) promptView.findViewById(R.id.imageButton2);

        Button btn = (Button) promptView.findViewById(R.id.btnSave);

        final TextView text = (TextView) promptView.findViewById(R.id.textView3);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alertD.cancel();
            }
        });

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(mValue<10)
                    mValue++;
                // btnAdd1 has been clicked
                text.setText(mValue+"");

            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mValue>0)
                    mValue--;
                // btnAdd2 has been clicked
                text.setText(mValue+"");

            }
        });

        alertD.setView(promptView);

        alertD.show();
    }

}

package com.example.copelabs.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
;import static com.example.copelabs.myapplication.R.id.imageButton2;

public class MainActivity extends AppCompatActivity {

    private int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*fdfadfhgh*/

        DialogRange dialogRange = new DialogRange(this,0);
       /* value=0;

        LayoutInflater layoutInflater = LayoutInflater.from(this);

        View promptView = layoutInflater.inflate(R.layout.dialog_range, null);

        final AlertDialog alertD = new AlertDialog.Builder(this).create();

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

                if(value<10)
                value++;
                // btnAdd1 has been clicked
                text.setText(value+"");

            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(value>0)
                    value--;
                // btnAdd2 has been clicked
                text.setText(value+"");

            }
        });

        alertD.setView(promptView);

        alertD.show();



*/
    }


}

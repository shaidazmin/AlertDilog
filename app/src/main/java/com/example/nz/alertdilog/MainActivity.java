package com.example.nz.alertdilog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button ;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle(R.string.titel);
        alertDialog.setMessage("Do you want to exit");
        alertDialog.setIcon(R.drawable.icon);

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"No",Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Cancle",Toast.LENGTH_SHORT).show();
            }
        });

        alertDialog.show();




    }
}

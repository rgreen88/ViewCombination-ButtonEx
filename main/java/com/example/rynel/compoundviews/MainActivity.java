package com.example.rynel.compoundviews;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    private void setSupportActionBar(Toolbar myToolbar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);  //todo: add menu items and overflow
        return true;
    }

    public void onClick(View view) {
        String text = view.getId() == R.id.view1 ? "Background" : "Foreground";  //text toast for whichever clicked
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }



    public void btnViewDialog(View view){  //fixme: btn crashes at dialog---add new layout and inflate on ButtonActivity to set this method?
                                           //fixed: added View object as needed
        Log.d(TAG, "btnViewDialog: " + "btn click");

        // 1. Instantiate an AlertDialog.Builder with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

// 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage("hi")
                .setTitle("A Greeting");

// 3. Get the AlertDialog from create()
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}

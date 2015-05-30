package com.apps4tracking.androidnanotop;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        new setupButton(context, R.id.btn_spotify, R.string.btn_spotify);
        new setupButton(context, R.id.btn_scores, R.string.btn_scores);
        new setupButton(context, R.id.btn_library, R.string.btn_library);
        new setupButton(context, R.id.btn_bigger, R.string.btn_bigger);
        new setupButton(context, R.id.btn_xyz, R.string.btn_xyz);
        new setupButton(context, R.id.btn_capstone, R.string.btn_capstone);
    }

    class setupButton {
        setupButton(Context context, int id, int strid) {
            final Context ctx = context;
            final String msg = "This button will launch my, " + getString(strid) + ", app!";
            final Button btn = (Button) findViewById(id);
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.jeffondich.buttondemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ButtonDemoActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);

        Button button = (Button)this.findViewById(R.id.cowButton);
        button.setOnClickListener(this);

        button = (Button)this.findViewById(R.id.pigButton);
        View.OnClickListener pigClickListener = new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Th-th-that's all, folks!", Toast.LENGTH_SHORT);
                toast.show();
            }
        };
        button.setOnClickListener(pigClickListener);

//        button.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.button_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Toast toast = Toast.makeText(this, "Neat! Settings!", Toast.LENGTH_SHORT);
            toast.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.cowButton) {
            Toast toast = Toast.makeText(this, "Moo!", Toast.LENGTH_SHORT);
            toast.show();
        } else if (view.getId() == R.id.pigButton) {
            Toast toast = Toast.makeText(this, "Oink!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}

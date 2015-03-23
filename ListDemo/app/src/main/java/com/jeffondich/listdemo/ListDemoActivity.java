/**
 * Created by Jeff Ondich on 4/4/14.
 * For CS 342, Carleton College
 */

package com.jeffondich.listdemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListDemoActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demo);

        ArrayList<String> listItems = new ArrayList<String>();
        listItems.add("goat");
        listItems.add("kudu");
        listItems.add("pig");
        listItems.add("moose");
        listItems.add("parrot fish");
        listItems.add("frogfish");
        listItems.add("blue tang");
        listItems.add("scorpion fish");
        listItems.add("spotted eagle ray");

        ListDemoAdapter adapter = new ListDemoAdapter(this, R.layout.list_cell, listItems);
        ListView listView = (ListView)this.findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {
        TextView textView = (TextView)v.findViewById(R.id.listCellTextView);
        if (v != null && textView != null) {
            Toast toast = Toast.makeText(v.getContext(), textView.getText(), 0);
            toast.show();
        }
    }
}

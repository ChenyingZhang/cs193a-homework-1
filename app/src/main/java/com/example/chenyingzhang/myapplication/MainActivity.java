package com.example.chenyingzhang.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public double getCost() {
        EditText cost = (EditText) findViewById(R.id.totalCost);
        try
        {
            double totalCost = Double.parseDouble(cost.getText().toString());
            return totalCost;
        }
        catch(NumberFormatException e)
        {
            return 0;
        }

    }

    public void button1Click(View view) {
        Toast.makeText(this, "You will pay 10% tip", Toast.LENGTH_SHORT).show();
        Button button1 = (Button) findViewById(R.id.button1);
        TextView tipValue = (TextView) findViewById(R.id.tipValue);
        if (getCost() != 0) {
            double tip = getCost() * Double.parseDouble(button1.getText().toString());
            tipValue.setText(String.valueOf(tip));
        } else {
            tipValue.setText("Invalid input cost value!");
        }

    }

    public void button2Click(View view) {
        Toast.makeText(this,"You will pay 15% tip", Toast.LENGTH_SHORT).show();
        Button button2 = (Button) findViewById(R.id.button2);
        TextView tipValue = (TextView) findViewById(R.id.tipValue);
        if (getCost() != 0) {
            double tip = getCost() * Double.parseDouble(button2.getText().toString());
            tipValue.setText(String.valueOf(tip));
        } else {
            tipValue.setText("Invalid input cost value!");
        }

    }

    public void button3Click(View view) {
        Toast.makeText(this,"You will pay 20% tip", Toast.LENGTH_SHORT).show();
        Button button3 = (Button) findViewById(R.id.button3);
        TextView tipValue = (TextView) findViewById(R.id.tipValue);
        if (getCost() != 0) {
            double tip = getCost() * Double.parseDouble(button3.getText().toString());
            tipValue.setText(String.valueOf(tip));
        } else {
            tipValue.setText("Invalid input cost value!");
        }
    }
}

package com.example.testingtablelayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DemoTableLayoutActivity3 extends Activity implements OnClickListener
{

	// initialize a button and a counter
	Button btn;
	int counter = 0;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo_table_layout_activity3);

		// add a click-listener on the button
		btn = (Button) findViewById(R.id.Button01);
		btn.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_demo_table_layout_activity3,
				menu);
		return true;
	}
	
	 // 
    public void onClick(View view) {

        // get a reference for the TableLayout
        TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);

        // create a new TableRow
        TableRow row = new TableRow(this);

        // count the counter up by one
        counter++;

        // create a new TextView
        TextView t = new TextView(this);
        // set the text to "text xx"
        t.setText("text " + counter);
        
        // create a new TextView
        TextView t2 = new TextView(this);
        // set the text to "text xx"
        t2.setText("text aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + counter);

        // create a CheckBox
        CheckBox c = new CheckBox(this);

        // add the TextView and the CheckBox to the new TableRow
        row.addView(t);
        row.addView(c);
        row.addView(t2);
        
        // add the TableRow to the TableLayout
        table.addView(row,new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

    }
}

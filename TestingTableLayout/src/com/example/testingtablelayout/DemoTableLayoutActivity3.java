package com.example.testingtablelayout;

import java.util.ArrayList;

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

public class DemoTableLayoutActivity3 extends Activity implements
		OnClickListener
{

	ArrayList<String[]> listOfArrayOfString;

	// initialize a button and a counter
	Button btn;
	int counter = 0;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo_table_layout_activity3);

		initializeListOfArrayOfString();

		// add a click-listener on the button
		btn = (Button) findViewById(R.id.Button01);
		btn.setOnClickListener(this);

		putListOnTableLayout();

	}

	private void initializeListOfArrayOfString()
	{
		listOfArrayOfString = new ArrayList<String[]>();

		String[] title =
		{ "Til1", "Til2", "Til3", "Til4", "Til5", "Til6asldfkjasdlfkjalsdfkj", "Til7", "Til8" };
		String[] row1 =
		{ "Col11", "Col12", "Col13", "Col14", "Col15", "Col16", "Col17",
				"Col18" };
		String[] row2 =
		{ "Colsjajajajajaj21", "Col22", "Col23", "Col24", "Col25", "Col26", "Col27",
				"Col28" };

		listOfArrayOfString.add(title);
		listOfArrayOfString.add(row1);
		listOfArrayOfString.add(row2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_demo_table_layout_activity3,
				menu);
		return true;
	}

	//
	public void onClick(View view)
	{

		putListOnTableLayout();

		/*
		 * // get a reference for the TableLayout TableLayout table =
		 * (TableLayout) findViewById(R.id.TableLayout01);
		 * 
		 * // create a new TableRow TableRow row = new TableRow(this);
		 * 
		 * // count the counter up by one counter++;
		 * 
		 * // create a new TextView TextView t = new TextView(this); // set the
		 * text to "text xx" t.setText("text " + counter);
		 * 
		 * // create a new TextView TextView t2 = new TextView(this); // set the
		 * text to "text xx" t2.setText("text aaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
		 * counter);
		 * 
		 * // create a CheckBox CheckBox c = new CheckBox(this);
		 * 
		 * // add the TextView and the CheckBox to the new TableRow
		 * row.addView(t); row.addView(c); row.addView(t2);
		 * 
		 * // add the TableRow to the TableLayout table.addView(row, new
		 * TableLayout.LayoutParams( LayoutParams.WRAP_CONTENT,
		 * LayoutParams.WRAP_CONTENT));
		 */

	}

	private void putListOnTableLayout()
	{

		for (int i = 0; i < listOfArrayOfString.size(); i++)
		{
			// get a reference for the TableLayout
			TableLayout table = (TableLayout) findViewById(R.id.TableLayout01);

			// create a new TableRow
			TableRow tableRow = new TableRow(this);

			TableLayout.LayoutParams tableRowParams = new TableLayout.LayoutParams(
					TableLayout.LayoutParams.FILL_PARENT,
					TableLayout.LayoutParams.WRAP_CONTENT);

			int leftMargin = 5;
			int topMargin = 0;
			int rightMargin = 5;
			int bottomMargin = 0;

			tableRowParams.setMargins(leftMargin, topMargin, rightMargin,
					bottomMargin);
			


			tableRow.setLayoutParams(tableRowParams);
			tableRow.setBackgroundColor(getResources().getColor(R.color.green));

			for (int j = 0; j < listOfArrayOfString.get(i).length; j++)
			{

				// create a new TextView
				TextView textView = new TextView(this);
				TextView textViewReference = (TextView)findViewById(R.id.TextViewReference);
				// set the text to "text xx"
				textView.setText(listOfArrayOfString.get(i)[j]);

				textView.setTextSize(20);

				if (i == 0)
				{
					textView.setBackgroundColor(getResources().getColor(
							R.color.lightGray));
				} else
				{
					textView.setBackgroundColor(getResources().getColor(
							R.color.yellow));
				}
/*
				LayoutParams layoutTexView = new LayoutParams(
						TableLayout.LayoutParams.WRAP_CONTENT,
						TableLayout.LayoutParams.WRAP_CONTENT);
				layoutTexView.width = 50;
				layoutTexView.height = 50;*/

				
				
				//textView.setPadding(50, 50, 50, 50);

				tableRow.addView(textView,textViewReference.getLayoutParams());

			}

			// add the TableRow to the TableLayout

			table.addView(tableRow);
			// table.addView(row, new TableLayout.LayoutParams(
			// LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		}

	}
}

package com.example.testingtablelayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;

@SuppressLint("NewApi")
public class DemoTableLayoutActivity2 extends Activity implements
		OnClickListener
{
	Button btnAddlineToTable;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.demo_table_layout2);

		btnAddlineToTable = (Button) findViewById(R.id.buttonAddLineToDinamicTableLayout2);

		btnAddlineToTable.setOnClickListener(this);
	}

	public void onClick(View v)
	{
		if (v == btnAddlineToTable)
		{
			TableLayout tl = (TableLayout)findViewById(R.id.tableLayoutActivity2);
			TableRow row = new TableRow(this);
			
			TextView t1 = new TextView(this);
			
			t1.setText("New content");
			t1.setTypeface(null,1);
			
			t1.setTextSize(15);
			t1.setWidth(20);
			t1.setPadding(20, 0, 0, 0);
			
			row.addView(t1);
			
			tl.addView(row, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			
		}

	}

}

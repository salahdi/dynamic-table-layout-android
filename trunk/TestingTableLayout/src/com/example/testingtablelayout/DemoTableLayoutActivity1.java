package com.example.testingtablelayout;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TableLayout.LayoutParams;

public class DemoTableLayoutActivity1 extends Activity implements OnClickListener
{
	
	Button btnAddLineToRow;
	
	ArrayList<String[]> listOfArrayOfString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.demo_table_layout1);
		
		initializeListOfArrayOfString();
		
		btnAddLineToRow = (Button)findViewById(R.id.buttonAddRow);
		btnAddLineToRow.setOnClickListener(this);
	}

	private void initializeListOfArrayOfString()
	{
		listOfArrayOfString = new ArrayList<String[]>();
		
		String [] title = {"Col1","Col2"};
		String [] row1 = {"Col11","Col12"};
		String [] row2 = {"Col21","Col22"};
		
		listOfArrayOfString.add(title);
		listOfArrayOfString.add(row1);
		listOfArrayOfString.add(row2);
	}

	public void onClick(View v)
	{
		if(v == btnAddLineToRow)
		{
			//Toast.makeText(getApplicationContext(), "go go go", Toast.LENGTH_SHORT).show();
			
			TableLayout tl = (TableLayout)findViewById(R.id.tableLayoutActivity1);
			TableRow row = new TableRow(this);
			
			TextView t1 = new TextView(this);
			
			t1.setText("New content");
			t1.setTypeface(null,1);
			
			t1.setTextSize(15);
			t1.setWidth(20);
			//t1.setPadding(20, 0, 0, 0);
			
			TextView t2 = new TextView(this);
			
			t2.setText("New content");
			t2.setTypeface(null,1);
			
			t2.setTextSize(15);
			t2.setWidth(20);
			//t2.setPadding(20, 0, 0, 0);
			
			TextView t3 = new TextView(this);
			
			t3.setText("New content");
			t3.setTypeface(null,1);
			
			t3.setTextSize(15);
			t3.setWidth(20);
			//t2.setPadding(20, 0, 0, 0);
			
			row.addView(t1);
			row.addView(t2);
			row.addView(t3);
			
			tl.addView(row, new TableLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		}
		
	}
}

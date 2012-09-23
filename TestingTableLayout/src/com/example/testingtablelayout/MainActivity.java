package com.example.testingtablelayout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button btnDemoLayout1,btnDemoLayout2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnDemoLayout1 = (Button)findViewById(R.id.buttonDemoLayout1);
        
        btnDemoLayout2 = (Button)findViewById(R.id.buttonDemoLayout2);
        
        btnDemoLayout1.setOnClickListener(this);
        btnDemoLayout2.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v)
	{
		if(btnDemoLayout1 == v)
		{
			Intent intent = new Intent(this, DemoTableLayoutActivity1.class);
			
			startActivity(intent);
		}
		
		if(btnDemoLayout2 == v)
		{
			Intent intent = new Intent(this, DemoTableLayoutActivity2.class);
			
			startActivity(intent);
		}
	}
}

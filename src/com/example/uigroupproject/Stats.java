package com.example.uigroupproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Stats extends Activity{
	private String name;
	private Bundle b;

	public void onCreate(Bundle savedInstanceState)  {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stats);

		//get the prompt from the bundle
		b = this.getIntent().getExtras();
		name = b.getString("name");

		//get the id for the TextView and display the prompt in the TextView
		((TextView)findViewById(R.id.name)).setText(name);
	}
}

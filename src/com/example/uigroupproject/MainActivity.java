package com.example.uigroupproject;


import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {

	//instance variables
	Button select;
	Button search;
	String selected;
	Pokemon example;
	Button[] buttons;
	final Context context = this;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		select = (Button)findViewById(R.id.select);
		select.setOnClickListener(this);
		
		search = (Button)findViewById(R.id.search);
		search.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v)
	{
		int id = v.getId();

		switch (id)
		{	
		case R.id.select:
		{
			selection();
		}
		
		case R.id.search:
		{
			if(example!=null)
			{
				onStartActivityForResult();
			}
		}

		}



	}

	private void selection()
	{
		Pokemon b = new Pokemon(200,200,200,200,200,200,"Bulbasaur");
		Pokemon c= new Pokemon(301,300,300,300,300,300,"Charmander");
		Pokemon s=  new Pokemon(203,11,300,300,300,300,"Squirtle");

		final Pokemon[] pokemon = new Pokemon[3];

		pokemon[0]= b;
		pokemon[1]= c;
		pokemon[2]= s;

		String[] choices = new String[3];

		for (int i = 0; i < choices.length; i++)
		{
			choices[i] = pokemon[i].getName();
		}


		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setItems(choices, new DialogInterface.OnClickListener()
		{
			public void onClick(DialogInterface dialog, int which) 
			{
				example = pokemon[which];
				if(example!=null)
				{
					select.setText(example.getName());
				}
			}
		}
				);


		AlertDialog alertDialog= builder.create();
		alertDialog.show();
	}
	
	protected void onStartActivityForResult()
	{
		setContentView(R.layout.stats);
		
		//create a new bundle
		Bundle b= new Bundle();
		
		//create the new Intent for the stats activity
		Intent mIntent = new Intent(this, Stats.class);
		
		//put the prompt into the Bundle
		b.putString("name", example.getName());
		
		//pack the Bundle into the Intent
		mIntent.putExtras(b);
		
		//start the activity sending the Intent, 0 corresponds to
		//the request code in the onActivityResult parameter list 
		startActivityForResult(mIntent, 0);	
	}
	

}

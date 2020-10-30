package com.votegubri;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class voting extends Activity 
{

	ImageButton ib1,ib2,ib3,ib4;
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voting);
		
	}
	
	public void no1 (View theButton)
	{
		Intent i = new Intent(this,calon1.class);
   	startActivity(i);
	}

	public void no2 (View theButton)
	{
		Intent i = new Intent(this,calon2.class);
   	startActivity(i);
	}
	
	public void no3 (View theButton)
	{
		Intent i = new Intent(this,calon3.class);
   	startActivity(i);
	}
	
	public void no4 (View theButton)
	{
		Intent i = new Intent(this,calon4.class);
   	startActivity(i);
	}

}

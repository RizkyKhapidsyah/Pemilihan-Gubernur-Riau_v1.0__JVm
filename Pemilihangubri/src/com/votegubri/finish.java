package com.votegubri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finish extends Activity 
{
	Button kembali;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finish);
		
	}
	
	public void back (View theButton)
	{	
		Intent i = new Intent(this,Menulayanan.class);
   	startActivity(i);
	}
}

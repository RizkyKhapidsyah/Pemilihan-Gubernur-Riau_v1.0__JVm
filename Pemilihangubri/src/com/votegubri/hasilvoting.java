package com.votegubri;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class hasilvoting extends Activity 
{ 
	WebView browser;

	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasilvote);
	
			browser = (WebView) findViewById (R.id.webView1);
			browser.getSettings().setJavaScriptEnabled(true);
			browser.loadUrl("http://10.0.2.2/votegubri/record2.php");
			
	}
}
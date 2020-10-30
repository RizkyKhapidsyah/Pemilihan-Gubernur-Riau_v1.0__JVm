package com.votegubri;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calon3 extends Activity 
{
	Button voting, back;
	EditText hasil,nik;
	TextView error;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
	
		hasil=(EditText)findViewById(R.id.hasil3);
		hasil.setText("3");
		nik=(EditText)findViewById(R.id.niklagi);
		nik.setHint("Masukkan NIK");
		error =(TextView)findViewById(R.id.tv_error);
		voting=(Button)findViewById(R.id.btnvote);
		voting.setOnClickListener(new OnClickListener()
		{
			public void onClick (View v)
			{
				ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
		        
		        postParameters.add(new BasicNameValuePair("nik", nik.getText().toString()));
		        
		/*            String valid = "1";*/      
		        
		        String response = null;
		        
		        try 
		        {
		           
		           response = CustomHttpClient.executeHttpPost("http://10.0.2.2/votegubri/check2.php", postParameters);
		           
		           String res = response.toString();
		           
		           res = res.trim();
		           
		           res = res.replaceAll("\\s+","");
		           
		           error.setText(res);
		           
		           if (res.equals("1")) 
		           {
		        	   error.setText("ANDA SUDAH PERNAH MELAKUKAN PEMILU!!!");
		        	   		        	   
		           }
		           else { 	   
		        	    hmm();
		        	      }
		        }
		        
		        catch (Exception e) {
		           
		           nik.setText(e.toString());
		           
		        }
			}
		});
	}
	
	

	public void hmm() {
		// TODO Auto-generated method stub
		ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
        
        postParameters.add(new BasicNameValuePair("nik", nik.getText().toString()));
        
/*            String valid = "1";*/      
        
        String response = null;
        
        try 
        {
           
           response = CustomHttpClient.executeHttpPost("http://192.168.43.244/votegubri/check.php", postParameters);
           
           String res = response.toString();
           
           res = res.trim();
           
           res = res.replaceAll("\\s+","");
           
           error.setText(res);
           
           if (res.equals("1")) 
           {
        	   error.setText("correct");
        	   		        	   mulaivote();
           }
           else { 	   
        	   error.setText("SILAHKAN MELAKUKAN PENDAFTARAN NIK TERLEBIH DAHULU, PILIH MENU");
        	      }
        }
        
        catch (Exception e) {
           
           nik.setText(e.toString());
           
        }
	}

	protected void success( ) {
		// TODO Auto-generated method stub
		Intent j = new Intent(this,finish.class);
	   	startActivity(j);
	}

	
	
	public void mulaivote() {
		ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
        postParameters.add(new BasicNameValuePair("pilihan", hasil.getText().toString()));
        postParameters.add(new BasicNameValuePair("nik", nik.getText().toString()));
        
/*            String valid = "1";*/      
        
        String response = null;
        
        try {
           
           response = CustomHttpClient.executeHttpPost("http://192.168.43.244/votegubri/hasil2.php", postParameters);
           
           String res = response.toString();
           
           res = res.trim();
           
           res = res.replaceAll("\\s+","");
           
           error.setText(res);
           
           if (res.equals("1")) 
      
        	   error.setText("Gagal");
        
           else 
        	   {
        	   error.setText("Voting oke");
           success();
        	   }
        }
        
        catch (Exception e) {
           
           hasil.setText(e.toString());
           
        }
       

	}
	
	public void kembali (View theButton)
	{
		Intent i = new Intent(this,voting.class);
	   	startActivity(i);
	}
	
	public void menulayanan (View theButton)
	{
		Intent i = new Intent(this,Menulayanan.class);
	   	startActivity(i);
	}
	
}

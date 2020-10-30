package com.votegubri;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class daftar1 extends Activity {
   
   EditText nm,nk;
   TextView error;
   Button simpan,kembali;
   
   
    /** Called when the activity is first created. */
   
   @Override
   
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar);
       
        nm=(EditText)findViewById(R.id.edtnama);
        nk=(EditText)findViewById(R.id.edtnik);
        
        simpan=(Button)findViewById(R.id.save);
        kembali=(Button)findViewById(R.id.back);
        error=(TextView)findViewById(R.id.tv_error);
        
        simpan.setOnClickListener(new View.OnClickListener() {
         
         @Override
         
         public void onClick(View v) {
            
            // TODO Auto-generated method stub
        	 
        	     	     
            ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            postParameters.add(new BasicNameValuePair("nama", nm.getText().toString()));
            postParameters.add(new BasicNameValuePair("nik", nk.getText().toString()));
            
/*            String valid = "1";*/      
            
            String response = null;
            
            try {
               
               response = CustomHttpClient.executeHttpPost("http://10.0.2.2/votegubri/data.php", postParameters);
               
               String res = response.toString();
               
               res = res.trim();
               
               res = res.replaceAll("\\s+","");
               
               error.setText(res);
               
               if (res.equals("1")) error.setText("Gagal");
               
               else error.setText("Data Tersimpan Ke server");
               
            }
            
            catch (Exception e) {
               
               nk.setText(e.toString());
               
            }
               
         }
            
            
      });
    }
   
   public void kembali (View theButton)
	{
		Intent i = new Intent(this,Menulayanan.class);
   	startActivity(i);
	}
}



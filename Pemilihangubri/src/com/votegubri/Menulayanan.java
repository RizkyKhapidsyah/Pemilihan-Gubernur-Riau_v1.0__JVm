package com.votegubri;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menulayanan extends ListActivity {

	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		//membuat daftar list nya
		String []Menulayanan = new String [] 
		{"Daftar" , "Contreng", "Hasil"};
	
		this.setListAdapter(new ArrayAdapter <String>
		(this,android.R.layout.simple_list_item_1,Menulayanan));

	}
	
	protected void  onListItemClick  (ListView l,View v,int position,long id)
	{
		super.onListItemClick(l, v, position, id);
		Object o = this.getListAdapter().getItem(position);
		// objek o adalah tempat penampungan dari apa saja yang dipilih nanti
		String pilihan = o.toString();
		
		tampilkanpilihan (pilihan);
	}

	private void tampilkanpilihan(String pilihan) {
		try { 
			Intent i = null;
			if (pilihan.equals("Daftar"))
				{
				i = new Intent (this,daftar1.class);
				}
				else if (pilihan.equals("Contreng"))
				{
				i = new Intent (this,voting.class);
				}
				else
					i = new Intent (this,hasilvoting.class);
	
				startActivity(i);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}
}

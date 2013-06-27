package com.example.listv;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity
{

	RelativeLayout layout;
	ListView lv;
	
	String[] sample1=new String[]{"s","a","r","v"};
	//String[] sample2=new String[]{"ss","aa","rr","vv"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<String> ary=new ArrayList<String>();
		
		HashMap<String,String> has=new HashMap<String, String>();
		
		
		for(int i=0;i<sample1.length;i++)
		{
			has.put(""+i, sa);
		}
		
		lv=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> adp=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,sample);
		lv.setAdapter(adp);
		
		ListAdapter adapter = new SimpleAdapter(this, contactList,
				R.layout.list_item,
				new String[] { TAG_NAME, TAG_EMAIL, TAG_PHONE_MOBILE }, new int[] {
						R.id.name, R.id.email, R.id.mobile });
		
	}



}

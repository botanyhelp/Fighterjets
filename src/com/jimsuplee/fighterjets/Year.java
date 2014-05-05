package com.jimsuplee.fighterjets;


import android.app.ListActivity;
//import android.app.Activity;
import android.content.Intent;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
//import android.widget.ArrayAdapter;
import android.net.Uri;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.view.View;
//import android.util.Log;

public class Year extends ListActivity {
	static final String TAG = "FIGHTERJETS";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    displayListView();
	}
	
    private void displayListView() {
        //////Log.w(TAG, "In Flight.displayListView(), about to make carrierList");
        List<String> fighterList = new ArrayList<String>();
        //yearList.add("1913");
        fighterList.add("TuAF TFX");
        fighterList.add("Rockwell XFV-12");
        fighterList.add("Qaher-313");
        fighterList.add("Mitsubishi ATD-X");
        fighterList.add("KAI KF-X");
        fighterList.add("HESA Shafaq");
        fighterList.add("Blackburn F.3");
        fighterList.add("ADA/HAL Advanced Medium Combat Aircraft");
        fighterList.add("Shenyang J-31");
        fighterList.add("KAI FA-50");
        fighterList.add("Chengdu J-20");
        fighterList.add("Sukhoi PAK FA/HAL FGFA");
        fighterList.add("Shenyang J-15");
        fighterList.add("Mikoyan MiG-35");
        fighterList.add("Lockheed Martin F-35 Lightning II");
        fighterList.add("HESA Saeqeh");
        fighterList.add("Chengdu FC-1 Xiaolong/PAC JF-17 Thunder");
        fighterList.add("HAL Tejas");
        fighterList.add("Mikoyan Project 1.44");
        fighterList.add("Boeing X-32");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.figherjetstextview, fighterList);
		setListAdapter(dataAdapter);
		ListView listView = getListView();
		listView.setTextFilterEnabled(true);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//////Log.w(TAG, "In Flight.displayListView().listView.setOnItemClickListener().onItemClick()");
				//com.jimsuplee.aircraftcarriers.Aircraftcarriers.carrierSearchList.clear();
				Intent i = new Intent("");
				String countryChoice = ((TextView) view).getText().toString();			
				i.setData(Uri.parse(countryChoice));
				setResult(RESULT_OK, i);
				finish();
			}
		});    
    }        
}

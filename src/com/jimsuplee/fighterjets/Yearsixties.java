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

public class Yearsixties extends ListActivity {
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
        fighterList.add("Shenyang J-8 & J-8II");
        fighterList.add("Saab 37 Viggen");
        fighterList.add("Mikoyan-Gurevich MiG-23");
        fighterList.add("Mikoyan-Gurevich MiG-23PD VTOL fighter");
        fighterList.add("Dassault Mirage G");
        fighterList.add("Dassault Mirage 5 & 50");
        fighterList.add("Sukhoi Su-17, 20 & 22");
        fighterList.add("Mikoyan-Gurevich MiG-21PD VTOL fighter");
        fighterList.add("Dassault Mirage F2");
        fighterList.add("Dassault Mirage F1");
        fighterList.add("Chengdu J-7");
        fighterList.add("General Dynamics/Grumman F-111B");
        fighterList.add("Dassault Mirage IIIV VTOL fighter");
        fighterList.add("Mikoyan-Gurevich MiG-25");
        fighterList.add("Helwan HA-300");
        fighterList.add("Hawker Siddeley Kestrel FGA.1");
        fighterList.add("Yakovlev Yak-36 VTOL fighter");
        fighterList.add("Lockheed YF-12");
        fighterList.add("Sukhoi Su-15");
        fighterList.add("Mikoyan-Gurevich Ye-8");
        fighterList.add("Dassault Balzac V");
        fighterList.add("Tupolev Tu-28/Tu-128");
        fighterList.add("HAL HF-24 Marut");
        fighterList.add("Yakovlev Yak-28P interceptor");


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

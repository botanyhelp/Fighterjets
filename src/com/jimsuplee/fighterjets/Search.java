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
import java.util.Arrays;

public class Search extends ListActivity {
	static final String TAG = "FIGHTERJETS";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String results = getIntent().getStringExtra("results");
	    displayListView(results);
	}
	
    private void displayListView(String results) {
        //////Log.w(TAG, "In Flight.displayListView(), about to make carrierList");
        List<String> fighterList = new ArrayList<String>();
        List<String> resultsList = new ArrayList<String>(Arrays.asList(results.split("___")));
        for(int i = 0, n = resultsList.size(); i < n; i++) {
            fighterList.add(resultsList.get(i));
        }
        //fighterList.add("ACAZ C.2 2 seat fighter");
        //fighterList.add("Adamoli-Cattani fighter");
        //fighterList.add("AD Scout");{
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.figherjetstextview, fighterList);
		setListAdapter(dataAdapter);
		ListView listView = getListView();
		// enables filtering for the contents of the given ListView
		listView.setTextFilterEnabled(true);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				//////Log.w(TAG, "In Flight.displayListView().listView.setOnItemClickListener().onItemClick()");
				//com.jimsuplee.aircraftcarriers.Aircraftcarriers.carrierSearchList.clear();
				Intent i = new Intent("");
				String fighterChoice = ((TextView) view).getText().toString();			
				i.setData(Uri.parse(fighterChoice));
				setResult(RESULT_OK, i);
				finish();
			}
		});    
    }

}

/**Copyright (C) 2013 Thomas Maher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

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

public class Country extends ListActivity {
	static final String TAG = "FIGHTERJETS";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    displayListView();
	}
	
    private void displayListView() {
        //////Log.w(TAG, "In Flight.displayListView(), about to make carrierList");
        List<String> countryList = new ArrayList<String>();
        //fighterList.add("ACAZ C.2 2 seat fighter");
        //fighterList.add("Adamoli-Cattani fighter");
        //fighterList.add("AD Scout");
        //countryList.add("ACAZ C.2 2 seat fighter");
        countryList.add("Argentina");
        countryList.add("Australia");
        countryList.add("Austro-Hungarian Empire");
        countryList.add("Belgium");
        countryList.add("Canada");
        countryList.add("Chile");
        countryList.add("China (PRC)");
        countryList.add("China (PRC), Pakistan");
        countryList.add("Czechoslovakia");
        countryList.add("Denmark");
        countryList.add("Egypt");
        countryList.add("Estonia");
        countryList.add("Finland");
        countryList.add("France");
        countryList.add("France,German Empire");
        countryList.add("France,Netherlands");
        countryList.add("German Empire");
        countryList.add("Germany - 3rd Reich");
        countryList.add("Germany - Federal Republic");
        countryList.add("Germany - Weimar Republic");
        countryList.add("Hungary");
        countryList.add("India");
        countryList.add("India, United Kingdom");
        countryList.add("Iran");
        countryList.add("Israel");
        countryList.add("Italy");
        countryList.add("Japan");
        countryList.add("Japan, United States");
        countryList.add("Latvia");
        countryList.add("Lithuania");
        countryList.add("Mexico");
        countryList.add("Netherlands");
        countryList.add("Norway");
        countryList.add("Poland");
        countryList.add("Romania");
        countryList.add("Russia");
        countryList.add("Russia, India");
        countryList.add("Russian Empire");
        countryList.add("Siam");
        countryList.add("South Africa");
        countryList.add("South Korea");
        countryList.add("South Korea, Indonesia");
        countryList.add("Spain");
        countryList.add("Spain, Germany - 3rd Reich");
        countryList.add("Sweden");
        countryList.add("Switzerland");
        countryList.add("Taiwan");
        countryList.add("Taiwan (ROC)");
        countryList.add("Turkey");
        countryList.add("USSR");
        countryList.add("United Kingdom");
        countryList.add("United Kingdom, France");
        countryList.add("United Kingdom, Germany - Federal Republic, Italy, Spain");
        countryList.add("United Kingdom, Japan");
        countryList.add("United States");
        countryList.add("United States, United Kingdom");
        countryList.add("Yugoslavia");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.figherjetstextview, countryList);
		setListAdapter(dataAdapter);
		ListView listView = getListView();
		// enables filtering for the contents of the given ListView
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

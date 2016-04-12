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

public class Yearseventies extends ListActivity {
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
        fighterList.add("Panavia Tornado ADV");
        fighterList.add("Dassault Mirage 4000");
        fighterList.add("McDonnell Douglas F/A-18 Hornet");
        fighterList.add("Dassault Mirage 2000");
        fighterList.add("British Aerospace Sea Harrier V/STOL fighter");
        fighterList.add("Sukhoi Su-27");
        fighterList.add("Mikoyan MiG-29");
        fighterList.add("HAL Ajeet");
        fighterList.add("Mitsubishi F-1");
        fighterList.add("Mikoyan MiG-31");
        fighterList.add("Northrop YF-17");
        fighterList.add("General Dynamics F-16 Fighting Falcon");
        fighterList.add("Dassault-Breguet Super Étendard strike fighter");
        fighterList.add("IAI Kfir");
        fighterList.add("McDonnell Douglas F-15 Eagle");
        fighterList.add("Yakovlev Yak-38 VTOL fighter");
        fighterList.add("VFW VAK 191B VTOL fighter");
        fighterList.add("IAI Nesher/Dagger");
        fighterList.add("Nanchang J-12");
        fighterList.add("Grumman F-14 Tomcat");


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

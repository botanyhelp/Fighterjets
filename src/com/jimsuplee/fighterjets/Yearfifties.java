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

public class Yearfifties extends ListActivity {
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
        fighterList.add("Northrop F-5");
        fighterList.add("Mikoyan-Gurevich Ye-150 & Ye-152");
        fighterList.add("Vought XF8U-3 Crusader III");
        fighterList.add("Sukhoi Su-11");
        fighterList.add("Shenyang J-6");
        fighterList.add("Mikoyan-Gurevich I-75");
        fighterList.add("McDonnell Douglas F4H/F-110/F-4 Phantom II");
        fighterList.add("Dassault Étendard IV");
        fighterList.add("Avro Canada CF-105 Arrow");
        fighterList.add("Aerfer Ariete");
        fighterList.add("Sukhoi Su-9");
        fighterList.add("Sukhoi P-1");
        fighterList.add("Saunders-Roe SR.53 rocket/jet interceptor");
        fighterList.add("Mikoyan-Gurevich SM-12");
        fighterList.add("Dassault Étendard VI");
        fighterList.add("Breguet Taon strike fighter");
        fighterList.add("Yakovlev Yak-27V/K interceptor");
        fighterList.add("Supermarine Scimitar");
        fighterList.add("Sukhoi T-3");
        fighterList.add("SNCASE (Sud-Est) Durandal");
        fighterList.add("Shenyang J-5");
        fighterList.add("North American F-107");
        fighterList.add("Mikoyan-Gurevich I-380/I-3");
        fighterList.add("Lavochkin La-250");
        fighterList.add("Fiat G.91 strike fighter");
        fighterList.add("Douglas F5D Skylancer");
        fighterList.add("Dassault Mirage III");
        fighterList.add("Dassault Étendard II");
        fighterList.add("Convair F-106 Delta Dart interceptor");
        fighterList.add("Aerfer Sagittario 2 lightweight fighter");
        fighterList.add("Vought F8U/F-8 Crusader");
        fighterList.add("Sukhoi Su-7");
        fighterList.add("Saab 35 Draken");
        fighterList.add("Republic F-105 Thunderchief");
        fighterList.add("Mikoyan-Gurevich MiG-21");
        fighterList.add("Mikoyan-Gurevich I-370/I-1/I-2");
        fighterList.add("Folland Gnat");
        fighterList.add("FFA P-16");
        fighterList.add("Dassault Super Mystère fighter-bomber");
        fighterList.add("Supermarine 525");
        fighterList.add("North American FJ-4 Fury");
        fighterList.add("McDonnell F-101 Voodoo");
        fighterList.add("Lockheed F-104 Starfighter");
        fighterList.add("Grumman F-11 Tiger");
        fighterList.add("Folland Midge light fighter");
        fighterList.add("English Electric Lightning");
        fighterList.add("Convair XFY Pogo VTOL turboprop fighter");
        fighterList.add("SNCASO (Sud-Ouest) Trident");
        fighterList.add("North American F-100 Super Sabre");
        fighterList.add("Mikoyan-Gurevich MiG-19");
        fighterList.add("Lockheed XFV tail sitter");
        fighterList.add("Convair F2Y Sea Dart seaplane jet fighter");
        fighterList.add("Convair F-102 Delta Dagger interceptor");
        fighterList.add("Yakovlev Yak-25 interceptor");
        fighterList.add("Supermarine 529");
        fighterList.add("SNCASO (Sud Aviation) Vautour II interceptor");
        fighterList.add("Saab 32 Lansen");
        fighterList.add("Grumman XF10F Jaguar");
        fighterList.add("EFW N-20");
        fighterList.add("Dassault Mystère IV");
        fighterList.add("Supermarine 508");
        fighterList.add("SNCASE (Sud-Est) Aquilon license-built DH Sea Venom");
        fighterList.add("North American FJ-2/-3 Fury");
        fighterList.add("McDonnell F3H Demon");
        fighterList.add("Lavochkin La-190");
        fighterList.add("Hispano Aviación HA-1112");
        fighterList.add("Hawker Hunter");
        fighterList.add("Grumman F-9 Cougar");
        fighterList.add("Gloster Javelin");
        fighterList.add("Douglas F4D Skyray");
        fighterList.add("de Havilland DH.110 Sea Vixen");
        fighterList.add("de Havilland Sea Venom");
        fighterList.add("Dassault Mystère");
        fighterList.add("Supermarine 535");
        fighterList.add("Supermarine 528");
        fighterList.add("Republic XF-96/F-84F Thunderstreak");
        fighterList.add("North American YF-93");
        fighterList.add("Mikoyan-Gurevich MiG-17");
        fighterList.add("Hawker P.1081 Australian Fighter");
        fighterList.add("FMA I.Ae. 33 Pulqui II");
        fighterList.add("Avro Canada CF-100 Canuck");


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

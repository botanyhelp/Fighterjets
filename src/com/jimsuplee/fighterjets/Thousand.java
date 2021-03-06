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

public class Thousand extends ListActivity {
	static final String TAG = "FIGHTERJETS";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    displayListView();
	}
	
    private void displayListView() {
        //////Log.w(TAG, "In Flight.displayListView(), about to make carrierList");
        List<String> fighterList = new ArrayList<String>();
        //fighterList.add("ACAZ C.2 2 seat fighter");
        fighterList.add("Albatros D.III");
        fighterList.add("Albatros D.V & D.Va");
        fighterList.add("Ansaldo SVA");
        fighterList.add("Bell P-39 Airacobra");
        fighterList.add("Bell P-63 Kingcobra");
        fighterList.add("Boulton Paul Defiant turret fighter");
        fighterList.add("Bristol Beaufighter strike fighter");
        fighterList.add("Bristol Blenheim night fighter");
        fighterList.add("Bristol F.2 Fighter 2 seat fighter");
        fighterList.add("Chengdu J-7");
        fighterList.add("Convair F-102 Delta Dagger interceptor");
        fighterList.add("Curtiss P-36 Hawk");
        fighterList.add("Curtiss P-40 Warhawk");
        fighterList.add("Dassault Mirage III");
        fighterList.add("de Havilland Mosquito");
        fighterList.add("de Havilland Vampire/Sea Vampire");
        fighterList.add("de Havilland Venom");
        fighterList.add("Dornier Do 17 night fighter");
        fighterList.add("Dornier Do 217 night fighter");
        fighterList.add("Douglas P-70 Havoc night fighter");
        fighterList.add("Fairey Firefly monoplane fleet fighter");
        fighterList.add("Fiat CR.32/CR.33/CR.40/CR.41");
        fighterList.add("Fiat CR.42");
        fighterList.add("Focke-Wulf Fw 190");
        fighterList.add("Fokker D.VII & V.34 & 36");
        fighterList.add("General Dynamics F-16 Fighting Falcon");
        fighterList.add("Gloster Meteor jet fighter");
        fighterList.add("Grumman F4F Wildcat");
        fighterList.add("Grumman F6F Hellcat");
        fighterList.add("Grumman F8F Bearcat");
        fighterList.add("Grumman F9F Panther");
        fighterList.add("Grumman F-9 Cougar");
        fighterList.add("Hanriot HD.1");
        fighterList.add("Hawker Hunter");
        fighterList.add("Hawker Hurricane & Sea Hurricane");
        fighterList.add("Hawker Tempest");
        fighterList.add("Hawker Typhoon");
        fighterList.add("Junkers Ju 88 night fighter");
        fighterList.add("Kawanishi N1K-J Shiden landplane fighter");
        fighterList.add("Kawasaki Ki-45 heavy fighter");
        fighterList.add("Kawasaki Ki-61");
        fighterList.add("Lavochkin-Gorbunov-Gudkov LaGG-3");
        fighterList.add("Lavochkin La-5");
        fighterList.add("Lavochkin La-7");
        fighterList.add("Lavochkin La-9");
        fighterList.add("Lavochkin La-11");
        fighterList.add("Lockheed P-38 Lightning");
        fighterList.add("Lockheed P-80 Shooting Star");
        fighterList.add("Lockheed F-104 Starfighter");
        fighterList.add("Macchi C.200");
        fighterList.add("Macchi C.202");
        fighterList.add("McDonnell Douglas F-15 Eagle");
        fighterList.add("McDonnell Douglas F/A-18 Hornet");
        fighterList.add("McDonnell Douglas F4H/F-110/F-4 Phantom II");
        fighterList.add("Messerschmitt Bf 109");
        fighterList.add("Messerschmitt Bf 110");
        fighterList.add("Messerschmitt Me 262/Avia S-92");
        fighterList.add("Messerschmitt Me 410");
        fighterList.add("Mikoyan-Gurevich MiG-3");
        fighterList.add("Mikoyan-Gurevich MiG-15");
        fighterList.add("Mikoyan-Gurevich MiG-17");
        fighterList.add("Mikoyan-Gurevich MiG-19");
        fighterList.add("Mikoyan-Gurevich MiG-21");
        fighterList.add("Mikoyan-Gurevich MiG-23");
        fighterList.add("Mikoyan-Gurevich MiG-25");
        fighterList.add("Mikoyan MiG-29");
        fighterList.add("Mitsubishi A5M");
        fighterList.add("Mitsubishi A6M Zero");
        fighterList.add("Morane-Saulnier AI");
        fighterList.add("Morane-Saulnier M.S.406");
        fighterList.add("Nakajima Ki-27");
        fighterList.add("Nakajima Ki-43 Hayabusa");
        fighterList.add("Nakajima Ki-44 Shoki");
        fighterList.add("Nakajima Ki-84 Hayate");
        fighterList.add("Nieuport 11 & 16");
        fighterList.add("Nieuport 17, 21 & 23");
        fighterList.add("Nieuport-Delage NiD 29");
        fighterList.add("North American P-51 Mustang");
        fighterList.add("North American/Canadair/CAC F-86 Sabre");
        fighterList.add("North American F-100 Super Sabre");
        fighterList.add("Northrop F-89 Scorpion");
        fighterList.add("Northrop F-5");
        fighterList.add("Pfalz D.III");
        fighterList.add("Polikarpov I-15bis");
        fighterList.add("Polikarpov I-153");
        fighterList.add("Polikarpov I-16");
        fighterList.add("Potez 630");
        fighterList.add("Republic P-47 Thunderbolt");
        fighterList.add("Republic F-84 Thunderjet");
        fighterList.add("Republic XF-96/F-84F Thunderstreak");
        fighterList.add("Royal Aircraft Factory S.E.5 & 5a");
        fighterList.add("Shenyang J-5");
        fighterList.add("Shenyang J-6");
        fighterList.add("Sopwith Camel");
        fighterList.add("Sopwith Dolphin");
        fighterList.add("Sopwith 1½ Strutter");
        fighterList.add("Sopwith Pup");
        fighterList.add("Sopwith Snipe");
        fighterList.add("SPAD S.VII");
        fighterList.add("SPAD S.XIII");
        fighterList.add("Sukhoi Su-7");
        fighterList.add("Sukhoi Su-9");
        fighterList.add("Sukhoi Su-15");
        fighterList.add("Sukhoi Su-17, 20 & 22");
        fighterList.add("Supermarine Seafire");
        fighterList.add("Supermarine Spitfire");
        fighterList.add("Vought F4U/FG/F3A Corsair");
        fighterList.add("Vought F8U/F-8 Crusader");
        fighterList.add("Yakovlev Yak-1");
        fighterList.add("Yakovlev I-30/Yak-3");
        fighterList.add("Yakovlev Yak-7");
        fighterList.add("Yakovlev Yak-9");
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

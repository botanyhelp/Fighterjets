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

public class Yearforties extends ListActivity {
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
        fighterList.add("Yakovlev Yak-50 (1949)");
        fighterList.add("Sukhoi Su-15 (1949)");
        fighterList.add("SNCAN (Nord) N.2200 carrier fighter");
        fighterList.add("SNCAC (Centre) NC.1080 carrier fighter");
        fighterList.add("Republic XF-91 Thunderceptor");
        fighterList.add("Mikoyan-Gurevich I-320");
        fighterList.add("Lockheed F-94/F-97 Starfire");
        fighterList.add("Lockheed XF-90");
        fighterList.add("Lavochkin La-200");
        fighterList.add("Ikarus S-49");
        fighterList.add("de Havilland Venom");
        fighterList.add("Dassault Ouragan");
        fighterList.add("Arsenal VG 90 carrier fighter");
        fighterList.add("Yakovlev Yak-30 (1948)");
        fighterList.add("Vought F7U Cutlass");
        fighterList.add("Supermarine Swift");
        fighterList.add("Supermarine 510");
        fighterList.add("SNCASO (Sud-Ouest) Espadon");
        fighterList.add("Saab 29 Tunnan");
        fighterList.add("Northrop F-89 Scorpion");
        fighterList.add("McDonnell XF-88");
        fighterList.add("McDonnell XF-85 Goblin parasite fighter");
        fighterList.add("Lavochkin La-176");
        fighterList.add("Lavochkin La-168");
        fighterList.add("Lavochkin La-15");
        fighterList.add("Gloster E.1/44 jet fighter");
        fighterList.add("FMA I.Ae. 30 Ñancú");
        fighterList.add("Douglas F3D Skyknight");
        fighterList.add("Curtiss-Wright XF-87 Blackhawk");
        fighterList.add("Convair XF-92");
        fighterList.add("Yakovlev Yak-25 (1947)");
        fighterList.add("Yakovlev Yak-23");
        fighterList.add("Yakovlev Yak-19");
        fighterList.add("Yakovlev Yak-17");
        fighterList.add("Vought XF5U");
        fighterList.add("Tupolev Tu-1 night fighter");
        fighterList.add("Sukhoi Su-11 (1947)");
        fighterList.add("Saunders-Roe SR.A/1 seaplane jet fighter");
        fighterList.add("Saab 21R jet fighter");
        fighterList.add("North American/Canadair/CAC F-86 Sabre");
        fighterList.add("Mikoyan-Gurevich MiG-15");
        fighterList.add("McDonnell F2H Banshee");
        fighterList.add("Lavochkin La-160");
        fighterList.add("Lavochkin La-156");
        fighterList.add("Lavochkin La-11");
        fighterList.add("Hawker Sea Hawk");
        fighterList.add("Grumman F9F Panther");
        fighterList.add("FMA I.Ae. 27 Pulqui I");
        fighterList.add("Doflug D-3803");
        fighterList.add("Avia S-199");
        fighterList.add("Alekseyev I-211 & 215");
        fighterList.add("Yakovlev Yak-15");
        fighterList.add("Westland Wyvern torpedo/strike fighter");
        fighterList.add("Vought F6U Pirate");
        fighterList.add("Supermarine Seafang");
        fighterList.add("Supermarine Attacker");
        fighterList.add("Sukhoi Su-9 (1946)");
        fighterList.add("Ryan XF2R Dark Shark mixed propulsion fighter");
        fighterList.add("Republic F-84 Thunderjet");
        fighterList.add("North American FJ-1 Fury");
        fighterList.add("Mikoyan-Gurevich MiG-9");
        fighterList.add("Mikoyan-Gurevich I-70 & 270");
        fighterList.add("Lavochkin La-152");
        fighterList.add("Lavochkin La-150");
        fighterList.add("Lavochkin La-9");
        fighterList.add("CAC CA-15 Kangaroo");
        fighterList.add("VL Pyörremyrsky");
        fighterList.add("Tachikawa Ki-106");
        fighterList.add("Sukhoi Su-5 mixed power fighter");
        fighterList.add("Rikugun Ki-93 heavy fighter");
        fighterList.add("Northrop XP-79");
        fighterList.add("North American P-82/F-82 Twin Mustang");
        fighterList.add("Nakajima Kikka");
        fighterList.add("Nakajima Ki-116");
        fighterList.add("Nakajima Ki-87");
        fighterList.add("Mitsubishi J8M/Ki-200");
        fighterList.add("Mikoyan-Gurevich I-250 mixed power fighter");
        fighterList.add("Messerschmitt Me 263");
        fighterList.add("McDonnell FH Phantom");
        fighterList.add("Lavochkin La-126");
        fighterList.add("Kyushu J7W canard pusher");
        fighterList.add("Kawasaki Ki-100");
        fighterList.add("Hawker Sea Fury");
        fighterList.add("Goodyear F2G Corsair");
        fighterList.add("Curtiss XF15C mixed-propulsion fighter");
        fighterList.add("Consolidated Vultee XP-81 mixed propulsion fighter");
        fighterList.add("Bell XP-83");
        fighterList.add("Bachem Ba 349 rocket VTO interceptor");
        fighterList.add("Arsenal VB 10");
        fighterList.add("VL Humu");
        fighterList.add("Supermarine Spiteful");
        fighterList.add("Sukhoi Su-7 (1944)");
        fighterList.add("Ryan FR Fireball mixed propulsion fighter");
        fighterList.add("Republic XP-72");
        fighterList.add("Nakajima J5N");
        fighterList.add("Mitsubishi Ki-83 heavy fighter");
        fighterList.add("Mitsubishi Ki-46-III KAI Heavy Fighter (conversion)");
        fighterList.add("Mitsubishi A7M");
        fighterList.add("Mikoyan-Gurevich I-225");
        fighterList.add("Mikoyan-Gurevich I-224");
        fighterList.add("Mikoyan-Gurevich I-222");
        fighterList.add("McDonnell XP-67");
        fighterList.add("Martin-Baker MB 5");
        fighterList.add("Lockheed P-80 Shooting Star");
        fighterList.add("Lockheed XP-58 Chain Lightning");
        fighterList.add("Lavochkin La-7");
        fighterList.add("Kawasaki Ki-102 & Ki-108");
        fighterList.add("Ilyushin Il-1");
        fighterList.add("Horten Ho 229 jet flying wing");
        fighterList.add("Heinkel He 162 Volksjäger");
        fighterList.add("Hawker Fury (monoplane)");
        fighterList.add("Grumman F8F Bearcat");
        fighterList.add("Focke-Wulf Ta 152");
        fighterList.add("Doflug D-3802");
        fighterList.add("de Havilland Hornet/Sea Hornet");
        fighterList.add("Boeing XF8B");
        fighterList.add("Blohm & Voss BV 155");
        fighterList.add("Blohm & Voss BV 40");
        fighterList.add("Bell XP-77 lightweight fighter");
        fighterList.add("Yokosuka P1Y2 Kyokko night fighter");
        fighterList.add("Vultee XP-54");
        fighterList.add("VL Mörkö-Morane");
        fighterList.add("Savoia-etti SM.92");
        fighterList.add("Savoia-etti SM.91");
        fighterList.add("Saab 21 pusher fighter");
        fighterList.add("Northrop XP-56 Black Bullet");
        fighterList.add("Nakajima Ki-84 Hayate");
        fighterList.add("Nakajima C6N-1S night fighter");
        fighterList.add("Mikoyan-Gurevich I-231");
        fighterList.add("Mikoyan-Gurevich I-221");
        fighterList.add("Mikoyan-Gurevich I-220");
        fighterList.add("Mikoyan-Gurevich I-211");
        fighterList.add("Messerschmitt Me 310");
        fighterList.add("Kawasaki Ki-96");
        fighterList.add("Kawasaki Ki-64 heavy fighter");
        fighterList.add("Junkers Ju 388 night fighter");
        fighterList.add("Hughes D-2");
        fighterList.add("Gudkov GU-1");
        fighterList.add("Grumman F7F Tigercat");
        fighterList.add("Gorbunov 105");
        fighterList.add("Gloster Meteor jet fighter");
        fighterList.add("Focke-Wulf Ta 154 night fighter");
        fighterList.add("Fisher P-75 Eagle");
        fighterList.add("Dornier Do 335");
        fighterList.add("de Havilland Vampire/Sea Vampire");
        fighterList.add("Curtiss-Wright XP-55 Ascender");
        fighterList.add("Curtiss XP-62");
        fighterList.add("Curtiss XF14C");
        fighterList.add("Chu X-PO");
        fighterList.add("Ambrosini SAI.403");
        fighterList.add("Yakovlev Yak-9");
        fighterList.add("Westland Welkin high altitude interceptor");
        fighterList.add("Vickers Type 432");
        fighterList.add("Tomasevic I-110 heavy fighter");
        fighterList.add("Reggiane Re.2005");
        fighterList.add("Reggiane Re.2004");
        fighterList.add("Polikarpov ITP");
        fighterList.add("Piaggio P.119");
        fighterList.add("Northrop P-61 Black Widow");
        fighterList.add("Mitsubishi Ki-109 heavy day/night fighter");
        fighterList.add("Mitsubishi J2M");
        fighterList.add("Miles M.35 Libellula");
        fighterList.add("Mikoyan-Gurevich I-230");
        fighterList.add("Messerschmitt Me 410");
        fighterList.add("Messerschmitt Me 309");
        fighterList.add("Martin-Baker MB 3");
        fighterList.add("Macchi C.205");
        fighterList.add("Lockheed XP-49");
        fighterList.add("Lavochkin La-5");
        fighterList.add("Kawanishi N1K-J Shiden landplane fighter");
        fighterList.add("Kawanishi N1K Kyofu floatplane fighter");
        fighterList.add("IMAM Ro.58");
        fighterList.add("Heinkel He 219 night fighter");
        fighterList.add("Hawker Tempest");
        fighterList.add("Grumman F6F Hellcat");
        fighterList.add("Fiat G.55/G.56/G.59");
        fighterList.add("FFVS 22");
        fighterList.add("Douglas XA-26A night fighter");
        fighterList.add("Caproni Ca.331");
        fighterList.add("CAC Boomerang");
        fighterList.add("Blackburn Firebrand torpedo fighter");
        fighterList.add("Bereznyak-Isayev BI-1 rocket fighter");
        fighterList.add("Bell P-63 Kingcobra");
        fighterList.add("Bell P-59 Airacomet");
        fighterList.add("Arado Ar 440");
        fighterList.add("Yakovlev I-30/Yak-3");
        fighterList.add("Weiss Manfred WM-23");
        fighterList.add("VL Myrsky");
        fighterList.add("Supermarine Seafire");
        fighterList.add("Republic P-47 Thunderbolt");
        fighterList.add("Polikarpov TIS heavy fighter");
        fighterList.add("Polikarpov I-185");
        fighterList.add("Petlyakov Pe-3 night fighter");
        fighterList.add("Nakajima J1N night fighter");
        fighterList.add("Nakajima A6M2-N floatplane fighter");
        fighterList.add("Mikoyan-Gurevich MiG-7");
        fighterList.add("Mikoyan-Gurevich MiG-5/DIS");
        fighterList.add("Mikoyan-Gurevich I-210");
        fighterList.add("Messerschmitt Me 262/Avia S-92");
        fighterList.add("Messerschmitt Me 163 rocket fighter");
        fighterList.add("Kawasaki Ki-61");
        fighterList.add("Kawasaki Ki-60");
        fighterList.add("Kawasaki Ki-45 heavy fighter");
        fighterList.add("Gudkov GU-82");
        fighterList.add("Grumman XP-50");
        fighterList.add("Fairey Firefly monoplane fleet fighter");
        fighterList.add("de Havilland Mosquito");
        fighterList.add("Curtiss XP-53 & P-60");
        fighterList.add("Curtiss XP-46");
        fighterList.add("Caproni Vizzola F.6");
        fighterList.add("Arsenal-Delanne 10");
        fighterList.add("Yokosuka D4Y2-S heavy night fighter");
        fighterList.add("Yakovlev Yak-7");
        fighterList.add("Yakovlev Yak-1");
        fighterList.add("Vought F4U/FG/F3A Corsair");
        fighterList.add("VEF I-16");
        fighterList.add("Sukhoi Su-1 & Su-3 high altitude fighter");
        fighterList.add("Republic P-43 Lancer");
        fighterList.add("Reggiane Re.2002");
        fighterList.add("Reggiane Re.2001");
        fighterList.add("Pashinin I-21");
        fighterList.add("North American P-51 Mustang");
        fighterList.add("Nikitin-Shevchenko IS polymorphic fighter");
        fighterList.add("Nakajima Ki-44 Shoki");
        fighterList.add("Moskalev SAM-13");
        fighterList.add("Morane-Saulnier M.S.410");
        fighterList.add("Mitsubishi G6M Heavy Fighter");
        fighterList.add("Miles Master Fighter");
        fighterList.add("Miles M.20");
        fighterList.add("Mikoyan-Gurevich MiG-3");
        fighterList.add("Mikoyan-Gurevich MiG-1");
        fighterList.add("MÁVAG Héja");
        fighterList.add("Macchi C.202");
        fighterList.add("Macchi C.201");
        fighterList.add("Lavochkin-Gorbunov-Gudkov LaGG-3");
        fighterList.add("Lavochkin-Gorbunov-Gudkov LaGG-1");
        fighterList.add("Heinkel He 280");
        fighterList.add("Hawker Typhoon");
        fighterList.add("Grumman XF5F Skyrocket");
        fighterList.add("Fairey Fulmar fleet fighter");
        fighterList.add("Dewoitine D.521");
        fighterList.add("Caudron-Renault CR.770");
        fighterList.add("Caudron-Renault CR.760");
        fighterList.add("Caproni Vizzola F.4");
        fighterList.add("Bolkhovitinov I-1");
        fighterList.add("Bisnovat SK-2");
        fighterList.add("Bell XFL Airabonita naval fighter");
        fighterList.add("Arado Ar 240");
        fighterList.add("Ambrosini SAI.107 & 207");



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

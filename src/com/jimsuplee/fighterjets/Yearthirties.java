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

public class Yearthirties extends ListActivity {
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
        fighterList.add("Yatsenko I-28");
        fighterList.add("Yakovlev I-29");
        fighterList.add("Vultee P-66 Vanguard");
        fighterList.add("Tairov Ta-3 escort fighter");
        fighterList.add("Tairov Ta-1 escort fighter");
        fighterList.add("SNCASE (Sud-Est) SE.100");
        fighterList.add("SNCAO (Ouest) CAO.200");
        fighterList.add("Seversky XP-41");
        fighterList.add("Savoia-etti SM.88");
        fighterList.add("Roussel R.30");
        fighterList.add("Republic AP-9");
        fighterList.add("Reggiane Re.2000");
        fighterList.add("PZL.50 Jastrząb");
        fighterList.add("Polikarpov I-190");
        fighterList.add("Petlyakov VI-100 high altitude fighter");
        fighterList.add("North American NA-50 & P-64");
        fighterList.add("Nakajima Ki-58 heavy escort fighter");
        fighterList.add("Mitsubishi A6M Zero");
        fighterList.add("Messerschmitt Me 210");
        fighterList.add("Lockheed P-38 Lightning");
        fighterList.add("IMAM Ro.57");
        fighterList.add("Ilyushin Il-2I armoured fighter");
        fighterList.add("IAR-80");
        fighterList.add("Hawker Tornado");
        fighterList.add("Gloster F.9/37");
        fighterList.add("Fokker D.XXIII");
        fighterList.add("Focke-Wulf Fw 190");
        fighterList.add("Douglas P-70 Havoc night fighter");
        fighterList.add("Curtiss XP-37");
        fighterList.add("Caproni Vizzola F.5");
        fighterList.add("Caproni Ca.335");
        fighterList.add("Bristol Beaufighter strike fighter");
        fighterList.add("Aviotehas PN-3");
        fighterList.add("Avia B-135");
        fighterList.add("Ambrosini SS.4");
        fighterList.add("Aeronautica Umbra Trojani AUT.18");
        fighterList.add("Westland Whirlwind");
        fighterList.add("Romano R-110 3 seat fighter");
        fighterList.add("Rogožarski IK-3");
        fighterList.add("PZL.38 Wilk heavy fighter");
        fighterList.add("Polikarpov I-180");
        fighterList.add("Polikarpov I-153");
        fighterList.add("Polikarpov I-152");
        fighterList.add("Nakajima Ki-43 Hayabusa");
        fighterList.add("Martin-Baker MB 2");
        fighterList.add("Koolhoven F.K.58");
        fighterList.add("Koolhoven F.K.55");
        fighterList.add("Heinkel He 100/He 113");
        fighterList.add("Hawker Hotspur turret fighter");
        fighterList.add("Fiat CR.42");
        fighterList.add("Dornier Do 217 night fighter");
        fighterList.add("Dornier Do 215 night fighter");
        fighterList.add("Dewoitine D.520");
        fighterList.add("Curtiss-Wright CW-21 lightweight fighter");
        fighterList.add("Curtiss P-40 Warhawk");
        fighterList.add("Caproni Ca.165");
        fighterList.add("Canadian Car and Foundry FDB-1");
        fighterList.add("Bristol Type 146");
        fighterList.add("Blackburn Roc turret fighter");
        fighterList.add("Bell P-39 Airacobra");
        fighterList.add("Avia B-35");
        fighterList.add("Arsenal VG-30 - 39");
        fighterList.add("Renard R.36, R.37 & R.38");
        fighterList.add("Polikarpov I-15bis");
        fighterList.add("Macchi C.200");
        fighterList.add("Liuchow Kwangsi Type 3");
        fighterList.add("IMAM Ro.51");
        fighterList.add("Hanriot H.220, H.220-2 & NC.600 heavy fighter");
        fighterList.add("Grumman F4F Wildcat");
        fighterList.add("Gloster F.5/34");
        fighterList.add("Fokker G.I");
        fighterList.add("Focke-Wulf Fw 187 heavy fighter");
        fighterList.add("Fiat G.50");
        fighterList.add("Fiat CR.25 heavy fighter");
        fighterList.add("Brewster F2A Buffalo");
        fighterList.add("Boulton Paul Defiant turret fighter");
        fighterList.add("Borovkov-Florov I-207");
        fighterList.add("Bloch MB.150-157");
        fighterList.add("Blériot-SPAD S.710");
        fighterList.add("Blackburn Skua dive bomber/fighter");
        fighterList.add("Bell YFM-1 Airacuda bomber destroyer");
        fighterList.add("AVIS IV");
        fighterList.add("Arado Ar 197");
        fighterList.add("Vought V-141/V-143");
        fighterList.add("Vickers Venom");
        fighterList.add("Supermarine Spitfire");
        fighterList.add("Potez 630");
        fighterList.add("Nakajima Ki-27");
        fighterList.add("Nakajima Ki-12 & PE");
        fighterList.add("Mitsubishi Ki-33");
        fighterList.add("Messerschmitt Bf 110");
        fighterList.add("Kawasaki Ki-28");
        fighterList.add("Junkers Ju 88 night fighter");
        fighterList.add("IMAM Ro.44 floatplane fighter");
        fighterList.add("Ilyushin I-21/TsKB-32");
        fighterList.add("Henschel Hs 124 heavy fighter");
        fighterList.add("Fokker D.XXI");
        fighterList.add("Focke-Wulf Fw 57");
        fighterList.add("Dewoitine D.513 & 514");
        fighterList.add("Caudron C.714");
        fighterList.add("Avia B-634");
        fighterList.add("ANF Les Mureaux 190");
        fighterList.add("Tupolev ANT-46/DI-8 heavy cannon fighter");
        fighterList.add("Tupolev ANT-29 cannon fighter");
        fighterList.add("Seversky P-35");
        fighterList.add("Morane-Saulnier M.S.406");
        fighterList.add("Morane-Saulnier M.S.405");
        fighterList.add("Mitsubishi Ki-18");
        fighterList.add("Mitsubishi A5M");
        fighterList.add("Messerschmitt Bf 109");
        fighterList.add("Loire-Nieuport LN.160, 161 & SNCAO 161");
        fighterList.add("Loire 250");
        fighterList.add("Loire 210 floatplane fighter");
        fighterList.add("Kawasaki Ki-10");
        fighterList.add("Ikarus IK-2");
        fighterList.add("Heinkel He 112");
        fighterList.add("Hawker Hurricane & Sea Hurricane");
        fighterList.add("Grumman F3F");
        fighterList.add("Grigorovich IP-1 cannon fighter");
        fighterList.add("Focke-Wulf Fw 159");
        fighterList.add("Fairey Fantôme");
        fighterList.add("Dewoitine D.503/D.511");
        fighterList.add("Curtiss P-36 Hawk");
        fighterList.add("Caproni CH.1");
        fighterList.add("CAC Wirraway trainer/emergency fighter");
        fighterList.add("Bristol Blenheim night fighter");
        fighterList.add("Bernard H 110 floatplane fighter");
        fighterList.add("AVIS III");
        fighterList.add("AVIS II");
        fighterList.add("Armstrong Whitworth AW.35 Scimitar");
        fighterList.add("Arado Ar 80");
        fighterList.add("ANF Les Mureaux 180 2 seat fighter");
        fighterList.add("Westland F.7/30");
        fighterList.add("Supermarine 224 F.7/30");
        fighterList.add("SET XV");
        fighterList.add("Praga E-45");
        fighterList.add("Polikarpov I-17");
        fighterList.add("Nakajima NAF-2 8-shi 2 seat carrier fighter");
        fighterList.add("Nakajima Ki-11");
        fighterList.add("Nakajima Ki-8");
        fighterList.add("Nakajima A4N");
        fighterList.add("Mitsubishi Ka-8 two-seat shipboard fighter");
        fighterList.add("Loire 46");
        fighterList.add("Kochyerigin DI-6");
        fighterList.add("Kawasaki Ki-5");
        fighterList.add("IMAM Ro.41");
        fighterList.add("IAR-16");
        fighterList.add("Hawker P.V.3 day & night fighter");
        fighterList.add("Grumman GG");
        fighterList.add("Grigorovich IP-4 cannon fighter");
        fighterList.add("Gloster Gladiator & Sea Gladiator");
        fighterList.add("Dornier Do 17 night fighter");
        fighterList.add("Dewoitine D.510");
        fighterList.add("Curtiss XF13C");
        fighterList.add("Consolidated PB-2/P-30 2 seat fighter");
        fighterList.add("Caproni Ca.301");
        fighterList.add("Bristol Type 133");
        fighterList.add("Bristol Type 123");
        fighterList.add("Boeing P-29");
        fighterList.add("Berliner-Joyce XF3J");
        fighterList.add("Arado Ar 76 lightweight fighter");
        fighterList.add("Arado Ar 68");
        fighterList.add("Aero A.102");
        fighterList.add("Vought XF3U");
        fighterList.add("Vought V-80");
        fighterList.add("Tupolev ANT-31/I-14");
        fighterList.add("Tupolev ANT-21");
        fighterList.add("PZL P.24");
        fighterList.add("Polikarpov I-16");
        fighterList.add("Polikarpov I-15");
        fighterList.add("Northrop XFT");
        fighterList.add("Nakajima NAF-1 6-shi 2 seat carrier fighter");
        fighterList.add("Morane-Saulnier M.S.325");
        fighterList.add("Mitsubishi 1MF10 7-shi carrier fighter");
        fighterList.add("Loire 45");
        fighterList.add("Letov Š-231");
        fighterList.add("IAR-15");
        fighterList.add("IAR-14");
        fighterList.add("IAR-13");
        fighterList.add("IAR-12");
        fighterList.add("Heinkel He 74 light fighter");
        fighterList.add("Heinkel He 51");
        fighterList.add("Hanriot H.110 & H.115 pusher monoplane");
        fighterList.add("Grumman F2F");
        fighterList.add("Gourdou-Leseurre GL.482");
        fighterList.add("Gloster Gauntlet");
        fighterList.add("Fiat CR.32/CR.33/CR.40/CR.41");
        fighterList.add("Douglas XFD");
        fighterList.add("Curtiss XP-31 Swift");
        fighterList.add("Curtiss F12C parasol fighter");
        fighterList.add("Curtiss BF2C Goshawk bomber-fighter");
        fighterList.add("Caproni Ca.114");
        fighterList.add("Breda Ba.27");
        fighterList.add("Boeing Model 267");
        fighterList.add("Boeing XF7B");
        fighterList.add("Boeing XF6B");
        fighterList.add("Blériot-SPAD S.510");
        fighterList.add("Bernard H.52 floatplane fighter");
        fighterList.add("Berliner-Joyce F2J");
        fighterList.add("AVIS I");
        fighterList.add("Avia B-534");
        fighterList.add("Arado Ar 67");
        fighterList.add("Wibault 313");
        fighterList.add("Praga E-44");
        fighterList.add("Nieuport-Delage NiD 120 - NiD 125");
        fighterList.add("Nieuport-Delage NiD 629");
        fighterList.add("Nieuport-Delage NiD 628 high altitude fighter");
        fighterList.add("Nieuport-Delage NiD 626 Peruvian version");
        fighterList.add("Morane-Saulnier M.S.225");
        fighterList.add("Loire 43");
        fighterList.add("Laville DI-4");
        fighterList.add("Heinkel He 49");
        fighterList.add("Grumman SF/G-6");
        fighterList.add("Gourdou-Leseurre GL.40, 410 & 450");
        fighterList.add("General Aviation XFA");
        fighterList.add("Fiat CR.30");
        fighterList.add("Dewoitine D.560 & D.570");
        fighterList.add("Dewoitine D.535");
        fighterList.add("Dewoitine D.500 & D.501");
        fighterList.add("Curtiss F11C Goshawk");
        fighterList.add("Curtiss XF10C Helldiver 2 seat fighter-bomber");
        fighterList.add("Boeing Model 256");
        fighterList.add("Boeing P-26 Peashooter");
        fighterList.add("Bernard 260");
        fighterList.add("Avia B-34");
        fighterList.add("ANF Les Mureaux 170");
        fighterList.add("Vickers Type 161");
        fighterList.add("Tupolev ANT-23/I-12");
        fighterList.add("PZL P.11");
        fighterList.add("PZL P.8");
        fighterList.add("Lockheed YP-24");
        fighterList.add("Heinkel HD 43");
        fighterList.add("Hawker Nimrod biplane");
        fighterList.add("Hawker Hart Fighter");
        fighterList.add("Hawker Fury");
        fighterList.add("Hawker Demon");
        fighterList.add("Grumman FF/G-5/G-23");
        fighterList.add("Grigorovich I-Z");
        fighterList.add("Grigorovich DI-3");
        fighterList.add("Fokker D.XVII");
        fighterList.add("Dornier Do 10 two seat fighter");
        fighterList.add("Dewoitine D.371");
        fighterList.add("Curtiss F9C Sparrowhawk parasite fighter");
        fighterList.add("Bernard 74 & 75");
        fighterList.add("Arado Ar 65");
        fighterList.add("ANF Les Mureaux 114 night fighter");
        fighterList.add("Albatros L 84");
        fighterList.add("Westland C.O.W. Gun Fighter");
        fighterList.add("Vickers Jockey");
        fighterList.add("Tupolev ANT-13/I-8");
        fighterList.add("SIAI S.67 seaplane fighter");
        fighterList.add("PZL P.7");
        fighterList.add("PZL P.6");
        fighterList.add("Podlaska Wytwórnia Samolotów PWS-10");
        fighterList.add("Polikarpov I-5");
        fighterList.add("Nieuport-Delage NiD 82");
        fighterList.add("Nieuport-Delage NiD 622");
        fighterList.add("Macchi M.71 catapult flying boat fighter");
        fighterList.add("Kawasaki KDA-5 Army Type 92");
        fighterList.add("IAR-11");
        fighterList.add("Hawker Osprey fleet fighter/reconnaissance");
        fighterList.add("Boeing XP-15");
        fighterList.add("Boeing XP-9");
        fighterList.add("Boeing XF5B");
        fighterList.add("Berliner-Joyce P-16");
        fighterList.add("Berliner-Joyce XFJ");
        fighterList.add("Armstrong Whitworth A.W.16");
        fighterList.add("Arado Ar 64");
        fighterList.add("Arado SSD I");

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

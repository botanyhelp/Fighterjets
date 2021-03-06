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

public class Yeartwenties extends ListActivity {
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
        fighterList.add("Wibault 210");
        fighterList.add("Westland Interceptor");
        fighterList.add("Vought XF2U");
        fighterList.add("Vickers Type 177 shipboard fighter");
        fighterList.add("Vickers Type 143 Bolivian Scout");
        fighterList.add("Thomas-Morse XP-13");
        fighterList.add("Svenska Aero Jaktfalken I & II");
        fighterList.add("Short Gurnard");
        fighterList.add("Saunders A.10");
        fighterList.add("PZL P.1");
        fighterList.add("Prajadhipok");
        fighterList.add("Potez 31 2 seat night fighter");
        fighterList.add("Nakajima A2N");
        fighterList.add("Letov Š-31");
        fighterList.add("Junkers K 47");
        fighterList.add("Hall XFH");
        fighterList.add("Fokker D.XVI");
        fighterList.add("Fairey Fox Belgian fighter/reconsaissance");
        fighterList.add("Fairey Firefly II biplane");
        fighterList.add("Fairey Fleetwing fleet fighter");
        fighterList.add("de Havilland DH.77");
        fighterList.add("Boeing Model 218");
        fighterList.add("Boeing Model 100");
        fighterList.add("Boeing P-12");
        fighterList.add("Bernard 20");
        fighterList.add("Arado SD III");
        fighterList.add("Arado SD II");
        fighterList.add("Wibault 130 Trombe & 170 Tornade lightweight fighter");
        fighterList.add("Vickers Vireo");
        fighterList.add("Renard Epervier");
        fighterList.add("Polikarpov I-3");
        fighterList.add("Parnall Pipit");
        fighterList.add("Nieuport-Delage NiD 72");
        fighterList.add("Nieuport-Delage NiD 62");
        fighterList.add("Nakajima Army Type 91 Fighter");
        fighterList.add("Mitsubishi 1MF2");
        fighterList.add("Kawasaki KDA-3");
        fighterList.add("Heinkel HD 38");
        fighterList.add("Heinkel HD 37");
        fighterList.add("Hawker Hoopoe");
        fighterList.add("Hawker F.20/27");
        fighterList.add("Gloster Gnatsnapper carrier fighter");
        fighterList.add("Dewoitine D.27");
        fighterList.add("Curtiss YP-20");
        fighterList.add("Curtiss XP-10");
        fighterList.add("Curtiss P-5 Superhawk");
        fighterList.add("Curtiss P-3 Hawk/XP-21");
        fighterList.add("Curtiss F8C Falcon/Helldiver 2 seat fighter-bomber");
        fighterList.add("Bristol Bullpup");
        fighterList.add("Bristol Bulldog");
        fighterList.add("Boulton & Paul Partridge");
        fighterList.add("Boeing XP-8");
        fighterList.add("Boeing XP-7");
        fighterList.add("Boeing F4B");
        fighterList.add("Boeing F3B");
        fighterList.add("Blackburn Lincock");
        fighterList.add("Amiot 110 lightweight Jockey fighter");
        fighterList.add("Albatros L 77v reconnaissance/fighter");
        fighterList.add("Westland Wizard");
        fighterList.add("Waco CTO-A");
        fighterList.add("Waco CSO-A/240A");
        fighterList.add("Tupolev ANT-5/I-4");
        fighterList.add("Podlaska Wytwórnia Samolotów PWS-1 & 1bis two-seat fighter");
        fighterList.add("Nieuport-Delage NiD 52");
        fighterList.add("Morane-Saulnier M.S.121");
        fighterList.add("Mitsubishi 1MF9");
        fighterList.add("Macchi M.41 & M.41bis flying boat fighter");
        fighterList.add("Loring C-1");
        fighterList.add("Levy-Biche LB.2 & LB.6 naval fighter");
        fighterList.add("Kawanishi K-11 carrier fighter");
        fighterList.add("IVL Haukka");
        fighterList.add("Hawker Hawfinch");
        fighterList.add("Gloster Goldfinch");
        fighterList.add("Gloster Gambet/Nakajima A1N");
        fighterList.add("Eberhart XFG & XF2G");
        fighterList.add("Curtiss P-6 Hawk");
        fighterList.add("Curtiss F7C Seahawk");
        fighterList.add("Comte AC-1");
        fighterList.add("Bristol Type 101 two-seat fighter");
        fighterList.add("Bristol Bagshot home defence fighter");
        fighterList.add("Boeing XP-4");
        fighterList.add("Blériot-SPAD S.91");
        fighterList.add("Blackburn Turcock");
        fighterList.add("Avro 584 Avocet");
        fighterList.add("Aviméta 88 2 seat night fighter/reconnaissance");
        fighterList.add("Avia BH-33");
        fighterList.add("Army Arsenal Model 3");
        fighterList.add("Armstrong Whitworth Starling");
        fighterList.add("Arado SD I");
        fighterList.add("Wright XF3W");
        fighterList.add("Wibault 12, 121 & 122 Sirocco");
        fighterList.add("Wibault 9");
        fighterList.add("Wibault 8 Simoun");
        fighterList.add("Westland Westbury home defence fighter");
        fighterList.add("Vought FU");
        fighterList.add("Villiers 24 night fighter");
        fighterList.add("Villiers 8 single seat carrier fighter");
        fighterList.add("Villiers V night fighter");
        fighterList.add("Vickers Type 123 & 141");
        fighterList.add("Polikarpov DI-1 two seat fighter");
        fighterList.add("Nieuport-Delage NiD 48, 48bis & 481 lightweight fighter");
        fighterList.add("Levasseur PL.6 2 seat fighter");
        fighterList.add("Letov Š-22");
        fighterList.add("Heinkel HD 23");
        fighterList.add("Hanriot H.33");
        fighterList.add("Gloster Guan");
        fighterList.add("Fiat CR.20");
        fighterList.add("Dewoitine D.25 2 seat fighter");
        fighterList.add("Boeing F2B");
        fighterList.add("Blériot-SPAD S.60 two-seat fighter");
        fighterList.add("Bernard 15");
        fighterList.add("Bernard SIMB AB 12");
        fighterList.add("Avro 566 Avenger");
        fighterList.add("Avia BH-23 night fighter");
        fighterList.add("ACAZ C.2 2 seat fighter");
        fighterList.add("Villiers II 2 seat carrier fighter");
        fighterList.add("Militär Apparat (Häfeli) MA-7");
        fighterList.add("Marinens Flyvebaatfabrikk M.F.9");
        fighterList.add("Letov Š-20");
        fighterList.add("IVL C.VI.25");
        fighterList.add("Hawker Hornbill");
        fighterList.add("Hawker Heron");
        fighterList.add("Hanriot H.31");
        fighterList.add("Gloster Gorcock");
        fighterList.add("Gloster Gamecock");
        fighterList.add("Fokker D.XIV");
        fighterList.add("Dewoitine D.21 & D.53");
        fighterList.add("Dewoitine D.12");
        fighterList.add("Dewoitine D.19");
        fighterList.add("Curtiss P-2 Hawk");
        fighterList.add("Curtiss P-1 Hawk");
        fighterList.add("Caproni Ca.70 & 71 night fighter");
        fighterList.add("Bernard SIMB AB 14");
        fighterList.add("Beardmore W.B.XXVI two seat fighter");
        fighterList.add("Avia BH-21");
        fighterList.add("Albatros L 65 two-seat reconnaissance fighter");
        fighterList.add("Wibault 7 & Vickers Wibault");
        fighterList.add("TNCA Series E Tololoche");
        fighterList.add("Thomas Morse TM-23");
        fighterList.add("SIAI S.58 seaplane fighter");
        fighterList.add("SIAI S.52");
        fighterList.add("Potez 26");
        fighterList.add("Potez 23");
        fighterList.add("Nieuport-Delage NiD 43 2 seat floatplane fighter");
        fighterList.add("Nieuport-Delage NiD 42");
        fighterList.add("Macchi M.26 flying boat fighter");
        fighterList.add("Levasseur PL.5 shipborne fighter");
        fighterList.add("Letov Š-14");
        fighterList.add("Letov Š-13");
        fighterList.add("Letov Š-12");
        fighterList.add("IVL C.24");
        fighterList.add("Grigorovich I-2 & I-2bis");
        fighterList.add("Grigorovich I-1");
        fighterList.add("FVM J 24");
        fighterList.add("Fokker D.XIII");
        fighterList.add("Fokker D.XII");
        fighterList.add("Fiat CR.1/CR.2/CR.5/CR.10");
        fighterList.add("Dobi-III");
        fighterList.add("Dewoitine D.15");
        fighterList.add("Dewoitine D.9");
        fighterList.add("de Monge M-101 2 seat fighter");
        fighterList.add("de Havilland Dormouse");
        fighterList.add("Buscaylet-Bechereau BB.2");
        fighterList.add("Blériot-SPAD S.51");
        fighterList.add("Bernard SIMB AB 10");
        fighterList.add("Avia BH-19");
        fighterList.add("Avia BH-17");
        fighterList.add("Wibault 3");
        fighterList.add("Polikarpov I-1");
        fighterList.add("Piaggio P.2");
        fighterList.add("NVI F.K.31");
        fighterList.add("Nieuport-Delage NiD 40 high altitude fighter");
        fighterList.add("Nieuport-Delage NiD 37 high altitude fighter");
        fighterList.add("Mikhelson/Korvin MK-1 Rybka floatplane/ski fighter");
        fighterList.add("Letov Š-7");
        fighterList.add("Junkers T.22");
        fighterList.add("Hawker Woodcock/Danecock/Dankok");
        fighterList.add("Hanriot H.26");
        fighterList.add("Handley Page Type S");
        fighterList.add("Gloster Grouse");
        fighterList.add("Gloster Grebe");
        fighterList.add("Gabardini G.9");
        fighterList.add("Gabardini G.8");
        fighterList.add("FVM J 23");
        fighterList.add("Fokker DC.I");
        fighterList.add("Fokker D.XI/PW-7");
        fighterList.add("Engineering Division TP-1 two seat fighter");
        fighterList.add("Dewoitine D.8");
        fighterList.add("De Marçay 4");
        fighterList.add("Dayton-Wright XPS-1");
        fighterList.add("Curtiss PW-8");
        fighterList.add("Curtiss F6C Hawk");
        fighterList.add("Buscaylet-de Monge 5/2");
        fighterList.add("Bristol Jupiter Fighter");
        fighterList.add("Boeing PW-9");
        fighterList.add("Boeing FB");
        fighterList.add("Blériot-SPAD S.81");
        fighterList.add("Blériot-SPAD S.71 & 72");
        fighterList.add("Blériot-SPAD S.61");
        fighterList.add("Avia BH-8");
        fighterList.add("Avia BH-7");
        fighterList.add("Avia BH-6");
        fighterList.add("Aero A.20");
        fighterList.add("Aero A.19");
        fighterList.add("Aero A.18");
        fighterList.add("Vought VE-9");
        fighterList.add("Tokorozawa Koshiki-2");
        fighterList.add("Thomas-Morse MB-9");
        fighterList.add("Potez XI");
        fighterList.add("Parnall Plover");
        fighterList.add("Loening PA-1");
        fighterList.add("Lioré et Olivier LeO 7 bomber escort");
        fighterList.add("Letov Š-4");
        fighterList.add("Letov Š-3");
        fighterList.add("Hanriot HD.15 2 seat high altitude fighter");
        fighterList.add("Gourdou-Leseurre GL.50");
        fighterList.add("Fairey Flycatcher");
        fighterList.add("Dornier Do H");
        fighterList.add("Dewoitine D.1");
        fighterList.add("Curtiss TS-1 and F4C-1");
        fighterList.add("Bristol Bullfinch");
        fighterList.add("Blériot-SPAD S.41");
        fighterList.add("Avia BH-4");
        fighterList.add("Aeromarine PG-1");
        fighterList.add("Mitsubishi 1MF");
        fighterList.add("Hanriot HD.12 naval landplane fighter");
        fighterList.add("Gloster Mars, Nightjar & Sparrowhawk");
        fighterList.add("Fokker PW-5");
        fighterList.add("Fokker D.IX/PW-6");
        fighterList.add("Fairey Pintail 2 seat floatplane fighter");
        fighterList.add("Engineering Division PW-1");
        fighterList.add("Avia BH-3");
        fighterList.add("Aero Ae 04");
        fighterList.add("Supermarine Sea King seaplane fighter");
        fighterList.add("Parnall Puffin amphibious fighter");
        fighterList.add("Gourdou-Leseurre GL.30 series");
        fighterList.add("Aero Ae 02");

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

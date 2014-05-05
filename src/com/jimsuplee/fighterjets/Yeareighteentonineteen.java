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

public class Yeareighteentonineteen extends ListActivity {
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
        fighterList.add("Thomas-Morse MB-3");
        fighterList.add("Tebaldi-Zari");
        fighterList.add("SPAD S.XXII");
        fighterList.add("Sopwith Snark");
        fighterList.add("Sopwith Snapper");
        fighterList.add("Pomilio FVL-8");
        fighterList.add("Orenco D");
        fighterList.add("Nieuport Nighthawk\\Gloster Nighthawk");
        fighterList.add("Nieuport-Delage NiD 32RH lightweight naval fighter");
        fighterList.add("Nieuport Nie 31RH");
        fighterList.add("etti MVT/SIAI S.50");
        fighterList.add("Hispano Aviación Baron");
        fighterList.add("Hanriot HD.6 2 seat fighter");
        fighterList.add("Galvin HC floatplane fighter");
        fighterList.add("Díaz Type C");
        fighterList.add("Christmas Bullet");
        fighterList.add("Bristol Badger");
        fighterList.add("Borel C.2 2 seat fighter");
        fighterList.add("BAJ IV 2 seat fighter");
        fighterList.add("Austin Greyhound");
        fighterList.add("Armstrong Whitworth Siskin");
        fighterList.add("Armstrong Whitworth Ara");
        fighterList.add("Zeppelin-Lindau (Dornier) D.I");
        fighterList.add("WKF Dr.I");
        fighterList.add("WKF D.I");
        fighterList.add("Wibault 1");
        fighterList.add("Westland Weasel");
        fighterList.add("Westland Wagtail");
        fighterList.add("Vought VE-8");
        fighterList.add("TNCA Series C Microplano");
        fighterList.add("Thomas-Morse MB-2");
        fighterList.add("Thomas-Morse MB-1");
        fighterList.add("Spyker-Trompenburg V.3");
        fighterList.add("SPAD S.XXIV ships fighter");
        fighterList.add("SPAD S.XXI");
        fighterList.add("SPAD S.XX");
        fighterList.add("SPAD S.XVII");
        fighterList.add("Sopwith Swallow");
        fighterList.add("Sopwith Snail");
        fighterList.add("Sopwith Dragon");
        fighterList.add("Sopwith Buffalo Armoured reconnaissance fighter");
        fighterList.add("Sopwith Bulldog two-seat fighter");
        fighterList.add("Siemens-Schuckert D.VI parasol monoplane");
        fighterList.add("Siemens-Schuckert D.V");
        fighterList.add("Siemens-Schuckert D.IV");
        fighterList.add("SEA IV");
        fighterList.add("Schütte-Lanz D.IV");
        fighterList.add("Schütte-Lanz D.III");
        fighterList.add("R.E.P. C.1");
        fighterList.add("Port Victoria P.V.5a floatplane fighter");
        fighterList.add("Pomilio Gamma");
        fighterList.add("Pfalz Dr.II triplane");
        fighterList.add("Pfalz D.XV");
        fighterList.add("Pfalz D.XIV");
        fighterList.add("Pfalz D.XIII");
        fighterList.add("Pfalz D.XII");
        fighterList.add("Pfalz D.VIII");
        fighterList.add("Packard-Le Peré LUSAC-11 & LUSAC-21");
        fighterList.add("Orenco B");
        fighterList.add("Nieuport-Delage NiD 29");
        fighterList.add("Morane-Saulnier AN series");
        fighterList.add("Martinsyde Buzzard");
        fighterList.add("Mark D.I");
        fighterList.add("Macchi M.14");
        fighterList.add("Macchi M.7 flying boat fighter");
        fighterList.add("LVG D.VI");
        fighterList.add("LVG D.V");
        fighterList.add("LVG D.IV");
        fighterList.add("Loening PW-2");
        fighterList.add("Loening M-8");
        fighterList.add("Lloyd 40.16");
        fighterList.add("Lloyd 40.15 triplane");
        fighterList.add("Kondor D.VI");
        fighterList.add("Kondor D.II");
        fighterList.add("Kondor D.I");
        fighterList.add("Hansa-Brandenburg W.32 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.29/W.33 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.27 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.19 floatplane fighter");
        fighterList.add("Hanriot HD.8 naval landplane fighter");
        fighterList.add("Hanriot HD.7");
        fighterList.add("Hanriot HD.5 2 seat fighter");
        fighterList.add("Häfeli DH-4");
        fighterList.add("Gourdou-Leseurre Type B, GL.2/21/22/23/24");
        fighterList.add("Gourdou-Leseurre Type A");
        fighterList.add("Fokker V.27 & V.37 inline E.V");
        fighterList.add("Fokker V.7 triplane");
        fighterList.add("Fokker E.V/D.VIII");
        fighterList.add("Fokker D.X");
        fighterList.add("Fokker D.VII & V.34 & 36");
        fighterList.add("Fokker D.VI");
        fighterList.add("Farman F.31 2 seat fighter");
        fighterList.add("Ducrot SLD");
        fighterList.add("Descamps 27");
        fighterList.add("De Marçay 2");
        fighterList.add("Daimler D.I");
        fighterList.add("Curtiss HA floatplane fighter");
        fighterList.add("Curtiss 18");
        fighterList.add("Courtois-Suffit Lescop CSL-1");
        fighterList.add("Bristol Scout F");
        fighterList.add("Breguet 17 night fighter");
        fighterList.add("Breguet LE Laboratoire Eiffel");
        fighterList.add("Boulton & Paul Bobolink");
        fighterList.add("BAT Basilisk");
        fighterList.add("BAT Bantam");
        fighterList.add("Avro 531 Spider");
        fighterList.add("Aviatik D.VII");
        fighterList.add("Aviatik D.VI");
        fighterList.add("Austin Osprey");
        fighterList.add("Armstrong Whitworth Armadillo");
        fighterList.add("Albatros Dr.II triplane");
        fighterList.add("Albatros D.XII");
        fighterList.add("Albatros D.XI");
        fighterList.add("Albatros D.X");
        fighterList.add("Albatros D.IX");
        fighterList.add("Albatros D.VI pusher fighter");
        fighterList.add("Adamoli-Cattani fighter");

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

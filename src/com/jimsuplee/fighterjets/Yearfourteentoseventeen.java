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

public class Yearfourteentoseventeen extends ListActivity {
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
        fighterList.add("Westland N.1B floatplane fighter");
        fighterList.add("Vought VE-7S & VE-7SF");
        fighterList.add("Vickers Vampire");
        fighterList.add("Vickers F.B.25 night fighter");
        fighterList.add("Vickers F.B.24 2 seat fighter");
        fighterList.add("Thulin K");
        fighterList.add("Standard E-1");
        fighterList.add("SPAD S.XV");
        fighterList.add("SPAD S.XIV seaplane fighter");
        fighterList.add("SPAD S.XIII");
        fighterList.add("SPAD S.XII cannon fighter");
        fighterList.add("SPAD S.XI Cn2 2 seat night fighter");
        fighterList.add("Sopwith Snipe");
        fighterList.add("Sopwith 3F.2 Hippo two-seat fighter");
        fighterList.add("Sopwith Dolphin");
        fighterList.add("Sikorsky S-18 4-engine escort fighter");
        fighterList.add("Siemens-Schuckert DDr.I twin engine push-pull fighter");
        fighterList.add("Siemens-Schuckert D.III");
        fighterList.add("Siemens-Schuckert D.II");
        fighterList.add("Rumpler D.I");
        fighterList.add("Royal Aircraft Factory N.E.1 night fighter");
        fighterList.add("Rex D (1917)");
        fighterList.add("Port Victoria P.V.9 floatplane fighter");
        fighterList.add("Port Victoria P.V.8 lightweight fighter");
        fighterList.add("Port Victoria P.V.7 lightweight fighter");
        fighterList.add("Port Victoria P.V.5 floatplane fighter");
        fighterList.add("Phönix 20.22-25");
        fighterList.add("Phönix 20.14, 20.15, D.I, D.II & D.III");
        fighterList.add("Phönix 20.16 2 seat fighter");
        fighterList.add("Pfalz Dr.I triplane");
        fighterList.add("Pfalz D.VII");
        fighterList.add("Pfalz D.VI");
        fighterList.add("Pfalz D.III");
        fighterList.add("Pemberton-Billing Nighthawk Zeppelin fighter");
        fighterList.add("Oeffag D.III");
        fighterList.add("Nieuport 28");
        fighterList.add("Nieuport 17bis, 24, 24bis, 25 & 27");
        fighterList.add("Nielsen & Winther Type AA");
        fighterList.add("Morane-Saulnier AI");
        fighterList.add("Morane-Saulnier AF");
        fighterList.add("Martinsyde F.1");
        fighterList.add("Mann Egerton Type H ship-borne fighter");
        fighterList.add("Macchi M.6 flying boat fighter");
        fighterList.add("Macchi M.5 flying boat fighter");
        fighterList.add("LVG D.III");
        fighterList.add("Lohner Type A/Dr.I");
        fighterList.add("Lohner Type AA");
        fighterList.add("LFG Roland D.VI");
        fighterList.add("Kondor D.VII");
        fighterList.add("Kasyanenko KPI-5");
        fighterList.add("Junkers J 9/D.I all-metal monoplane fighter");
        fighterList.add("Junkers J 7 all-metal monoplane fighter");
        fighterList.add("Junkers CL.I");
        fighterList.add("Heinrich Pursuit");
        fighterList.add("Hansa-Brandenburg W.25 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.18 flying boat fighter");
        fighterList.add("Hansa-Brandenburg W.17 flying boat fighter");
        fighterList.add("Hansa-Brandenburg W.16 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.12 floatplane fighter");
        fighterList.add("Hansa-Brandenburg W.11 floatplane fighter");
        fighterList.add("Hansa-Brandenburg L.16 triplane");
        fighterList.add("Hansa-Brandenburg L.14");
        fighterList.add("Hanriot HD.3");
        fighterList.add("Hanriot HD.2 floatplane fighter");
        fighterList.add("Hannover CL.II escort fighter");
        fighterList.add("Geest Fighter");
        fighterList.add("Friedrichshafen FF.54 triplane/quadruplane");
        fighterList.add("Fokker V.17, V.20, V.23 & V.25");
        fighterList.add("Fokker V.8 tandem triplane-biplane");
        fighterList.add("Fokker V.6 triplane");
        fighterList.add("Fokker Dr.I triplane");
        fighterList.add("Fairey F.2 3 seat long range fighter");
        fighterList.add("Euler Vierdecker quadruplane");
        fighterList.add("Euler Dr.I, II & III");
        fighterList.add("Euler D.II");
        fighterList.add("Dufaux avions-canon");
        fighterList.add("de Bruyère C.1 canard pusher");
        fighterList.add("Caudron O");
        fighterList.add("Burgess HT-B/HT-2 speed scout");
        fighterList.add("Blackburn Triplane Zeppelin fighter");
        fighterList.add("Berckmans Speed Scout");
        fighterList.add("Beardmore W.B.V");
        fighterList.add("Beardmore W.B.IV");
        fighterList.add("Beardmore W.B.III");
        fighterList.add("Beardmore W.B.2");
        fighterList.add("Avro 530 2 seat fighter");
        fighterList.add("Aviatik D.III");
        fighterList.add("Aviatik (Berg) D.II");
        fighterList.add("Aviatik D.I");
        fighterList.add("Austin-Ball A.F.B.1");
        fighterList.add("Ansaldo SVA");
        fighterList.add("Ansaldo ISVA floatplane fighter");
        fighterList.add("Ansaldo A.1 Balilla");
        fighterList.add("Alter A.1");
        fighterList.add("Alcock Scout");
        fighterList.add("Albree Pigeon-Fraser Pursuit");
        fighterList.add("Albatros Dr.I triplane");
        fighterList.add("Albatros D.VII");
        fighterList.add("Albatros D.V & D.Va");
        fighterList.add("AEG Dr.I triplane");
        fighterList.add("AEG D.I, D.II & D.III");
        fighterList.add("Wight Quadruplane");
        fighterList.add("Wight Baby floatplane fighter");
        fighterList.add("Vickers F.B.19");
        fighterList.add("Vickers F.B.16");
        fighterList.add("Vickers F.B.12");
        fighterList.add("Vickers F.B.11 3 seat escort fighter");
        fighterList.add("Tereshchenko No 7");
        fighterList.add("Sturtevant B speed scout/pursuit");
        fighterList.add("SPAD S.VII");
        fighterList.add("Sopwith Triplane");
        fighterList.add("Sopwith Pup");
        fighterList.add("Sopwith L.R.T.Tr. triplane escort fighter");
        fighterList.add("Sopwith Hispano-Suiza Triplane");
        fighterList.add("Sopwith Camel");
        fighterList.add("Sikorsky S-20");
        fighterList.add("Siemens-Schuckert D.I");
        fighterList.add("Shchetinin (Grigorovich) M-11 & M-12 flying boat fighter");
        fighterList.add("Rumpler 6B Floatplane fighter");
        fighterList.add("Royal Aircraft Factory S.E.5 & 5a");
        fighterList.add("Port Victoria P.V.2 & P.V.2bis floatplane fighter");
        fighterList.add("Port Victoria P.V.1 floatplane fighter");
        fighterList.add("Pfalz E.V monoplane");
        fighterList.add("Pfalz E.IV monoplane");
        fighterList.add("Pfalz D.IV");
        fighterList.add("Parnall Scout Zeppelin fighter");
        fighterList.add("Nieuport 17, 21 & 23");
        fighterList.add("Mosca MB bis");
        fighterList.add("Morane-Saulnier AC");
        fighterList.add("Morane-Saulnier V");
        fighterList.add("Morane-Saulnier I");
        fighterList.add("Martinsyde G.100");
        fighterList.add("LVG D.II");
        fighterList.add("LVG D 10");
        fighterList.add("Lohner 10.20 Spuckerl");
        fighterList.add("LFG Roland D.III");
        fighterList.add("LFG Roland D.II");
        fighterList.add("Junkers J 2 all-metal monoplane fighter");
        fighterList.add("Hansa-Brandenburg KF pusher fighter");
        fighterList.add("Hansa-Brandenburg KDW floatplane fighter");
        fighterList.add("Hansa-Brandenburg D.I");
        fighterList.add("Hansa-Brandenburg CC");
        fighterList.add("Hanriot HD.1");
        fighterList.add("Germania JM");
        fighterList.add("Friedrichshafen FF.46");
        fighterList.add("Friedrichshafen FF.43");
        fighterList.add("Fokker V.4");
        fighterList.add("Fokker V.3");
        fighterList.add("Fokker V.2");
        fighterList.add("Fokker V.1");
        fighterList.add("Fokker D.V");
        fighterList.add("Fokker D.IV");
        fighterList.add("Fokker D.III");
        fighterList.add("Fokker D.II");
        fighterList.add("Fokker D.I");
        fighterList.add("FBA Ca2 Avion-Canon 2 seat fighter");
        fighterList.add("Farman HF.30 2 seat fighter");
        fighterList.add("Fairey Hamble Baby floatplane fighter");
        fighterList.add("Euler D.I");
        fighterList.add("Engels MI");
        fighterList.add("Dufaux C.1");
        fighterList.add("Bristol T.T.A. home defence fighter");
        fighterList.add("Bristol M.1 Bullet");
        fighterList.add("Bristol F.2 Fighter 2 seat fighter");
        fighterList.add("Avro 527");
        fighterList.add("Avro 523 Pike Zeppelin fighter");
        fighterList.add("Armstrong Whitworth F.K.9 & 10");
        fighterList.add("Armstrong Whitworth F.K.6 heavy fighter");
        fighterList.add("Anatra Anadis");
        fighterList.add("Albatros W.4 fighter floatplane");
        fighterList.add("Albatros D.IV");
        fighterList.add("Albatros D.III");
        fighterList.add("Albatros D.II");
        fighterList.add("Albatros D.I");
        fighterList.add("Airco DH.5");
        fighterList.add("Weymann W-1");
        fighterList.add("Vickers E.S.1");
        fighterList.add("Vickers F.B.9");
        fighterList.add("Vickers E.F.B.8 twin engine fighter");
        fighterList.add("Vickers E.F.B.7 twin engine fighter");
        fighterList.add("SPAD SA.1-4 & SG");
        fighterList.add("Sopwith 1½ Strutter");
        fighterList.add("Sopwith Baby floatplane fighter");
        fighterList.add("Sikorsky S-16");
        fighterList.add("Siemens-Schuckert E.I, E.II & E.III");
        fighterList.add("Schütte-Lanz D.II");
        fighterList.add("Schütte-Lanz D.I");
        fighterList.add("Royal Aircraft Factory S.E.4a");
        fighterList.add("Royal Aircraft Factory F.E.8");
        fighterList.add("Royal Aircraft Factory B.E.12 night fighter");
        fighterList.add("Ponnier M-1");
        fighterList.add("Pfalz E.II monoplane");
        fighterList.add("Pfalz E.I monoplane");
        fighterList.add("Nieuport 11 & 16");
        fighterList.add("Morane-Saulnier N");
        fighterList.add("Mann & Grimmer M.1 2 seat fighter");
        fighterList.add("LVG E.I");
        fighterList.add("Halberstadt D.II - D.V");
        fighterList.add("Halberstadt D.I");
        fighterList.add("Germania DB 2 seat fighter");
        fighterList.add("Fokker M.16/B.III");
        fighterList.add("Fokker K.I twin engine 2 seat fighter");
        fighterList.add("Fokker E.IV");
        fighterList.add("Fokker E.III");
        fighterList.add("Fokker E.II");
        fighterList.add("Fokker E.I");
        fighterList.add("Euler Versuchszweisitzer 2 seat fighter");
        fighterList.add("Euler Gelber Hund");
        fighterList.add("DFW Floh (Flea)");
        fighterList.add("Breguet BUC/BLC escort fighter");
        fighterList.add("Airco DH.2");
        fighterList.add("Airco DH.1");
        fighterList.add("AD Scout");
        fighterList.add("Vickers F.B.5");
        fighterList.add("Sopwith Schneider");
        fighterList.add("Sopwith Gunbus");
        fighterList.add("Royal Aircraft Factory S.E.4");
        fighterList.add("Pemberton-Billing P.B.9");
        fighterList.add("Nieuport 10");
        fighterList.add("Morane-Saulnier L/Pflaz E.III");
        fighterList.add("Caproni Ca.20");
        fighterList.add("Bristol Scout");

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

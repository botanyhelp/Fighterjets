package com.jimsuplee.fighterjets;

import com.jimsuplee.fighterjets.R;

import android.app.Activity;
//import android.content.Context;
import android.os.Bundle;
import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.AdapterView.OnItemClickListener;
//import android.widget.BaseAdapter;
//import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;

public class Pictures extends Activity {

	static int index = 0;
	String[] stringFighters = {
			//"uss_harry_s_truman_cvn75_in_drydock_2012",
            "a_18_hornet",
            "aidc_f_ck_1_ching_kuo",
            "atlas_cheetah",
            "british_aerospace_sea_harrier",
            "chengdu_j_10",
            "chengdu_j_20",
            "dassault_breguet_super__89tendard",
            "dassault_mirage_2000",
            "dassault_mirage_5___50",
            "dassault_mirage_f1",
            "dassault_mirage_iii",
            "dassault_rafale",
            "enaer_pantera",
            "eurofighter_typhoon",
            "f_4_phantom_ii",
            "FA-18_Hornet_VFA-41",
            "general_dynamics_f_16",
            "general_dynamics_f_16xl",
            "grumman_f_14_tomcat",
            "hal_advanced_medium_combat_aircraft",
            "hal_tejas",
            "hawker_hunter",
            "hesa_azarakhsh",
            "hesa_saeqeh",
            "hesa_shafaq",
            "kai_kf_x",
            "kai_t_50_golden_eagle",
            "lockheed_martin_f_22_raptor",
            "lockheed_martin_f_35_lightning_ii",
            "mcdonnell_douglas_av_8b_harrier_ii_plus",
            "mcdonnell_douglas_f_15_eagle",
            "mcdonnell_douglas_f_15e_strike_eagle",
            "mikoyan_gurevich_mig_21",
            "mikoyan_gurevich_mig_23",
            "mikoyan_gurevich_mig_25",
            "mikoyan_mig_29",
            "mikoyan_mig_31",
            "mikoyan_mig_35",
            "mitsubishi_1mf2",
            "mitsubishi_atd_x",
            "northrop_f_5",
            "Pakistan_Air_Force_Chengdu_JF-17_Gu",
            "panavia_tornado_adv",
            "Russian_Air_Force_Sukhoi_Su-34",
            "saab_jas_39_gripen",
            "shenyang_j_11",
            "shenyang_j_5",
            "shenyang_j_6",
            "shenyang_j_8___j_8ii",
            "sukhoi_pak_fa",
            "sukhoi_su_17_20___22",
            "sukhoi_su_27",
            "sukhoi_su_30",
            "sukhoi_su_33",
            "Sukhoi_Su-35S_in_2009",
            "sukhoi_su_47",
            "tuaf_tfx",
            "xian_jh_7"
	};
	Integer[] imageIDs = {
			//R.drawable.uss_harry_s_truman_cvn75_in_drydock_2012,
            R.drawable.a__hornet,
            R.drawable.aidc_f_ck__ching_kuo,
            R.drawable.atlas_cheetah,
            R.drawable.british_aerospace_sea_harrier,
            R.drawable.chengdu_j_ten,
            R.drawable.chengdu_j_twenty,
            R.drawable.dassault_breguet_super__tendard,
            R.drawable.dassault_mirage_twothousand,
            R.drawable.dassault_mirage_five___fifty,
            R.drawable.dassault_mirage_fone,
            R.drawable.dassault_mirage_iii,
            R.drawable.dassault_rafale,
            R.drawable.enaer_pantera,
            R.drawable.eurofighter_typhoon,
            R.drawable.f_four_phantom_ii,
            R.drawable.fa_eighteen_hornet_vfa_fortyone,
            R.drawable.general_dynamics_f_sixteen,
            R.drawable.general_dynamics_f_sixteenxl,
            R.drawable.grumman_f_fourteen_tomcat,
            R.drawable.hal_advanced_medium_combat_aircraft,
            R.drawable.hal_tejas,
            R.drawable.hawker_hunter,
            R.drawable.hesa_azarakhsh,
            R.drawable.hesa_saeqeh,
            R.drawable.hesa_shafaq,
            R.drawable.kai_kf_x,
            R.drawable.kai_t_fifty_golden_eagle,
            R.drawable.lockheed_martin_f_tt_raptor,
            R.drawable.lockheed_martin_f_tf_lightning_ii,
            R.drawable.mcdonnell_douglas_av_eightb_harrier_ii_plus,
            R.drawable.mcdonnell_douglas_f_fifteen_eagle,
            R.drawable.mcdonnell_douglas_f_fifteene_strike_eagle,
            R.drawable.mikoyan_gurevich_mig_twentyone,
            R.drawable.mikoyan_gurevich_mig_twentythree,
            R.drawable.mikoyan_gurevich_mig_twentyfive,
            R.drawable.mikoyan_mig_twentynine,
            R.drawable.mikoyan_mig_thirtyone,
            R.drawable.mikoyan_mig_thirtyfive,
            R.drawable.mitsubishi_onemftwo,
            R.drawable.mitsubishi_atd_x,
            R.drawable.northrop_f_five,
            R.drawable.pakistan_air_force_chengdu_jf_seventeen_gu,
            R.drawable.panavia_tornado_adv,
            R.drawable.russian_air_force_sukhoi_su_thirtyfour,
            R.drawable.saab_jas_thirtynine_gripen,
            R.drawable.shenyang_j_eleven,
            R.drawable.shenyang_j_five,
            R.drawable.shenyang_j_six,
            R.drawable.shenyang_j_eight___j_eightii,
            R.drawable.sukhoi_pak_fa,
            R.drawable.sukhoi_su_seventeentwentytwentytwo,
            R.drawable.sukhoi_su_twentyseven,
            R.drawable.sukhoi_su_thirty,
            R.drawable.sukhoi_su_thirtythree,
            R.drawable.sukhoi_su_thirtyfives,
            R.drawable.sukhoi_su_fortyseven,
            R.drawable.tuaf_tfx,
            R.drawable.xian_jh_seven
	};
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pictures);
		//ImageView iv = (ImageView) findViewById(R.id.image1);
		//iv.setImageResource(imageIDs[index]);
		//TextView tv = (TextView) findViewById(R.id.txt_Aircraftcarriername);
		//tv.setText(stringCarriers[index]);
		//stringCarriers/imageIDs
		com.jimsuplee.fighterjets.Pictures.index = 0;
		displayTextAndImage();
	}
	public void displayTextAndImage() {
		ImageView iv = (ImageView) findViewById(R.id.image1);
		iv.setImageResource(imageIDs[com.jimsuplee.fighterjets.Pictures.index]);
		TextView tv = (TextView) findViewById(R.id.txt_picture);
		String fighterText = stringFighters[com.jimsuplee.fighterjets.Pictures.index]+" ("+Integer.toString(com.jimsuplee.fighterjets.Pictures.index)+" of 57)";
		//tv.setText(stringCarriers[com.jimsuplee.fighterjets.Pictures.index]);
		tv.setText(fighterText);
	}
	public void onClickPicture(View view) {
		if(index<57) {
		    index+=1;
		}
		displayTextAndImage();
	}	
	public void onClickPictureback(View view) {
		if(index>0) {
			index-=1;
		}
		displayTextAndImage();
	}
}

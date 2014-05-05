package com.jimsuplee.fighterjets;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;

public class DBAdapter {
	static final String TAG = "FIGHTERJETS";
	
	static final String DATABASE_NAME = "fighter";
	static final String DATABASE_TABLE = "fighter";
	static final int DATABASE_VERSION = 1;
	
	//static final String fightername = "fightername";
	//static final String fighterdata = "fighterdata";
    static final String name = "name";
    static final String country = "country";
    static final String firstyear = "firstyear";
    static final String number = "number";
    static final String status = "status";
    static final String info = "info";

	static final String DATABASE_CREATE = "CREATE TABLE fighter (name text default null, country text default null, firstyear text default null, number text default null, status text default null, info text default null);";
	
	final Context context;

	DatabaseHelper DBHelper;
	SQLiteDatabase db;

	public DBAdapter(Context ctx) {
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}

	private static class DatabaseHelper extends SQLiteOpenHelper {
		DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			try {
				db.execSQL(DATABASE_CREATE);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			////////Log.w(TAG, "Upgrading database from version " + oldVersion + " to "+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS fighter");
			onCreate(db);
		}
	}
	
	public DBAdapter open() throws SQLException {
		db = DBHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		DBHelper.close();
	}
	public Cursor getByFighterName(String nameParam) throws SQLException {
		//Log.w(TAG, "In DBAdapter.getByFighterName("+nameParam+")");
		//String[] columns = new String[] {fightername, fighterdata};
		//We only need the fightername column to be returned, even though we search on fighterdata
		String[] columns = new String[] {name,country,firstyear,number,status,info};				
		String selection;
		//We assume that the fighterdataParam has ALREADY be pre-and-post-pended with "%" for LIKE sql:
	    //selection = "info LIKE ?";
		selection = "name = ?";
		String[] selectionArgs = new String[] { nameParam };
		//Log.w(TAG, "In DBAdapter.getByFighterName, about to dbquery("+selection+" "+selectionArgs[0]);
        Cursor mCursor = db.query(DATABASE_TABLE, columns, selection, selectionArgs, null, null, null);
		//Log.w(TAG, "In DBAdapter.getByFighterName(StringfighterdataParam), About to check if Cursor c is null");
		if (mCursor != null) {
            //Log.w(TAG,"In DBAdapter.getByFighterName(String fighterdataParam), c is NOT null, about to NOT c.moveToFirst()");
			//mCursor.moveToFirst();
			if(mCursor.moveToFirst()) {
				//Log.w(TAG,"In DBAdapter.getByFighterName(),mCursor.moveToFirst() is true");
			} else {
				//Log.w(TAG,"In DBAdapter.getByFighterName(),mCursor.moveToFirst() is NOT true");	
			}
		}
		//Log.w(TAG, "In DBAdapter.getByFighterName(String fighterdataParam), about to return cursor, c");
		return mCursor;
	}
	public Cursor getByCountry(String nameParam) throws SQLException {
		//Log.w(TAG, "In DBAdapter.getByCountry("+nameParam+")");
		//String[] columns = new String[] {fightername, fighterdata};
		//We only need the fightername column to be returned, even though we search on fighterdata
		//String[] columns = new String[] {name,country,firstyear,number,status,info};				
		String[] columns = new String[] {name};				
		String selection;
		//We assume that the fighterdataParam has ALREADY be pre-and-post-pended with "%" for LIKE sql:
	    //selection = "info LIKE ?";
		selection = "country = ?";
		String[] selectionArgs = new String[] { nameParam };
		//Log.w(TAG, "In DBAdapter.getByCountry, about to dbquery("+selection+" "+selectionArgs[0]);
        Cursor mCursor = db.query(DATABASE_TABLE, columns, selection, selectionArgs, null, null, null);
		//Log.w(TAG, "In DBAdapter.getByCountry(StringfighterdataParam), About to check if Cursor c is null");
		if (mCursor != null) {
            //Log.w(TAG,"In DBAdapter.getByCountry(String fighterdataParam), c is NOT null, about to NOT c.moveToFirst()");
			//mCursor.moveToFirst();
			if(mCursor.moveToFirst()) {
				//Log.w(TAG,"In DBAdapter.getByCountry(),mCursor.moveToFirst() is true");
			} else {
				//Log.w(TAG,"In DBAdapter.getByCountry(),mCursor.moveToFirst() is NOT true");	
			}
		}
		//Log.w(TAG, "In DBAdapter.getByCountry(String fighterdataParam), about to return cursor, c");
		return mCursor;
	}
	public Cursor getByStatus(String nameParam) throws SQLException {
		//Log.w(TAG, "In DBAdapter.getByCountry("+nameParam+")");
		//String[] columns = new String[] {fightername, fighterdata};
		//We only need the fightername column to be returned, even though we search on fighterdata
		//String[] columns = new String[] {name,country,firstyear,number,status,info};				
		String[] columns = new String[] {name};				
		String selection;
		//We assume that the fighterdataParam has ALREADY be pre-and-post-pended with "%" for LIKE sql:
	    //selection = "info LIKE ?";
		selection = "status = ?";
		String[] selectionArgs = new String[] { nameParam };
		//Log.w(TAG, "In DBAdapter.getByCountry, about to dbquery("+selection+" "+selectionArgs[0]);
        Cursor mCursor = db.query(DATABASE_TABLE, columns, selection, selectionArgs, null, null, null);
		//Log.w(TAG, "In DBAdapter.getByCountry(StringfighterdataParam), About to check if Cursor c is null");
		if (mCursor != null) {
            //Log.w(TAG,"In DBAdapter.getByCountry(String fighterdataParam), c is NOT null, about to NOT c.moveToFirst()");
			//mCursor.moveToFirst();
			if(mCursor.moveToFirst()) {
				//Log.w(TAG,"In DBAdapter.getByCountry(),mCursor.moveToFirst() is true");
			} else {
				//Log.w(TAG,"In DBAdapter.getByCountry(),mCursor.moveToFirst() is NOT true");	
			}
		}
		//Log.w(TAG, "In DBAdapter.getByCountry(String fighterdataParam), about to return cursor, c");
		return mCursor;
	}
	public Cursor getByInfo(String infoParam) throws SQLException {
		//String[] columns = new String[] {name,country,firstyear,number,status,info};				
		String[] columns = new String[] {name};				
		String selection;
		selection = "info LIKE ?";
		String[] infoArray = infoParam.split("\\s*,\\s*");
	    String[] selectionArgs = new String[infoArray.length];
		if(infoArray.length > 0) {
				for(int i=0; i<infoArray.length;i++) {
					if(i>0) {
						selection += " AND info LIKE ?";
						//Log.w(TAG, "In DBAdapter.getByInfo, AND info LIKE");
					}
					selectionArgs[i] = "%"+infoArray[i]+"%";
					//Log.w(TAG, "In DBAdapter.getByInfo, selectionArgs+="+selectionArgs[i]);
				}
			
		} else {
			;
		}
		//selection += " LIMIT 10";
		//Log.w(TAG, "In DBAdapter.getByInfo, about to dbquery("+selection+" "+selectionArgs[0]);
        Cursor mCursor = db.query(DATABASE_TABLE, columns, selection, selectionArgs, null, null, null);
		//Log.w(TAG, "In DBAdapter.getByInfo(StringfighterdataParam), About to check if Cursor c is null");
		if (mCursor != null) {
            //Log.w(TAG,"In DBAdapter.getByInfo(String fighterdataParam), c is NOT null, about to NOT c.moveToFirst()");
			if(mCursor.moveToFirst()) {
				//Log.w(TAG,"In DBAdapter.getByInfo(),mCursor.moveToFirst() is true");
			} else {
				//Log.w(TAG,"In DBAdapter.getByInfo(),mCursor.moveToFirst() is NOT true");	
			}
		}
		//Log.w(TAG, "In DBAdapter.getByInfo(String fighterdataParam), about to return cursor, c");
		return mCursor;
	}
	//THIS WORKS but fails on the LIMIT 10 part, it seems like a bug but even the only-10 problem 
	// is a drag.  Instead we want to return the list of fighters (only the figher name) that match, 
	// and let them click on the fighter they want, just like they do on the main Fighter.java activity.
	// See above for getByInfo() which returns a list of names, from which the caller can then proceed 
	// to make a list of fighters to choose from. 
	/**public Cursor getByInfo(String infoParam) throws SQLException {
		////Log.w(TAG, "In DBAdapter.getByInfo("+fighterdataParam+")");
		//String[] columns = new String[] {fightername, fighterdata};
		//We only need the fightername column to be returned, even though we search on fighterdata
		
		String[] columns = new String[] {name,country,firstyear,number,status,info};				
		String selection;
	    //selection = "info LIKE ?";
		//NO--NEED TO ADD LIMIT LATERselection = "info LIKE ? LIMIT 10";
		selection = "info LIKE ?";
		//String[] selectionArgs = new String[] { infoParam };
	    //String[] selectionArgs = new String[]{};
		//List<String> elephantList = Arrays.asList(str.split(","));
		//String[] infoArray = infoParam.split(",");
	    //We want to split on whitespace...or perhaps we want by comma, so that people can use multi-word
	    //String[] infoArray = infoParam.split(" ");
		//this will additionally remove surrounding whitespace:
		String[] infoArray = infoParam.split("\\s*,\\s*");
	    String[] selectionArgs = new String[infoArray.length];
		if(infoArray.length > 0) {
				for(int i=0; i<infoArray.length;i++) {
					if(i>0) {
						//we don't add this if i==0
						selection += " AND info LIKE ?";
						////Log.w(TAG, "In DBAdapter.getByInfo, selection+="+selection);
						//Log.w(TAG, "In DBAdapter.getByInfo, AND info LIKE");
					}
					//we probably can just use infoArray as is for 
					// the role of the String[] selectionArgs...
					// but on second thought, we need to put % around it:
					selectionArgs[i] = "%"+infoArray[i]+"%";
					//Log.w(TAG, "In DBAdapter.getByInfo, selectionArgs+="+selectionArgs[i]);
				}
			
		} else {
			;
		}
		//We assume that the fighterdataParam has ALREADY be pre-and-post-pended with "%" for LIKE sql:
		//NO...this alone, won't stop failure:selection += " LIMIT 10";
		selection += " LIMIT 10";
		//Log.w(TAG, "In DBAdapter.getByInfo, about to dbquery("+selection+" "+selectionArgs[0]);
        Cursor mCursor = db.query(DATABASE_TABLE, columns, selection, selectionArgs, null, null, null);
		//Log.w(TAG, "In DBAdapter.getByInfo(StringfighterdataParam), About to check if Cursor c is null");
		if (mCursor != null) {
            //Log.w(TAG,"In DBAdapter.getByInfo(String fighterdataParam), c is NOT null, about to NOT c.moveToFirst()");
			//mCursor.moveToFirst();
			if(mCursor.moveToFirst()) {
				//Log.w(TAG,"In DBAdapter.getByInfo(),mCursor.moveToFirst() is true");
			} else {
				//Log.w(TAG,"In DBAdapter.getByInfo(),mCursor.moveToFirst() is NOT true");	
			}
		}
		//Log.w(TAG, "In DBAdapter.getByInfo(String fighterdataParam), about to return cursor, c");
		return mCursor;
	}
	*/
}

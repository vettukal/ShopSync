package com.vishu;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class VishuActivity extends Activity {
	
	public static final Uri CONTENT_URI = Uri
			.parse("content://org.openintents.shopping/lists");
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Cursor cursor = getContentResolver().query(CONTENT_URI, null, null, null, null);
        cursor.moveToFirst();
        Log.d("vincent","Count of lists: "+cursor.getCount());
        Log.d("vincent","Number of columns: "+cursor.getColumnCount());
        Log.d("vincent","_id is: "+cursor.getString(0));
        Log.d("vincent","1 column is: "+cursor.getString(1));
        Log.d("vincent","3 column is: "+cursor.getString(3));
        Log.d("vincent","1 column name is: "+cursor.getColumnName(1));
        Log.d("vincent","2 column name is: "+cursor.getColumnName(2));
        Log.d("vincent","3 column name is: "+cursor.getColumnName(3));
        Log.d("vincent","4 column name is: "+cursor.getColumnName(4));
        Log.d("vincent","5 column name is: "+cursor.getColumnName(5));
        //sync();
    }
    
    void sync() {
    	Log.d("vincent", "inside the sync");
    	Log.d("vincent", "the math random is: "+Math.random() );
    	if(Math.random() > 0.30 ) {
    		Alarm al = new Alarm();
    		al.SetAlarm(this);
    		Log.d("vincent", "the alarm is called");
    	}
    }
}
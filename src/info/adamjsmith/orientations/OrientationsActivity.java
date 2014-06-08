package info.adamjsmith.orientations;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OrientationsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientations);
        Log.d("StateInfo", "onCreate");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	CreateMenu(menu);
    	return true;
    }
    
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) {
    	return MenuChoice(item);
    }
    
    private void CreateMenu(Menu menu) {
    	MenuItem mnu1 = menu.add(0,0,0,"Item 1");
    	{
    		mnu1.setIcon(R.drawable.ic_launcher);
    		mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
    	}
    }
    
    private boolean MenuChoice(MenuItem item) {
    	switch (item.getItemId()) {
    	case 0:
    		Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
    		return true;
    	}
    	return false;
    }
    
    @Override
    public void onStart() {
    	Log.d("StateInfo", "onStart");
    	super.onStart();
    }
    
    @Override
    public void onResume() {
    	Log.d("StateInfo", "onResume");
    	super.onResume();
    }
    
    @Override
    public void onPause() {
    	Log.d("StateInfo", "onPause");
    	super.onPause();
    }
    
    @Override
    public void onStop() {
    	Log.d("StateInfo", "onStop");
    	super.onStop();
    }
    
    @Override
    public void onDestroy() {
    	Log.d("StateInfo", "onDestroy");
    	super.onDestroy();
    }
    
    @Override
    public void onRestart() {
    	Log.d("StateInfo", "onRestart");
    	super.onRestart();
    }
    
}

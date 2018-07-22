package com.oupa.anotherheartratemonitor;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener {

	private Button mBtnPublishAction;
	private ImageView mImgVwLaunchBeatMonitor;
	private int INDEX=0;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		initializeLayout();



	}


	private void initializeLayout() {
		mBtnPublishAction=(Button)findViewById(R.id.btnPublishAction);
		mBtnPublishAction.setOnClickListener(this);




	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.btnPublishAction){
			INDEX=0;
			startActivity(new Intent(MainActivity.this,HeartRateMonitor.class));
		}
		
	}
	

	
}

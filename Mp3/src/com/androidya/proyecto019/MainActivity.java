package com.androidya.proyecto019;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void presionGato(View v) {
		MediaPlayer mp = MediaPlayer.create(this, R.raw.gato);
		mp.start();
	}

	public void presionLeon(View v) {
		MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
		mp.start();
	}
}

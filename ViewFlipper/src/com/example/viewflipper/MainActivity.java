package com.example.viewflipper;

import android.support.v7.app.ActionBarActivity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends ActionBarActivity {

	private ViewFlipper flipper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		flipper=(ViewFlipper) findViewById(R.id.flipper);
		flipper.addView(getImageView(R.drawable.pic1));
		flipper.addView(getImageView(R.drawable.pic2));
		flipper.addView(getImageView(R.drawable.pic3));
		flipper.addView(getImageView(R.drawable.pic4));	
		flipper.setInAnimation(this, R.anim.left_in);
		flipper.setOutAnimation(this, R.anim.left_out);
		flipper.setFlipInterval(4000);
		flipper.startFlipping();
	}

	private ImageView getImageView(int resId){
		ImageView imageView=new ImageView(this);
		imageView.setBackgroundResource(resId);
		return imageView;
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
}

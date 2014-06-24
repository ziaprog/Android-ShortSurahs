package com.example.shortsurahs;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class selected extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selected_activity);

		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    String value = extras.getString("key");
		    TextView tv=(TextView)findViewById(R.id.textView1);			
			tv.setText(value);
			
			ImageView iv=(ImageView)findViewById(R.id.imageView1);
			int imgid = getResources().getIdentifier("com.example.shortsurahs:drawable/" + value, null, null);
			iv.setImageResource(imgid);
		}
		
		
	}

}

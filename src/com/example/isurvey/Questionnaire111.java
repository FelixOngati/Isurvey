package com.example.isurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Questionnaire111 extends Activity implements OnClickListener{
	Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire111);
		
		button=(Button) findViewById(R.id.btn_next11);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		Intent i = new Intent(this, Questionnaire1112.class);
		
	}

}

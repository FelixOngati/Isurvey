package com.example.isurvey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Questionnaire1112 extends Activity implements OnClickListener{
	Button button;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire112);
		
		button=(Button) findViewById(R.id.btn_next13);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		//Intent i = new Intent(this,)
		
	}

}

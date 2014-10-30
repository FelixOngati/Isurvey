package com.example.isurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Questionnaire19 extends ActionBarActivity implements OnClickListener{
	private Button next;
	private Spinner consumedSpinner;
	private String whoConsumed;
	private int goatAmount, goatConsused, goatSold, goatPrice;
	private int sheepAmount, sheepConsused, sheepSold, shepPrice;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire19);
		
		next = (Button) findViewById(R.id.btn_next12);
		next.setOnClickListener(this);
		
		consumedSpinner = (Spinner) findViewById(R.id.sp_qst199);
		
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> consumed = ArrayAdapter
				.createFromResource(this, R.array.milk_consumers, android.R.layout.simple_spinner_item);
		consumed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		consumedSpinner.setAdapter(consumed);
		
	}

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Questionnaire115.class);
		startActivity(i);
		
	}
	@Override
	protected void onResume() {
		consumedSpinner.setSelection(0);
		super.onResume();
	}


}

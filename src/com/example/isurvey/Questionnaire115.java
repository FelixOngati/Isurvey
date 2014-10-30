package com.example.isurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Questionnaire115 extends ActionBarActivity implements
		OnClickListener {
	private Button next;
	private Spinner cropSpinner;
	private Boolean growCrops;
	private int period;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire115);

		next = (Button) findViewById(R.id.btn_next15);
		next.setOnClickListener(this);

		cropSpinner = (Spinner) findViewById(R.id.sp_qst1151);
		
		ArrayAdapter<CharSequence> cropAdapter = ArrayAdapter
				.createFromResource(this, R.array.yes_no_opt,
						android.R.layout.simple_spinner_item);
		cropAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		

		cropSpinner.setAdapter(cropAdapter);
		cropSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				if (cropSpinner.getSelectedItem().toString()
						.equalsIgnoreCase("No")) {
					Intent i = new Intent(Questionnaire115.this, FakeActivity.class);
					startActivity(i);

				} else {
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});

	}
	
	@Override
	protected void onResume() {
		cropSpinner.setSelection(0);
		super.onResume();
	}

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Questionnaire116.class);
		startActivity(i);

	}

}

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

public class Questionnaire18 extends ActionBarActivity implements
		OnClickListener {
	private Button next;
	private Spinner milkedSpinner;
	private Boolean milked;
	private int cowAmount, cowConsused, cowSold, cowPrice;
	private int camelAmount, camelConsused, camelSold, camelPrice;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire18);

		next = (Button) findViewById(R.id.btn_next11);
		next.setOnClickListener(this);

		milkedSpinner = (Spinner) findViewById(R.id.sp_qst181);

		// Create an ArrayAdapter using the string array and a default spinner
		// layout
		ArrayAdapter<CharSequence> milkedAdapter = ArrayAdapter
				.createFromResource(this, R.array.yes_no_opt,
						android.R.layout.simple_spinner_item);
		milkedAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		milkedSpinner.setAdapter(milkedAdapter);
		milkedSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				if (milkedSpinner.getSelectedItem().toString()
						.equalsIgnoreCase("No")) {
					Intent i = new Intent(Questionnaire18.this, FakeActivity.class);
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
	public void onClick(View v) {
		Intent i = new Intent(this, Questionnaire19.class);
		startActivity(i);

	}
	@Override
	protected void onResume() {
		milkedSpinner.setSelection(0);
		super.onResume();
	}

}

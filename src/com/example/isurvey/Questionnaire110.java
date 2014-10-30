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

public class Questionnaire110 extends ActionBarActivity implements
		OnClickListener {
	private Button next;
	private Spinner stocksSpinner, sourceSpinner;
	private Boolean haveStocks;
	private int period;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire110);

		next = (Button) findViewById(R.id.btn_next13);
		next.setOnClickListener(this);

		stocksSpinner = (Spinner) findViewById(R.id.sp_qst1101);
		sourceSpinner = (Spinner) findViewById(R.id.sp_qst1102);
		
		ArrayAdapter<CharSequence> milkedAdapter = ArrayAdapter
				.createFromResource(this, R.array.yes_no_opt,
						android.R.layout.simple_spinner_item);
		milkedAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		ArrayAdapter<CharSequence> sourceAdapter = ArrayAdapter
				.createFromResource(this, R.array.stock_sources,
						android.R.layout.simple_spinner_item);
		sourceAdapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		stocksSpinner.setAdapter(milkedAdapter);
		sourceSpinner.setAdapter(sourceAdapter);
		stocksSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				if (stocksSpinner.getSelectedItem().toString()
						.equalsIgnoreCase("No")) {
					Intent i = new Intent(Questionnaire110.this, FakeActivity.class);
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
		stocksSpinner.setSelection(0);
		super.onResume();
	}

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Questionnaire111.class);
		startActivity(i);

	}

}

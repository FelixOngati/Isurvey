package com.example.isurvey;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Questionnaire13 extends ActionBarActivity implements
		OnItemSelectedListener, OnClickListener {
	Spinner pos, livestock_spinner, cod, reasonForLossSpinner2;
	private String loss_reason, market;
	private Button next;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire13);
		next = (Button) findViewById(R.id.btn_next6);
		next.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		final String[] livestock_options = { "Yes", "No" };
		//getMenuInflater().inflate(R.menu.livestock_general, menu);
		livestock_spinner = (Spinner) findViewById(R.id.livestock_sp);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				Questionnaire13.this, android.R.layout.simple_spinner_item,
				livestock_options);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		livestock_spinner.setAdapter(adapter);
		livestock_spinner.setOnItemSelectedListener(this);

		pos = (Spinner) findViewById(R.id.pos_sp);
		ArrayAdapter<CharSequence> point_of_sale = ArrayAdapter
				.createFromResource(this, R.array.point_of_sale, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		point_of_sale.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		pos.setAdapter(point_of_sale);
		pos.setOnItemSelectedListener(this);

		cod = (Spinner) findViewById(R.id.reason_for_death_sp);
		ArrayAdapter<CharSequence> cause_of_death = ArrayAdapter
				.createFromResource(this, R.array.reason_for_loss, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cause_of_death.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cod.setAdapter(cause_of_death);

		cod.setOnItemSelectedListener(this);

		final String[] reasonForSal2 = { "Disease", "Startvation",
				"Dehydration", "Conflit", "Predation", "Slaugther", "Other" };
		reasonForLossSpinner2 = (Spinner) findViewById(R.id.reason_for_sale_sp2);
		ArrayAdapter<String> reasonForSaleAdapter2 = new ArrayAdapter<String>(
				Questionnaire13.this, android.R.layout.simple_spinner_item,
				reasonForSal2);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		reasonForLossSpinner2.setAdapter(reasonForSaleAdapter2);
		reasonForLossSpinner2.setOnItemSelectedListener(this);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View v, int position,
			long id) {

		switch (position) {
		case 0:
			// Whatever you want to happen when the first item gets selected
			break;
		case 1:
			// Whatever you want to happen when the second item gets selected
			break;
		}
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
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		
		Intent i = new Intent(this, Questionnaire14.class);
		startActivity(i);
			}
	
}

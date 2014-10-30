package com.example.isurvey;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Questionnaire17 extends Activity implements OnClickListener{
	private Button next;
	private Spinner pos, cod;
	private String loss_reason, market;
	private int owned_today, born, purchased, sold, died, price;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire17);
		
		next = (Button) findViewById(R.id.btn_next5);
		next.setOnClickListener(this);
		
		pos = (Spinner) findViewById(R.id.sp_qst176);
		cod = (Spinner) findViewById(R.id.sp_qst178);
		
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> point_of_sale = ArrayAdapter
				.createFromResource(this, R.array.point_of_sale, android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> cause_of_death = ArrayAdapter
				.createFromResource(this, R.array.reason_for_loss, android.R.layout.simple_spinner_item);
		point_of_sale.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cause_of_death.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		pos.setAdapter(point_of_sale);
		cod.setAdapter(cause_of_death);
		
		pos.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				market = pos.getSelectedItem().toString();
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		cod.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				loss_reason = cod.getSelectedItem().toString();
				if(loss_reason.equals("Other")){
					AlertDialog.Builder alert = new AlertDialog.Builder(Questionnaire17.this);

					alert.setTitle("Other");
					alert.setMessage("Specify");

					// Set an EditText view to get user input 
					final EditText input = new EditText(Questionnaire17.this);
					input.setInputType(InputType.TYPE_CLASS_TEXT);
					alert.setView(input);

					alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
					  loss_reason = input.getText().toString();
					  // Do something with value!
					  }
					});

					alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					  public void onClick(DialogInterface dialog, int whichButton) {
					    // Canceled.
					  }
					});

					alert.show();				
				}else {
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
		Intent i = new Intent(this, Questionnaire18.class);
		startActivity(i);
		
	}

}

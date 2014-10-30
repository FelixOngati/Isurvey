package com.example.isurvey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Questionnaire117 extends ActionBarActivity implements
		OnClickListener {
	private Button next;
	private Boolean growCrops;
	private int period;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire117);

		next = (Button) findViewById(R.id.btn_next17);
		next.setOnClickListener(this);



	}

	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Questionnaire118.class);
		startActivity(i);

	}

}

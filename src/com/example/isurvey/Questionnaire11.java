package com.example.isurvey;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

public class Questionnaire11 extends ActionBarActivity implements OnClickListener{
	
	Spinner county, sub_county,sentinel;
	String selectedCounty, date_of_interview;
	private Button next;
	DatePicker dpDateOfInterview;
	TextView tvdate;
	int dday, dmonth, dyear;
	private int year,day,month;
	
	static final int DOB_DATE_DIALOG_ID = 101;
	private static final int DATE_DIALOG_ID =100;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnaire11);
		
		addDateListener();
		// setCurrentDate();
		setDate();
		
		//setup button to listen to clicks
		next = (Button) findViewById(R.id.btn_next1);
		next.setOnClickListener(this);	
		
		
		county = (Spinner) findViewById(R.id.sp_county);
		sub_county = (Spinner) findViewById(R.id.sp_subcounty);
		sentinel = (Spinner) findViewById(R.id.sp_sentinelsite);
		
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> countyAdapter = ArrayAdapter
				.createFromResource(this, R.array.county_list, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence> kituiSubCountyAdapter = ArrayAdapter
				.createFromResource(this, R.array.kitui_subcounty, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence> tanaRiverSubCountyAdapter = ArrayAdapter
				.createFromResource(this, R.array.tanariver_subcounty, android.R.layout.simple_spinner_item);
		final ArrayAdapter<CharSequence> turkanaSubCountyAdapter = ArrayAdapter
				.createFromResource(this, R.array.turkana_subcounty, android.R.layout.simple_spinner_item);
		
		
		final ArrayAdapter<CharSequence>	ikuthaAdapter = ArrayAdapter
				.createFromResource(this, R.array.stikutha, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	kabatiAdapter = ArrayAdapter
				.createFromResource(this, R.array.stkabati, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	chuluniAdapter = ArrayAdapter
				.createFromResource(this, R.array.stchuluni, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	mwitikaAdapter = ArrayAdapter
				.createFromResource(this, R.array.stmwitika, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	mutituAdapter = ArrayAdapter
				.createFromResource(this, R.array.stmutitu, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	yattaAdapter = ArrayAdapter
				.createFromResource(this, R.array.styattakitui, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	centralAdapter = ArrayAdapter
				.createFromResource(this, R.array.stcentralkitui, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	mutomoAdapter = ArrayAdapter
				.createFromResource(this, R.array.stmutomo, android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence>	garsenAdapter = ArrayAdapter
		.createFromResource(this, R.array.stgarsen, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	bangaleAdapter = ArrayAdapter
				.createFromResource(this, R.array.stikutha, android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence>	buraAdapter = ArrayAdapter
		.createFromResource(this, R.array.stbura, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	kipiniAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkipini, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	wenjeAdapter = ArrayAdapter
		.createFromResource(this, R.array.stwenje, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	galoleAdapter = ArrayAdapter
		.createFromResource(this, R.array.stgalole, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	madogoAdapter = ArrayAdapter
		.createFromResource(this, R.array.stmadogo, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	turkwelAdapter = ArrayAdapter
		.createFromResource(this, R.array.stturkwel, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	kibishAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkibish, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	kaalingAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkaaling, android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence>	kalokolAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkalokol, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	kainukAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkainuk, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	kakumaAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkakuma, android.R.layout.simple_spinner_item);
		

		final ArrayAdapter<CharSequence>	katiluAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkatilu, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	kerioAdapter = ArrayAdapter
		.createFromResource(this, R.array.stkerio, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	lapurAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlapur, android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence>	loimaAdapter = ArrayAdapter
		.createFromResource(this, R.array.stloima, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	lokicharAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlokichar, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	lokichogioAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlokichogio, android.R.layout.simple_spinner_item);

		final ArrayAdapter<CharSequence>	lokitaungAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlokitaung, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	lokoriAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlokori, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	lomeloAdapter = ArrayAdapter
		.createFromResource(this, R.array.stlomelo, android.R.layout.simple_spinner_item);
		
		final ArrayAdapter<CharSequence>	oropoiAdapter = ArrayAdapter
		.createFromResource(this, R.array.storopoi, android.R.layout.simple_spinner_item);
		
		//specify the layout to use when a list of choices appears
		countyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		kituiSubCountyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		tanaRiverSubCountyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		turkanaSubCountyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		//apply the adapter to the spinner
		county.setAdapter(countyAdapter);
		county.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				county.getChildAt(0).setBackgroundColor(Color.WHITE);
				selectedCounty = county.getSelectedItem().toString();
				switch (selectedCounty) {
				case "Kitui":		
					sub_county.setAdapter(kituiSubCountyAdapter);
					//String selectedSubcounty1 = sub_county.getSelectedItem().toString();
					sentinelAssign1(kituiSubCountyAdapter);
					break;
				case "Tana River":
					sub_county.setAdapter(tanaRiverSubCountyAdapter);
					//String selectedSubcounty2 = sub_county.getSelectedItem().toString();
					sentinelAssign1(tanaRiverSubCountyAdapter);
					break;
				case "Turkana":
					sub_county.setAdapter(turkanaSubCountyAdapter);
					//String selectedSubcounty3 = sub_county.getSelectedItem().toString();
					sentinelAssign1(turkanaSubCountyAdapter);

				default:
					break;
				}
				//sub_county.getChildAt(0).setBackgroundColor(Color.WHITE);
								
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}

			private void sentinelAssign1(
					ArrayAdapter<CharSequence> kituiSubCountyAdapter) {
				sub_county.setAdapter(kituiSubCountyAdapter);
				sub_county.setOnItemSelectedListener(new OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						String selectedSubcounty = sub_county.getSelectedItem().toString();
						switch (selectedSubcounty) {
						case "Ikutha":
							ikuthaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(ikuthaAdapter);
							break;
						case "Kabati":					
							kabatiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kabatiAdapter);
							break;
						case "Chuluni":					
							chuluniAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(chuluniAdapter);
						case "Mwitika":					
							mwitikaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(mwitikaAdapter);
							break;
						case "Mutitu":					
							mutituAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(mutituAdapter);
							break;
						case "Yatta Kitui":					
							yattaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(yattaAdapter);
							break;
						case "Central Kitui":					
							centralAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(centralAdapter);
							break;
						case "Mutomo":					
							mutomoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(mutomoAdapter);
							break;
						case "Garsen":
							garsenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(garsenAdapter);
							break;
						case "Bangale":							
							bangaleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(bangaleAdapter);
							break;
						case "Bura":
							buraAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(buraAdapter);
							break;
						case "Kipini":
							kipiniAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kipiniAdapter);
							break;
						case "Wenje":
							wenjeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(wenjeAdapter);
							break;
						case "Galole":
							galoleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(galoleAdapter);
							break;
						case "Madogo":
							madogoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(madogoAdapter);
							break;
						case "Turkwel":
							turkwelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(turkwelAdapter);
							break;
						case "Kibish":
							kibishAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kibishAdapter);
							break;
						case "Kaaling":
							kaalingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kaalingAdapter);
							break;
						case "Kalokol":
							kalokolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kalokolAdapter);
							break;
						case "Kainuk":
							kainukAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kainukAdapter);
							break;
						case "Kakuma":
							kakumaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kakumaAdapter);
							break;
						case "Katilu":
							katiluAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(katiluAdapter);
							break;
						case "Kerio":
							kerioAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(kerioAdapter);
							break;
						case "Lapur":
							lapurAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lapurAdapter);
							break;
						case "Loima":
							loimaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(loimaAdapter);
							break;
						case "Lokichar":
							lokicharAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lokicharAdapter);
							break;
						case "Lokichogio":
							lokichogioAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lokichogioAdapter);
							break;
						case "Lokitaung":
							lokitaungAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lokitaungAdapter);
							break;
						case "Lokori":
							lokoriAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lokoriAdapter);
							break;
						case "Lomelo":
							lomeloAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(lomeloAdapter);
							break;
						case "Oropoi":
							oropoiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
							sentinel.setAdapter(oropoiAdapter);
							break;

							


						default:
							break;
						}

				
			}
					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}
			
		});

	}
		});

  }
	
	private void setDate() {
		// TODO Auto-generated method stub
		tvdate = (TextView) findViewById(R.id.tv_date);
		dpDateOfInterview = (DatePicker) findViewById(R.id.dp_date);
		final Calendar calendar = Calendar.getInstance();

		dyear = calendar.get(Calendar.YEAR);
		dmonth = calendar.get(Calendar.MONTH);
		dday = calendar.get(Calendar.DAY_OF_MONTH);

		// set current date into textview
		tvdate.setText(new StringBuilder().append(dyear).append("-")
				.append(dmonth + 1).append("-").append(dday));

		// set current date into Date Picker
		dpDateOfInterview.init(dyear, dmonth, dday, null);

		// date_of_birth=tvDOB.getText().toString();
	}
	
	private void addDateListener() {
		Button btnDOB = (Button) findViewById(R.id.btn_date);

		btnDOB.setOnClickListener(new OnClickListener() {

		
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {

				showDialog(DOB_DATE_DIALOG_ID);

			}

		});

	}
	
	@Override
	public void onClick(View v) {
		
		Intent i = new Intent(this, Questionnaire12.class);
		startActivity(i);
			}
	
	@Override
	protected Dialog onCreateDialog(int id) {

		switch (id) {
		case DATE_DIALOG_ID:
			// set date picker as current date
			return new DatePickerDialog(this, datePickerListener, year, month,
					day);
		case DOB_DATE_DIALOG_ID:
			return new DatePickerDialog(this, dDatePickerListener, dyear,
					dmonth, dday);
		}
		return null;
	}
	
	private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			year = selectedYear;
			month = selectedMonth;
			day = selectedDay;

			// set selected date into Text View
			tvdate.setText(new StringBuilder().append("Date today is : ")
					.append(year).append("-").append(month + 1).append("-")
					.append(day));

			// set selected date into Date Picker
			dpDateOfInterview.init(dyear, dmonth, dday, null);

		}
	};
	
	private DatePickerDialog.OnDateSetListener dDatePickerListener = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			dyear = selectedYear;
			dmonth = selectedMonth;
			dday = selectedDay;

			// set selected date into Text View

			tvdate.setText(new StringBuilder().append(dyear).append("-")
					.append(dmonth + 1).append("-").append(dday));
			// tvDOB = (TextView) findViewById(R.id.tv_dob);

			date_of_interview= tvdate.getText().toString();

		}
	};


}
		

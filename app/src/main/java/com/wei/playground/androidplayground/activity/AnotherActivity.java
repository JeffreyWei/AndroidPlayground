package com.wei.playground.androidplayground.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.wei.playground.androidplayground.R;

public class AnotherActivity extends AppCompatActivity {
	@BindView(R.id.showmsgtext)
	TextView textView;
//	@BindView(R.id.showmsgbtn)
//	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		Intent intent = getIntent();
		String msg = intent.getStringExtra("MSG");
		ButterKnife.bind(this);
		Log.d("AnotherActivity",msg);
		textView.setText(msg);
//		button.setText(msg);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "msg", Snackbar.LENGTH_LONG)
						.setAction("msg1", null).show();
			}
		});
	}

}

package com.zsl.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.zsl.customview.view.CustomView;

public class MainActivity extends AppCompatActivity {

	LinearLayout ll_showview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

//		initView();


	}

	private void initView() {
		ll_showview= (LinearLayout) findViewById(R.id.main_ll_showview);

		ll_showview.addView(new CustomView(this));

	}


}

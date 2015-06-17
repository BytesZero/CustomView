package com.zsl.customview;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.zsl.customview.view.CustomView;


public class MainActivity extends AppCompatActivity {

	LinearLayout ll_showview;

	CustomView cv_customview;

	Handler handler;

	int radiu=200;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();

		handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				if (radiu>50){
					radiu-=10;
				}else{
					radiu=200;
				}
				cv_customview.setRadiu(radiu);
				handler.sendEmptyMessageDelayed(1,300);

			}
		};

		handler.obtainMessage().sendToTarget();


	}

	private void initView() {
		ll_showview = (LinearLayout) findViewById(R.id.main_ll_showview);
		cv_customview = (CustomView) findViewById(R.id.main_cv_customview);


	}


}

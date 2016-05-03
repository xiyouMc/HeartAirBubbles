package com.lgl.heartfaom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btn_start;
	// 心型气泡
	private PeriscopeLayout periscopeLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始化
		periscopeLayout = (PeriscopeLayout) findViewById(R.id.periscope);

		btn_start = (Button) findViewById(R.id.btn_start);
		btn_start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//调用添加泡泡的方法
				periscopeLayout.addHeart();
			}
		});
	}
}

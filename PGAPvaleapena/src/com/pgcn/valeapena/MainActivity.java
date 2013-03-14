package com.pgcn.valeapena;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import com.pgcn.valeapena.R;

public class MainActivity extends DroidGap {

	public MyClass mc;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.init();

		mc = new MyClass(this, appView);
		appView.addJavascriptInterface(mc, "MyCls");

		super.loadUrl("file:///android_asset/www/index.html");
	}
}

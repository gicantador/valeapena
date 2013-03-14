package com.pgcn.pgapcontaconta;

import org.apache.cordova.DroidGap;
import org.apache.cordova.api.LOG;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.WebView;
import com.pgcn.valeapena.R;

public class MyClass {
	private WebView mAppView;
	private DroidGap mGap;

	public MyClass(DroidGap gap, WebView view) {
		mAppView = view;
		mGap = gap;
	}

	public String getTelephoneNumber() {
		TelephonyManager tm = (TelephonyManager) mGap.getSystemService(Context.TELEPHONY_SERVICE);
		String number = tm.getLine1Number();
		LOG.d("CONTACONTA", "Dentro do java!");

		return number;
	}
}

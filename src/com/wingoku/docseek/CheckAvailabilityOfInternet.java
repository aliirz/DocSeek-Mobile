package com.wingoku.docseek;

import java.io.IOException;
import java.net.URLConnection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class CheckAvailabilityOfInternet {

	public boolean checkAvailabilityOfInternet(Context con)
	{
		ConnectivityManager man = (ConnectivityManager) con.getSystemService(Context.CONNECTIVITY_SERVICE); // connectivity manager class gives us access to all the
		// internet,bluetooth,wifi etc methods
		
		NetworkInfo wifiInfo = man.getNetworkInfo(ConnectivityManager.TYPE_WIFI); // getting info about wifi.

		NetworkInfo mobileInternetInfo = man.getNetworkInfo(ConnectivityManager.TYPE_MOBILE); // getting info about Mobile internet
		
			if(wifiInfo.getState() == NetworkInfo.State.CONNECTED || mobileInternetInfo.getState() == NetworkInfo.State.CONNECTED)
				return true;


		return false;
	}
}

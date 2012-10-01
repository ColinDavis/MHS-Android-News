package com.mhsjava.android.MHSNews;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LaunchMenu extends Activity {
	
	//Test Commit Test Colin

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_launch_menu, menu);
        return true;
    }
}

package com.android.androiduitableview.library.activity;


import android.app.Activity;
import android.os.Bundle;

import com.android.androiduitableview.activity.R;
import com.android.androiduitableview.library.widget.UITableView;

public abstract class UITableViewActivity extends Activity {

	private UITableView mTableView;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	     setContentView(R.layout.uitableview_activity);
	     mTableView = (UITableView) findViewById(R.id.tableView);
	     populateList();
	     mTableView.commit();
	}
	
	protected UITableView getUITableView() {
		return mTableView;
	}
	
	protected abstract void populateList();
	
}

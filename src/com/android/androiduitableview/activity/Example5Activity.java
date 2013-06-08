package com.android.androiduitableview.activity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.androiduitableview.library.activity.UITableViewActivity;
import com.android.androiduitableview.library.widget.UITableView.ClickListener;

public class Example5Activity extends UITableViewActivity {	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CustomClickListener listener = new CustomClickListener();
        getUITableView().setClickListener(listener);
    }
        
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(Example5Activity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }

	@Override
	protected void populateList() {
		getUITableView().addBasicItem("Example 1", "Summary text 1");
		getUITableView().addBasicItem("Example 2", "Summary text 2");
		getUITableView().addBasicItem("Example 3", "Summary text 3");
		getUITableView().addBasicItem("Example 4", "Summary text 4");
		getUITableView().addBasicItem("Example 5", "Summary text 5");		
	}
    
}
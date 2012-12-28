package br.com.nrti.still;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;

public class FEvento extends SherlockActivity implements ActionBar.TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.f_evento);
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		ActionBar.Tab tab1 = getSupportActionBar().newTab();
		tab1.setText("GERAL");
		tab1.setTabListener(this);
		
		ActionBar.Tab tab2 = getSupportActionBar().newTab();
		tab2.setText("AÇÕES");
		tab2.setTabListener(this);
		
		getSupportActionBar().addTab(tab1);
		getSupportActionBar().addTab(tab2);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		
//		for (int i = 1; i <= 2; i++) {
//			ActionBar.Tab tab = getSupportActionBar().newTab();
//			tab.setText("Tab " + i);
//			tab.setTabListener(this);
//			tab.setCustomView(R.layout.det_eventos);
//			getSupportActionBar().addTab(tab);
//		}
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}

}

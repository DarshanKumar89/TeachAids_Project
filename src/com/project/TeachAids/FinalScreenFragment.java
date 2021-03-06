package com.project.TeachAids;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class FinalScreenFragment extends Fragment {
	MainActivity mParent;
	
	public FinalScreenFragment() {
		
	}

	public FinalScreenFragment(MainActivity parent) {
		mParent = parent;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.final_view, container, false);

		TextUtil.SetThinTextStyle((TextView)rootView.findViewById(R.id.finalCongrats), Color.parseColor("#3981ca"));
		TextUtil.SetThinTextStyle((TextView)rootView.findViewById(R.id.finalAidsPrevention), Color.parseColor("#c1272d"));
		TextUtil.SetThinTextStyle((TextView)rootView.findViewById(R.id.finalLearnMoreTeachAids), Color.parseColor("#3981ca"));
		
		return rootView;
	}
}
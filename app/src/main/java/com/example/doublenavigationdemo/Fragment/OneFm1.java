package com.example.doublenavigationdemo.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.doublenavigationdemo.R;

public  class OneFm1 extends Fragment {
    private String name;

    @Override
    public void setArguments(Bundle args) {
        name = args.getString("name");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onefm1_fragment, container,false);
        ((TextView) view.findViewById(R.id.fm_text)).setText(name);
        return view;
    }
}

package com.akexorcist.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class P2Fragment extends Fragment implements View.OnClickListener {
    public static final String KEY_COUNT = "key_count";

    private P2Adapter p2Adapter;
    private ViewPager vpP2;
    private Button btnAdder;
    private TextView tvAdderResult;

    private int count = 0;

    public static P2Fragment newInstance() {
        return new P2Fragment();
    }

    public P2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_p2, container, false);

        if (savedInstanceState == null) {
            onRestoreArgument();
        } else {
            onRestoreInstanceState(savedInstanceState);
        }

        bindView(view);
        setupView();

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void bindView(View root) {
        vpP2 = (ViewPager) root.findViewById(R.id.vp_p2);
        btnAdder = (Button) root.findViewById(R.id.btn_adder);
        tvAdderResult = (TextView) root.findViewById(R.id.tv_adder_result);
    }

    private void setupView() {
        btnAdder.setOnClickListener(this);

        p2Adapter = new P2Adapter(getChildFragmentManager());
        vpP2.setAdapter(p2Adapter);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        count = savedInstanceState.getInt(KEY_COUNT);
    }

    public void onRestoreArgument() {
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(KEY_COUNT, count);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        if (v == btnAdder) {
            count++;
            tvAdderResult.setText("" + count);
        }
    }
}

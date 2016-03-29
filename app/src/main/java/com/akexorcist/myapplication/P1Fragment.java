package com.akexorcist.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class P1Fragment extends Fragment implements View.OnClickListener {
    public static final String KEY_COUNT = "key_count";

    private Button btnAdder;
    private TextView tvAdderResult;

    private int count = 0;

    public static P1Fragment newInstance() {
        return new P1Fragment();
    }

    public P1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_p1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (savedInstanceState == null) {
            onRestoreArgument();
        } else {
            onRestoreInstanceState(savedInstanceState);
        }

        bindView(view);
        setupView();
    }

    private void bindView(View root) {
        btnAdder = (Button) root.findViewById(R.id.btn_adder);
        tvAdderResult = (TextView) root.findViewById(R.id.tv_adder_result);
    }

    private void setupView() {
        btnAdder.setOnClickListener(this);
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

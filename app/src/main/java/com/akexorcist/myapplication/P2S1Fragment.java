package com.akexorcist.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class P2S1Fragment extends Fragment implements View.OnClickListener {
    public static final String KEY_POSITION = "key_position";
    public static final String KEY_COUNT = "key_count";

    private TextView tvAdderResult;
    private TextView tvScreenTitle;
    private Button btnAdder;

    private int count = 0;
    private int position;

    public static P2S1Fragment newInstance(int position) {
        P2S1Fragment fragment = new P2S1Fragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_POSITION, position);
        fragment.setArguments(bundle);
        return fragment;
    }

    public P2S1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_p2_s1, container, false);
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
        tvScreenTitle = (TextView) root.findViewById(R.id.tv_screen_title);
        tvAdderResult = (TextView) root.findViewById(R.id.tv_adder_result);
    }

    private void setupView() {
        tvScreenTitle.setText("Screen " + (position + 1));
        btnAdder.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(KEY_POSITION, position);
        outState.putInt(KEY_COUNT, count);
        super.onSaveInstanceState(outState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        position = savedInstanceState.getInt(KEY_POSITION);
        count = savedInstanceState.getInt(KEY_COUNT);
        Log.e("Check", "restore state");
    }

    public void onRestoreArgument() {
        position = getArguments().getInt(KEY_POSITION);
        Log.e("Check", "restore argument");
    }

    @Override
    public void onClick(View v) {
        if (v == btnAdder) {
            count++;
            tvAdderResult.setText("" + count);
        }
    }
}

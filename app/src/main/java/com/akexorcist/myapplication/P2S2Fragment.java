package com.akexorcist.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class P2S2Fragment extends Fragment {
    public static final String KEY_POSITION = "key_position";

    private TextView tvScreenTitle;
    private int position;

    public static P2S2Fragment newInstance(int position) {
        P2S2Fragment fragment = new P2S2Fragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_POSITION, position);
        fragment.setArguments(bundle);
        return fragment;
    }

    public P2S2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_p2_s2, container, false);
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
        tvScreenTitle = (TextView) root.findViewById(R.id.tv_screen_title);
    }

    private void setupView() {
        tvScreenTitle.setText("Screen " + (position + 1));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        position = savedInstanceState.getInt(KEY_POSITION);
    }

    public void onRestoreArgument() {
        position = getArguments().getInt(KEY_POSITION);
    }
}

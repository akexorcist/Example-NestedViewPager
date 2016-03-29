package com.akexorcist.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class P3Fragment extends Fragment {

    public static P3Fragment newInstance() {
        return new P3Fragment();
    }

    public P3Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_p3, container, false);
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
    }

    private void setupView() {
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
    }

    public void onRestoreArgument() {
    }

}

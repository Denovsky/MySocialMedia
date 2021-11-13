package com.example.mysocialmedia.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysocialmedia.R;

public class MainForm extends Fragment implements View.OnClickListener {

    private TextView invite_code;
    private Button sign_up;
    private Button log_in;
    private String button_name;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_form, null);
        init(view);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_up:
                break;
            case R.id.log_in:
                break;
        }
    }

    private void init(View view) {
        invite_code = view.findViewById(R.id.invite_code);
        sign_up = view.findViewById(R.id.sign_up);
        sign_up.setOnClickListener(this);
        log_in = view.findViewById(R.id.log_in);
        log_in.setOnClickListener(this);
    }
}

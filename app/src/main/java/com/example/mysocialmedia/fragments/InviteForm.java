package com.example.mysocialmedia.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mysocialmedia.R;

public class InviteForm extends Fragment implements View.OnClickListener {

    private EditText username;
    private EditText invite_code;
    private Button log_in;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.invite_fragment, null);
        init(view);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.log_in:
                break;
        }
    }

    private void init(View view) {
        username = view.findViewById(R.id.username);
        invite_code = view.findViewById(R.id.invite_code);
        log_in = view.findViewById(R.id.log_in);
        log_in.setOnClickListener(this);
    }
}

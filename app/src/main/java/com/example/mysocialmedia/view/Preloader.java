package com.example.mysocialmedia.view;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.mysocialmedia.R;

public class Preloader extends Fragment {

    private LinearLayout navigation_bar;
    private LinearLayout page_content;
    private FrameLayout container;
    private LinearLayout action_bar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup viewGroup,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_preloader, viewGroup, false);

        init(view);

        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Animation show = AnimationUtils.loadAnimation(view.getContext(), R.anim.preload);
                page_content.setVisibility(View.VISIBLE);
                action_bar.setVisibility(View.VISIBLE);
                navigation_bar.startAnimation(show);
            }
        }, 1250);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Animation show = AnimationUtils.loadAnimation(view.getContext(), R.anim.preload);
                container.setVisibility(View.VISIBLE);
                container.startAnimation(show);
            }
        }, 2000);
        return view;
    }

    public void changeMainPage() {

    }

    private void init(View view) {
        navigation_bar = view.findViewById(R.id.navigation_bar);
        page_content = view.findViewById(R.id.page_content);
        container = view.findViewById(R.id.container);
        action_bar = view.findViewById(R.id.action_bar);
    }
}

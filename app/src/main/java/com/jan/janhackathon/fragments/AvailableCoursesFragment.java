package com.jan.janhackathon.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jan.janhackathon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AvailableCoursesFragment extends Fragment {


    public AvailableCoursesFragment() {
        // Required empty public constructor
    }

    public static AvailableCoursesFragment newInstance() {

        Bundle args = new Bundle();

        AvailableCoursesFragment fragment = new AvailableCoursesFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_available_courses, container, false);

        return rootView;
    }

}

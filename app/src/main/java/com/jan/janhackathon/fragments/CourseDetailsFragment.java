package com.jan.janhackathon.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jan.janhackathon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseDetailsFragment extends Fragment implements CoursesAdapter.OnCourseClickHandler{


    public CourseDetailsFragment() {
        // Required empty public constructor
    }


    public static CourseDetailsFragment newInstance() {

        Bundle args = new Bundle();

        CourseDetailsFragment fragment = new CourseDetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private LessonsAdapter mLessonsAdapter;
    private RecyclerView mLessonsRecyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLessonsAdapter = new LessonsAdapter(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_course_details, container, false);

        mLessonsRecyclerView = rootView.findViewById(R.id.lessons_recycler_view);
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mLessonsRecyclerView.setLayoutManager(layoutManager);
        mLessonsRecyclerView.setHasFixedSize(true);
        mLessonsRecyclerView.setAdapter(mLessonsAdapter);
        return rootView;
    }


    @Override
    public void onCourseClick() {
        CourseDetailsFragment courseDetailsFragment = CourseDetailsFragment.newInstance();
        FragmentTransaction courseDetailsTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        courseDetailsTransaction.replace(R.id.fragment_container, courseDetailsFragment);
        courseDetailsTransaction.addToBackStack(null);
        courseDetailsTransaction.commit();    }
}

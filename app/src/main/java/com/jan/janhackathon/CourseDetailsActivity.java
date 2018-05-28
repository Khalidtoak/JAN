package com.jan.janhackathon;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jan.janhackathon.fragments.CourseDetailsFragment;
import com.jan.janhackathon.fragments.DashboardFragment;

public class CourseDetailsActivity extends AppCompatActivity {

    CourseDetailsFragment mCourseDetailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);

        mCourseDetailsFragment = (CourseDetailsFragment)
                getSupportFragmentManager().findFragmentById(R.id.course_details_container);

        if (mCourseDetailsFragment == null){
            mCourseDetailsFragment = CourseDetailsFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.course_details_container, mCourseDetailsFragment);
            transaction.commit();
        }
    }
}

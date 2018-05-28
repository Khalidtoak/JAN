package com.jan.janhackathon.data;

import java.util.List;

public class InstructorModel {

    private String mInstructorName;
    private int mAverageRating;
    private List<CourseModel> mInstructorCourses;

    public InstructorModel(String mInstructorName, int mAverageRating, List<CourseModel> mInstructorCourses) {
        this.mInstructorName = mInstructorName;
        this.mAverageRating = mAverageRating;
        this.mInstructorCourses = mInstructorCourses;
    }

    public String getmInstructorName() {
        return mInstructorName;
    }

    public void setmInstructorName(String mInstructorName) {
        this.mInstructorName = mInstructorName;
    }

    public int getmAverageRating() {
        return mAverageRating;
    }

    public void setmAverageRating(int mAverageRating) {
        this.mAverageRating = mAverageRating;
    }

    public List<CourseModel> getmInstructorCourses() {
        return mInstructorCourses;
    }

    public void setmInstructorCourses(List<CourseModel> mInstructorCourses) {
        this.mInstructorCourses = mInstructorCourses;
    }
}


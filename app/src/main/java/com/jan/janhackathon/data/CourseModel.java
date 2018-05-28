package com.jan.janhackathon.data;

public class CourseModel {

    private String mCourseName;
    private String mCourseDesc;
    private int mStatus;
    private int mCompleted;

    public CourseModel(String mCourseName, String mCourseDesc, int mStatus, int mCompleted) {
        this.mCourseName = mCourseName;
        this.mCourseDesc = mCourseDesc;
        this.mStatus = mStatus;
        this.mCompleted = mCompleted;
    }

    public String getmCourseName() {
        return mCourseName;
    }

    public void setmCourseName(String mCourseName) {
        this.mCourseName = mCourseName;
    }

    public String getmCourseDesc() {
        return mCourseDesc;
    }

    public void setmCourseDesc(String mCourseDesc) {
        this.mCourseDesc = mCourseDesc;
    }

    public int getmStatus() {
        return mStatus;
    }

    public void setmStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public int getmCompleted() {
        return mCompleted;
    }

    public void setmCompleted(int mCompleted) {
        this.mCompleted = mCompleted;
    }
}

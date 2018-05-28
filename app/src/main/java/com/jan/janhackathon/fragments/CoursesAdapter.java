package com.jan.janhackathon.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jan.janhackathon.R;
import com.jan.janhackathon.custom.ProgressCircleView;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder> {

    private final Context mContext;
    private OnCourseClickHandler mClickHandler;


    public CoursesAdapter(Context context, OnCourseClickHandler clickHandler) {
        mContext = context;
        mClickHandler = clickHandler;
    }

    @NonNull
    @Override
    public CoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_item, parent, false);
        view.setFocusable(true);

        return new CoursesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesViewHolder holder, int position) {

        holder.courseTitleView.setText(R.string.maths);
        holder.courseDescView.setText(R.string.math_desc);
        holder.percentageView.setText(R.string.peercentage);
        holder.progressCircleView.setValue(20);

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class CoursesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView courseTitleView,
                courseDescView,
                percentageView;
        ProgressCircleView progressCircleView;

        public CoursesViewHolder(View itemView) {
            super(itemView);
            courseTitleView = itemView.findViewById(R.id.course_title_text);
            courseDescView = itemView.findViewById(R.id.course_desc_text);
            percentageView = itemView.findViewById(R.id.percentage_text);
            progressCircleView = itemView.findViewById(R.id.percentage_circle_view);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            mClickHandler.onCourseClick();
        }
    }

    public interface OnCourseClickHandler {
        void onCourseClick();
    }
}

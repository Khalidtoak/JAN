package com.jan.janhackathon.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jan.janhackathon.R;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.LessonsViewHolder> {


    private Context mContext;

    public LessonsAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public LessonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lesson_item, parent, false);
        view.setFocusable(true);

        return new LessonsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LessonsViewHolder holder, int position) {
        holder.lessonName.setText(R.string.algebra);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class LessonsViewHolder extends RecyclerView.ViewHolder{

        TextView lessonName;

        public LessonsViewHolder(View itemView) {
            super(itemView);

            lessonName = itemView.findViewById(R.id.lesson_name_text);
        }

    }
}

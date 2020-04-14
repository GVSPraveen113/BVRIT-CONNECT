package com.gvsdevelopers.bvritconnect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.gvsdevelopers.bvritconnect.Dashboard.News;
import com.gvsdevelopers.bvritconnect.FeedItem;

import java.util.Date;

public class NewsAdapter extends FirestoreRecyclerAdapter<FeedItem, NewsAdapter.NewsHolder> {

    public NewsAdapter(@NonNull FirestoreRecyclerOptions<FeedItem> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull NewsHolder holder, int position, @NonNull FeedItem model) {
        holder.textViewTitle.setText(model.getTitle());
        holder.textViewDescription.setText(model.getDescription());
        holder.textViewPriority.setText(String.valueOf(model.getPriority()));
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,
                parent, false);
        return new NewsHolder(v);
    }

    class NewsHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewDescription;
        TextView textViewPriority;

        public NewsHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            textViewDescription = itemView.findViewById(R.id.text_view_description);
            textViewPriority = itemView.findViewById(R.id.text_view_priority);
        }
    }
}
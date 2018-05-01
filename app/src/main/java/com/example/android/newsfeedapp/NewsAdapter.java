package com.example.android.newsfeedapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by serka on 7.04.2018.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        ViewHolder holder = new ViewHolder();
        holder.sectionNameView = (TextView) listItemView.findViewById(R.id.section_name);
        holder.webPublicationDateView = (TextView) listItemView.findViewById(R.id.web_publication_date);
        holder.webTitleView = (TextView) listItemView.findViewById(R.id.web_title);
        holder.authorNameView = (TextView) listItemView.findViewById(R.id.author_name);

        News currentNews = getItem(position);
        holder.sectionNameView.setText(currentNews.getSectionName());
        String dateString = currentNews.getWebPublicationDate().replace("T", " ").replace("Z", " ");
        dateString = dateString.substring(0, (dateString.length() - 4));
        holder.webPublicationDateView.setText(dateString);
        holder.webTitleView.setText(currentNews.getWebTitle());
        holder.authorNameView.setText(currentNews.getAuthorName());

        return listItemView;
    }

    static class ViewHolder {
        TextView sectionNameView;
        TextView webPublicationDateView;
        TextView webTitleView;
        TextView authorNameView;
    }
}

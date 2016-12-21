package ru.ifmo.android_2016.listdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Folder> list;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, path, sync;
        ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.name);
            path = (TextView) v.findViewById(R.id.path);
        }
    }

    public MyAdapter(List<Folder> list) {
        this.list = list;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.folder_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Folder f = list.get(position);
        holder.name.setText(f.getName());
        holder.path.setText(f.getPath());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class Folder {
    private String name, path;

    public Folder(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}
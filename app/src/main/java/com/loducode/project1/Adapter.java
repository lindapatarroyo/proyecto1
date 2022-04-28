package com.loducode.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.loducode.project1.databinding.AdapterBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter <Adapter.ViewHolder> {

    ArrayList<String> list = new ArrayList();
    public Adapter(Context context, ArrayList<String> results){
        //this.inflater= LayoutInflater.from(context);
        //y la lista
        this.list = results;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(AdapterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.name.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        AdapterBinding binding;
        public ViewHolder(AdapterBinding binding){
            super(binding.getRoot());
            this.binding = binding;

        }
    }

}

package com.example.vegetable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NonVegAdapter extends RecyclerView.Adapter<NonVegAdapter.NonVegViewHolder> {

    List<Model> modelList;

    public NonVegAdapter( List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public NonVegAdapter.NonVegViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vegetable_list,parent,false);

        return new NonVegViewHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull NonVegAdapter.NonVegViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.textView.setText(model.getName());
        holder.imageView.setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class NonVegViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public NonVegViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.Name);
            imageView = itemView.findViewById(R.id.Image);
        }
    }


}

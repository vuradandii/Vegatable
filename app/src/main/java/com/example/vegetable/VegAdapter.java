package com.example.vegetable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class VegAdapter extends RecyclerView.Adapter<VegAdapter.VegViewHolder> {

    List<Model> modelList;

    public VegAdapter(List<Model> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public VegAdapter.VegViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vegetable_list,parent,false);
        return new VegViewHolder(itemView);
}

    @Override
    public void onBindViewHolder(@NonNull VegAdapter.VegViewHolder holder, int position) {
         Model model = modelList.get(position);
         holder.textView.setText(model.getName());
         holder.imageView.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class VegViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        public VegViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.Name);
            imageView = itemView.findViewById(R.id.Image);
        }


    }
}

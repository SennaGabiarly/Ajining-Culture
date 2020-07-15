package com.sennagby.coba.adapter.Home2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sennagby.coba.R;
import com.sennagby.coba.fragment.Model.Model_home2;

import java.util.List;

public class AdapterHome2 extends RecyclerView.Adapter<AdapterHome2.ViewHolder> {
    List<Model_home2> home2;

    public AdapterHome2(List<Model_home2> gridhome2) {
        this.home2 = gridhome2;
    }

    @NonNull
    @Override
    public AdapterHome2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_grid, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageGridhome2.setImageResource(home2.get(position).getImage());
        holder.nameGridname2.setText(home2.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return home2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageGridhome2;
        TextView nameGridname2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageGridhome2 = itemView.findViewById(R.id.image_grid_view);
            nameGridname2 = itemView.findViewById(R.id.text_name);
        }
    }
}

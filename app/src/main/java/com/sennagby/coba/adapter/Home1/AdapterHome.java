package com.sennagby.coba.adapter.Home1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sennagby.coba.R;
import com.sennagby.coba.fragment.Model.Model_home;

import java.util.List;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {
    List<Model_home> home1;

    public AdapterHome(List<Model_home> gridhome) {
        this.home1 = gridhome;
    }

    @NonNull
    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_grid, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageGridhome.setImageResource(home1.get(position).getImage());
        holder.nameGridname.setText(home1.get(position).getName());
    }


    @Override
    public int getItemCount() {
        return home1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageGridhome;
        TextView nameGridname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageGridhome = itemView.findViewById(R.id.image_grid_view);
            nameGridname = itemView.findViewById(R.id.text_name);
        }
    }
}

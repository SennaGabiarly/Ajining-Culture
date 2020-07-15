package com.sennagby.coba.fragment.Menu1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sennagby.coba.R;
import com.sennagby.coba.adapter.Home1.AdapterHome;
import com.sennagby.coba.fragment.Model.Model_home;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    List<Model_home> listhome;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView= view.findViewById(R.id.list_grid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(container.getContext(), 2));
        DataHome();

        recyclerView.setAdapter(new AdapterHome(DataHome()));

        return view;
    }
    private List<Model_home> DataHome() {
        listhome= new ArrayList<>();
        listhome.add(new Model_home(R.drawable.ic_launcher_background,"Batik"));
        listhome.add(new Model_home(R.drawable.ic_launcher_background,"Wayang"));
        listhome.add(new Model_home(R.drawable.ic_launcher_background,"Gethuk"));
        listhome.add(new Model_home(R.drawable.ic_launcher_background,"new"));
        return listhome;
    }
}

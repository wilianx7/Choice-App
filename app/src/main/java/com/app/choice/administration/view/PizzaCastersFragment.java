package com.app.choice.administration.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.app.choice.R;
import com.app.choice.administration.adapter.PizzaCastersFragmentListAdapter;
import com.app.choice.administration.model.PizzaCasterModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaCastersFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton pizzaCasterButton;

    private ArrayAdapter<PizzaCasterModel> adapter;
    private ArrayList<PizzaCasterModel> pizzaCasterArray;


    public PizzaCastersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pizza_casters, container, false);

        listView = view.findViewById(R.id.listview_pizza_caster_fragment);
        progressBar = view.findViewById(R.id.progressBar_pizza_caster_fragment);
        pizzaCasterButton = view.findViewById(R.id.pizza_caster_add_button);

        pizzaCasterArray = new ArrayList<>();

        pizzaCasterArray.add(new PizzaCasterModel(1, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(2, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(3, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(4, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(5, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(6, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(7, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(8, 1, "Rodízio Tradicional", new Date(), true));
        pizzaCasterArray.add(new PizzaCasterModel(9, 1, "Rodízio Tradicional", new Date(), true));

        adapter = new PizzaCastersFragmentListAdapter(getActivity(), pizzaCasterArray);
        listView.setAdapter(adapter);

        return view;
    }

}

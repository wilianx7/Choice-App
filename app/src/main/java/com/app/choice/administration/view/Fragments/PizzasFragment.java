package com.app.choice.administration.view.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.app.choice.R;
import com.app.choice.administration.adapter.PizzasFragmentListAdapter;
import com.app.choice.administration.model.PizzaModel;
import com.app.choice.administration.view.Registers.PizzaRegister;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PizzasFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton pizzaButton;

    private ArrayAdapter<PizzaModel> adapter;
    private ArrayList<PizzaModel> pizzasArray;

    public PizzasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pizzas, container, false);

        listView = view.findViewById(R.id.listview_pizza_fragment);
        progressBar = view.findViewById(R.id.progressBar_pizza_fragment);
        pizzaButton = view.findViewById(R.id.pizza_add_button);

        pizzasArray = new ArrayList<>();

        pizzasArray.add(new PizzaModel(1, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(2, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(3, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(4, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(5, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(6, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(7, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(8, "Frango", "A, B, C", true));
        pizzasArray.add(new PizzaModel(9, "Frango", "A, B, C", true));


        adapter = new PizzasFragmentListAdapter(getActivity(), pizzasArray);
        listView.setAdapter(adapter);

        setButtonActions();

        return view;
    }

    private void setButtonActions() {
        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Cadastro de Pizzas **/
                Intent intent = new Intent(getActivity(), PizzaRegister.class);
                startActivity(intent);
            }
        });
    }
}

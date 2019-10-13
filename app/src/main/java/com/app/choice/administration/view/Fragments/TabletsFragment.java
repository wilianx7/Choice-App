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
import com.app.choice.administration.adapter.TabletFragmentListAdapter;
import com.app.choice.administration.model.TabletModel;
import com.app.choice.administration.view.Registers.TabletRegister;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabletsFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton tabletButton;

    private ArrayAdapter<TabletModel> adapter;
    private ArrayList<TabletModel> tabletsArray;


    public TabletsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tablets, container, false);

        listView = view.findViewById(R.id.listview_tablet_fragment);
        progressBar = view.findViewById(R.id.progressBar_tablet_fragment);
        tabletButton = view.findViewById(R.id.tablet_add_button);

        tabletsArray = new ArrayList<>();

        tabletsArray.add(new TabletModel(1, 1, "Tablet 1", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(2, 1, "Tablet 2", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(3, 1, "Tablet 3", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(4, 1, "Tablet 4", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(5, 1, "Tablet 5", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(6, 1, "Tablet 6", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(7, 1, "Tablet 7", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(8, 1, "Tablet 8", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(9, 1, "Tablet 9", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(10, 1, "Tablet 10", "sfsadfafdsaf", true));
        tabletsArray.add(new TabletModel(11, 1, "Tablet 11", "sfsadfafdsaf", true));

        adapter = new TabletFragmentListAdapter(getActivity(), tabletsArray);
        listView.setAdapter(adapter);

        setButtonActions();

        return view;
    }

    private void setButtonActions() {
        tabletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Cadastro de Tablets **/
                Intent intent = new Intent(getActivity(), TabletRegister.class);
                startActivity(intent);
            }
        });
    }
}

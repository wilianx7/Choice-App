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
import com.app.choice.administration.adapter.TablesFragmentListAdapter;
import com.app.choice.administration.model.TableModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TablesFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton tableButton;

    private ArrayAdapter<TableModel> adapter;
    private ArrayList<TableModel> tablesArray;

    public TablesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tables, container, false);

        listView = view.findViewById(R.id.listview_table_fragment);
        progressBar = view.findViewById(R.id.progressBar_table_fragment);
        tableButton = view.findViewById(R.id.table_button);

        tablesArray = new ArrayList<>();

        tablesArray.add(new TableModel(1, 1, "Mesa 1", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(2, 1, "Mesa 2", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(3, 1, "Mesa 3", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(4, 1, "Mesa 4", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(5, 1, "Mesa 5", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(6, 1, "Mesa 6", "sfsadfafdsaf", false));
        tablesArray.add(new TableModel(7, 1, "Mesa 7", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(8, 1, "Mesa 8", "sfsadfafdsaf", false));
        tablesArray.add(new TableModel(9, 1, "Mesa 9", "sfsadfafdsaf", true));
        tablesArray.add(new TableModel(10, 1, "Mesa 10", "sfsadfafdsaf", true));

        adapter = new TablesFragmentListAdapter(getActivity(), tablesArray);
        listView.setAdapter(adapter);

        return view;
    }
}

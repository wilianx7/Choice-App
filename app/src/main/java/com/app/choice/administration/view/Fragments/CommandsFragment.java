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
import com.app.choice.administration.adapter.CommandsFragmentListAdapter;
import com.app.choice.administration.model.CommandModel;
import com.app.choice.administration.view.Registers.CommandRegister;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class CommandsFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton commandButton;

    private ArrayAdapter<CommandModel> adapter;
    private ArrayList<CommandModel> commandsArray;


    public CommandsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_commands, container, false);

        listView = view.findViewById(R.id.listview_command_fragment);
        progressBar = view.findViewById(R.id.progressBar_command_fragment);
        commandButton = view.findViewById(R.id.command_add_button);

        commandsArray = new ArrayList<>();

        commandsArray.add(new CommandModel(1, 1, new Date(), true));
        commandsArray.add(new CommandModel(2, 2, new Date(), true));
        commandsArray.add(new CommandModel(3, 3, new Date(), true));
        commandsArray.add(new CommandModel(4, 4, new Date(), true));
        commandsArray.add(new CommandModel(5, 5, new Date(), true));
        commandsArray.add(new CommandModel(6, 6, new Date(), true));
        commandsArray.add(new CommandModel(7, 7, new Date(), true));
        commandsArray.add(new CommandModel(8, 8, new Date(), true));

        adapter = new CommandsFragmentListAdapter(getActivity(), commandsArray);
        listView.setAdapter(adapter);

        setButtonsActions();

        return view;
    }

    private void setButtonsActions() {
        commandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Cadastro de Comandas **/
                Intent intent = new Intent(getActivity(), CommandRegister.class);
                startActivity(intent);
            }
        });
    }
}

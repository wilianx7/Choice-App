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
import com.app.choice.administration.adapter.UsersFragmentListAdapter;
import com.app.choice.administration.model.UserModel;
import com.app.choice.administration.view.Registers.UserRegister;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsersFragment extends Fragment {
    private ListView listView;
    private ProgressBar progressBar;
    private FloatingActionButton userButton;

    private ArrayAdapter<UserModel> adapter;
    private ArrayList<UserModel> usersArray;


    public UsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_users, container, false);

        listView = view.findViewById(R.id.listview_user_fragment);
        progressBar = view.findViewById(R.id.progressBar_user_fragment);
        userButton = view.findViewById(R.id.user_add_button);

        usersArray = new ArrayList<>();

        usersArray.add(new UserModel(1, 1, 1, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(2, 1, 2, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(3, 1, 3, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(4, 1, 4, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(5, 1, 5, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(6, 1, 6, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(7, 1, 7, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(8, 1, 8, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(9, 1, 9, "Wilian", "51991544444", false));
        usersArray.add(new UserModel(10, 1, 10, "Wilian", "51991544444", false));


        adapter = new UsersFragmentListAdapter(getActivity(), usersArray);
        listView.setAdapter(adapter);

        setButtonActions();

        return view;
    }

    private void setButtonActions() {
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Cadastro de Usuário (Funcionário) **/
                Intent intent = new Intent(getActivity(), UserRegister.class);
                startActivity(intent);
            }
        });
    }
}

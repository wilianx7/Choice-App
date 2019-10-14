package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.TabletModel;
import com.app.choice.administration.model.UserModel;

import java.util.ArrayList;

public class UsersFragmentListAdapter extends ArrayAdapter<UserModel> {
    private Context context;
    private ArrayList<UserModel> usersArray;

    public UsersFragmentListAdapter(Context context, ArrayList<UserModel> usersArray) {
        super(context, 0, usersArray);
        this.context = context;
        this.usersArray = usersArray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        /*** Verifica se não existe o objeto view criado,
         pois a view utilizada é armazenada no cash do
         android e fica na variável convertView ***/
        if (view == null) {
            /** Inicializa o objeto para montagem da view **/
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            /** Monta a view a partir do xml **/
            view = layoutInflater.inflate(R.layout.fragment_list_item, parent, false);
        }

        /** Verifica se existem pizzas **/
        if (usersArray.size() > 0) {
            TextView username = view.findViewById(R.id.item_name);
            TextView userCellphone = view.findViewById(R.id.item_description);

            UserModel user = usersArray.get(position);

            username.setText(user.getName());
            userCellphone.setText(user.getCell_phone());
        }

        return view;
    }
}

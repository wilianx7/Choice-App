package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.CommandModel;
import com.app.choice.administration.model.PizzaCasterModel;

import java.util.ArrayList;

public class PizzaCastersFragmentListAdapter extends ArrayAdapter<PizzaCasterModel> {
    private Context context;
    private ArrayList<PizzaCasterModel> pizzaCastersArray;

    public PizzaCastersFragmentListAdapter(Context context, ArrayList<PizzaCasterModel> pizzaCastersArray) {
        super(context, 0, pizzaCastersArray);
        this.context = context;
        this.pizzaCastersArray = pizzaCastersArray;
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
        if (pizzaCastersArray.size() > 0) {
            TextView pizzaCasterName = view.findViewById(R.id.item_name);
            TextView tableDescription = view.findViewById(R.id.item_description);

            PizzaCasterModel pizzaCaster = pizzaCastersArray.get(position);

            pizzaCasterName.setText(pizzaCaster.getName());
            if (pizzaCaster.is_active()) {
                tableDescription.setText("Ativo");
            } else {
                tableDescription.setText("Inativo");
            }
        }

        return view;
    }
}

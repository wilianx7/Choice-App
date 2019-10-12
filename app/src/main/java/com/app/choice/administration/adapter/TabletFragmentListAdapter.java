package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.TabletModel;

import java.util.ArrayList;

public class TabletFragmentListAdapter extends ArrayAdapter<TabletModel> {
    private Context context;
    private ArrayList<TabletModel> tabletsArray;

    public TabletFragmentListAdapter(Context context, ArrayList<TabletModel> tabletsArray) {
        super(context, 0, tabletsArray);
        this.context = context;
        this.tabletsArray = tabletsArray;
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
        if (tabletsArray.size() > 0) {
            TextView tabletName = view.findViewById(R.id.item_name);
            TextView tabletDescription = view.findViewById(R.id.item_description);

            TabletModel tablet = tabletsArray.get(position);

            tabletName.setText(tablet.getName());
            if (tablet.isActive()) {
                tabletDescription.setText("Ativo");
            } else {
                tabletDescription.setText("Inativo");
            }
        }

        return view;
    }
}

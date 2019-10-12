package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.TableModel;

import java.util.ArrayList;

public class TablesFragmentListAdapter extends ArrayAdapter<TableModel> {
    private Context context;
    private ArrayList<TableModel> tablesArray;

    public TablesFragmentListAdapter(Context context, ArrayList<TableModel> tablesArray) {
        super(context, 0, tablesArray);
        this.context = context;
        this.tablesArray = tablesArray;
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
        if (tablesArray.size() > 0) {
            TextView tableName = view.findViewById(R.id.item_name);
            TextView tableDescription = view.findViewById(R.id.item_description);

            TableModel table = tablesArray.get(position);

            tableName.setText(table.getName());
            if (table.is_active()) {
                tableDescription.setText("Ativa");
            } else {
                tableDescription.setText("Inativa");
            }
        }

        return view;
    }
}

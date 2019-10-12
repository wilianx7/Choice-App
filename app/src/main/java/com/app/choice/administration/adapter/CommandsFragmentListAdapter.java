package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.CommandModel;

import java.util.ArrayList;

public class CommandsFragmentListAdapter extends ArrayAdapter<CommandModel> {
    private Context context;
    private ArrayList<CommandModel> commandsArray;

    public CommandsFragmentListAdapter(Context context, ArrayList<CommandModel> commandsArray) {
        super(context, 0, commandsArray);
        this.context = context;
        this.commandsArray = commandsArray;
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
        if (commandsArray.size() > 0) {
            TextView commandDate = view.findViewById(R.id.item_name);
            TextView tableDescription = view.findViewById(R.id.item_description);

            CommandModel command = commandsArray.get(position);

            commandDate.setText(android.text.format.DateFormat.format("dd/MM/yyyy hh:mm:ss a", command.getDate()));
            if (command.isActive()) {
                tableDescription.setText("Aberta");
            } else {
                tableDescription.setText("Fechada");
            }
        }

        return view;
    }
}

package com.app.choice.administration.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.model.PizzaModel;

import java.util.ArrayList;

public class PizzasFragmentListAdapter extends ArrayAdapter<PizzaModel> {
    private Context context;
    private ArrayList<PizzaModel> pizzasArray;

    public PizzasFragmentListAdapter(Context context, ArrayList<PizzaModel> pizzasArray) {
        super(context, 0, pizzasArray);
        this.context = context;
        this.pizzasArray = pizzasArray;
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
            view = layoutInflater.inflate(R.layout.pizza_list_item, parent, false);
        }

        /** Verifica se existem pizzas **/
        if (pizzasArray.size() > 0) {
            TextView pizzaName = view.findViewById(R.id.pizza_name);
            TextView pizzaDescription = view.findViewById(R.id.pizza_description);
            ImageView pizzaIcon = view.findViewById(R.id.pizza_icon);

            PizzaModel pizza = pizzasArray.get(position);

            pizzaName.setText(pizza.getFlavor());
            pizzaDescription.setText(pizza.getIngredients());
            pizzaIcon.setImageResource(R.drawable.white_admin_icon);
        }

        return view;
    }
}

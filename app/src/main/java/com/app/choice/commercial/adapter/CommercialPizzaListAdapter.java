package com.app.choice.commercial.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.commercial.model.CommercialPizzaModel;

import java.util.ArrayList;

public class CommercialPizzaListAdapter extends ArrayAdapter<CommercialPizzaModel> {
    private Context context;
    private ArrayList<CommercialPizzaModel> pizzasArray;

    public CommercialPizzaListAdapter(Context context, ArrayList<CommercialPizzaModel> pizzasArray) {
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
        if(view == null){
            /** Inicializa o objeto para montagem da view **/
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            /** Monta a view a partir do xml **/
            view = layoutInflater.inflate(R.layout.pizza_list_item, parent, false);
        }

        /** Verifica se existem pizzas **/
        if(pizzasArray.size() > 0){
            TextView pizzaName = view.findViewById(R.id.pizza_name);
            TextView pizzaDescription = view.findViewById(R.id.pizza_description);
            ImageView pizzaIcon = view.findViewById(R.id.pizza_icon);

            CommercialPizzaModel pizza = pizzasArray.get(position);

            pizzaName.setText(pizza.getFlavor());
            pizzaDescription.setText(pizza.getIngredients());
            pizzaIcon.setImageResource(R.drawable.white_admin_icon);

            if(pizza.isAccepted()){
                view.setBackgroundColor(Color.parseColor("#2E8B57"));
                view.getBackground().setAlpha(100);
            } else {
                view.setBackgroundColor(Color.parseColor("#c51c1c"));
                view.getBackground().setAlpha(190);
            }
        }

        return view;
    }
}

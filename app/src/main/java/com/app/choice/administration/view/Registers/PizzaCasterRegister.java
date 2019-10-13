package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import com.app.choice.R;
import com.app.choice.administration.helper.ListviewHelper;
import com.app.choice.administration.view.AdministrationPizzaList;
import com.app.choice.commercial.adapter.CommercialPizzaListAdapter;
import com.app.choice.commercial.model.CommercialPizzaModel;

import java.util.ArrayList;

public class PizzaCasterRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private CheckBox checkBox_active;
    private Button register_pizza_caster_button;
    private Button register_addpizza_caster_button;

    private ListView listView;
    private ArrayAdapter<CommercialPizzaModel> adapter;
    private ArrayList<CommercialPizzaModel> acceptedPizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_caster_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_pizza_caster_toolbar);
        edit_name = findViewById(R.id.edit_pizza_caster_name);
        checkBox_active = findViewById(R.id.checkBox_pizza_caster_active);
        register_pizza_caster_button = findViewById(R.id.register_pizza_caster_button);
        register_addpizza_caster_button = findViewById(R.id.register_caster_addpizza_button);
        listView = findViewById(R.id.pizza_list_view);

        acceptedPizzas = new ArrayList<>();

        /** Toolbar **/
        toolbar.setTitle("Cadastro Rodízios");
        setSupportActionBar(toolbar);

        setButtonActions();
    }

    private void setButtonActions() {
        register_pizza_caster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR RODÍZIO NO BANCO

                // Finaliza a activity.
                finish();
            }
        });

        register_addpizza_caster_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Inicia uma nova activity e espera por um resultado **/
                Intent intent = new Intent(PizzaCasterRegister.this, AdministrationPizzaList.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    /** Método para recuperar as pizzas selecionadas pelo usuário após fechar a activity de seleção **/
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                acceptedPizzas = (ArrayList<CommercialPizzaModel>) data.getSerializableExtra("result");
                for (CommercialPizzaModel model : acceptedPizzas) {
                    Log.i("pizzas", model.getFlavor());
                }

                adapter = new CommercialPizzaListAdapter(PizzaCasterRegister.this, acceptedPizzas);
                listView.setAdapter(adapter);

                ListviewHelper.setListViewHeightBasedOnChildren(listView);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }
}

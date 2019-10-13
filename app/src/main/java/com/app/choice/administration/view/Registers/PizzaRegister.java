package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.choice.R;

public class PizzaRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private EditText edit_ingredients;
    private CheckBox checkBox_available;
    private Button register_pizza_button;

    //TODO: FALTA PERMITIR AO USUÁRIO ESCOLHER UMA IMAGEM PARA A PIZZA NO CADASTRO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_pizza_toolbar);
        edit_name = findViewById(R.id.edit_pizza_name);
        edit_ingredients = findViewById(R.id.edit_pizza_ingredients);
        checkBox_available = findViewById(R.id.checkBox_pizza_available);
        register_pizza_button = findViewById(R.id.register_pizza_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Pizza");
        setSupportActionBar(toolbar);

        setButtonActions();
    }

    private void setButtonActions() {
        register_pizza_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR PIZZA NO BANCO

                // Finaliza a activity.
                finish();
            }
        });
    }
}

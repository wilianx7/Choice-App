package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.choice.R;

public class PizzaCasterRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private CheckBox checkBox_active;
    private Button register_pizza_caster_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_caster_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_pizza_caster_toolbar);
        edit_name = findViewById(R.id.edit_pizza_caster_name);
        checkBox_active = findViewById(R.id.checkBox_pizza_caster_active);
        register_pizza_caster_button = findViewById(R.id.register_pizza_caster_button);

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
    }
}

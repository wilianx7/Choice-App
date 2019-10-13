package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.app.choice.R;

import java.util.ArrayList;

public class CommandRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private Spinner spinner_caster;
    private Spinner spinner_table;
    private Button register_command_button;

    private ArrayList<String> spinner_caster_options;
    private ArrayList<String> spinner_table_options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_command_toolbar);
        spinner_caster = findViewById(R.id.spinner_caster_register_command);
        spinner_table = findViewById(R.id.spinner_table_register_command);
        register_command_button = findViewById(R.id.register_command_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Comanda");
        setSupportActionBar(toolbar);

        /**
         * SPINNERS
         */
        spinner_caster_options = new ArrayList<>();
        spinner_caster_options.add("Selecione um rodízio");

        spinner_table_options = new ArrayList<>();
        spinner_table_options.add("Selecione uma mesa");

        ArrayAdapter<String> spinner_caster_adapter = new ArrayAdapter(CommandRegister.this, R.layout.spinner_item, spinner_caster_options);
        spinner_caster_adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner_caster.setAdapter(spinner_caster_adapter);

        ArrayAdapter<String> spinner_table_adapter = new ArrayAdapter(CommandRegister.this, R.layout.spinner_item, spinner_table_options);
        spinner_table_adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        spinner_table.setAdapter(spinner_table_adapter);

        spinner_caster.setSelection(0);
        spinner_table.setSelection(0);

        setButtonActions();
    }


    private void setButtonActions() {
        register_command_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR COMANDA NO BANCO E LIBERAR LISTAGEM DE PIZZAS PARA O CLIENTE NO MÓDULO COMERCIAL

                // Finaliza a activity.
                finish();
            }
        });

        spinner_caster.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TODO: DEFINIR AÇÕES AO SELECIONAR UM ITEM DO CASTER SPINNER
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_table.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TODO: DEFINIR AÇÕES AO SELECIONAR UM ITEM DO TABLE SPINNER
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

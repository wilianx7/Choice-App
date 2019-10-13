package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.choice.R;

public class TableRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private CheckBox checkBox_active;
    private Button register_table_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_table_toolbar);
        edit_name = findViewById(R.id.edit_table_name);
        checkBox_active = findViewById(R.id.checkBox_table_active);
        register_table_button = findViewById(R.id.register_table_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Mesa");
        setSupportActionBar(toolbar);

        setButtonActions();
    }

    private void setButtonActions() {
        register_table_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR TABLE NO BANCO

                // Finaliza a activity.
                finish();
            }
        });
    }
}

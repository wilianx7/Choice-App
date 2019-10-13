package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.choice.R;

public class TabletRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private CheckBox checkBox_active;
    private Button register_tablet_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_tablet_toolbar);
        edit_name = findViewById(R.id.edit_tablet_name);
        checkBox_active = findViewById(R.id.checkBox_tablet_active);
        register_tablet_button = findViewById(R.id.register_tablet_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Tablet");
        setSupportActionBar(toolbar);

        setButtonActions();
    }

    private void setButtonActions() {
        register_tablet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR TABLET NO BANCO

                // Finaliza a activity.
                finish();
            }
        });
    }
}

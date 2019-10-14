package com.app.choice.administration.view.Registers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.app.choice.R;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class UserRegister extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private EditText edit_cellphone;
    private EditText edit_email;
    private EditText edit_password;
    private EditText edit_password_confirmation;
    private CheckBox checkBox_active;
    private Button register_user_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_user_toolbar);
        edit_name = findViewById(R.id.edit_username);
        edit_cellphone = findViewById(R.id.edit_user_cellphone);
        edit_email = findViewById(R.id.edit_user_email);
        edit_password = findViewById(R.id.edit_user_password);
        edit_password_confirmation = findViewById(R.id.edit_user_password_confirmation);
        checkBox_active = findViewById(R.id.checkBox_user_active);
        register_user_button = findViewById(R.id.register_user_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Funcionário");
        setSupportActionBar(toolbar);

        setMasks();
        setButtonActions();
    }

    private void setButtonActions() {
        register_user_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR USUÁRIO (FUNCIONÁRIO) NO BANCO

                // Finaliza a activity.
                finish();
            }
        });
    }

    private void setMasks() {
        SimpleMaskFormatter cellphone_mask = new SimpleMaskFormatter("(NN) NNNNN-NNNN");
        MaskTextWatcher cellphone_mask_watcher = new MaskTextWatcher(edit_cellphone, cellphone_mask);
        edit_cellphone.addTextChangedListener(cellphone_mask_watcher);
    }
}

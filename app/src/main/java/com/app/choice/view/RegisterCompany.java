package com.app.choice.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.choice.R;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class RegisterCompany extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private EditText edit_cnpj;
    private EditText edit_cellphone;
    private EditText edit_email;
    private EditText edit_password;
    private EditText edit_password_confirmation;
    private Button register_company_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_company);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.register_company_toolbar);
        edit_name = findViewById(R.id.edit_company_name);
        edit_cnpj = findViewById(R.id.edit_company_cnpj);
        edit_cellphone = findViewById(R.id.edit_company_cellphone);
        edit_email = findViewById(R.id.edit_company_email);
        edit_password = findViewById(R.id.edit_company_password);
        edit_password_confirmation = findViewById(R.id.edit_company_password_confirmation);
        register_company_button = findViewById(R.id.register_company_button);

        /** Toolbar **/
        toolbar.setTitle("Cadastro Empresa");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);

        setMasks();
        setButtonActions();
    }

    private void setButtonActions() {
        register_company_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: CADASTRAR EMPRESA NO BANCO DE DADOS
            }
        });
    }

    private void setMasks() {
        SimpleMaskFormatter cellphone_mask = new SimpleMaskFormatter("(NN) NNNNN-NNNN");
        MaskTextWatcher cellphone_mask_watcher = new MaskTextWatcher(edit_cellphone, cellphone_mask);
        edit_cellphone.addTextChangedListener(cellphone_mask_watcher);

        SimpleMaskFormatter cnpj_mask = new SimpleMaskFormatter("NNN.NNN.NNN/NNNN-NN");
        MaskTextWatcher cnpj_mask_watcher = new MaskTextWatcher(edit_cnpj, cnpj_mask);
        edit_cnpj.addTextChangedListener(cnpj_mask_watcher);
    }
}

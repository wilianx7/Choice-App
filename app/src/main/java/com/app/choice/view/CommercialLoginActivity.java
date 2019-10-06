package com.app.choice.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.app.choice.R;

public class CommercialLoginActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText edit_cod_table;
    private EditText edit_cod_tablet;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_login);

        toolbar = findViewById(R.id.commercial_toolbar);
        edit_cod_table = findViewById(R.id.cod_table_commercial);
        edit_cod_tablet = findViewById(R.id.cod_tablet_commercial);
        btn_login = findViewById(R.id.commercial_login_button);


        toolbar.setTitle("Módulo Comercial");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);
    }
}

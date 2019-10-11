package com.app.choice.commercial.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.commercial_toolbar);
        edit_cod_table = findViewById(R.id.cod_table_commercial);
        edit_cod_tablet = findViewById(R.id.cod_tablet_commercial);
        btn_login = findViewById(R.id.commercial_login_button);

        /** Toolbar **/
        toolbar.setTitle("Módulo Comercial");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);

        /** Ações onClick **/
        setButtonActions();
    }

    /**
     * Ações onClick
     **/
    private void setButtonActions() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Tela inicial módulo comercial **/
                Intent intent = new Intent(CommercialLoginActivity.this, CommercialHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

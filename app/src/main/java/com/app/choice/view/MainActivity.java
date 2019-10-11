package com.app.choice.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.choice.R;
import com.app.choice.administration.view.AdministrationLoginActivity;
import com.app.choice.commercial.view.CommercialPizzaList;

public class MainActivity extends AppCompatActivity {

    private Button btn_commercial;
    private Button btn_Administration;
    private TextView createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Referenciando elementos da view **/
        btn_commercial = findViewById(R.id.commercial_button);
        btn_Administration = findViewById(R.id.administration_button);
        createAccount = findViewById(R.id.create_account);

        /** Ações onClick **/
        setButtonsActions();
    }

    /**
     * Ações onClick
     **/
    private void setButtonsActions() {
        btn_commercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Login Comercial **/
                //Intent intent = new Intent(MainActivity.this, CommercialLoginActivity.class);
                Intent intent = new Intent(MainActivity.this, CommercialPizzaList.class);
                startActivity(intent);
            }
        });

        btn_Administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Login Administrador **/
                Intent intent = new Intent(MainActivity.this, AdministrationLoginActivity.class);
                startActivity(intent);
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Cadastro de Empresa **/
                Intent intent = new Intent(MainActivity.this, RegisterCompany.class);
                startActivity(intent);
            }
        });
    }
}

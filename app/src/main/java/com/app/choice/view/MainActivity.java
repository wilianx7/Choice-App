package com.app.choice.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.choice.R;

public class MainActivity extends AppCompatActivity {

    private Button btn_commercial;
    private Button btn_Administration;
    private TextView createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_commercial = findViewById(R.id.commercial_button);
        btn_Administration = findViewById(R.id.administration_button);
        createAccount = findViewById(R.id.create_account);

        setButtonsActions();
    }

    private void setButtonsActions(){
        btn_commercial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CommercialLoginActivity.class);
                startActivity(intent);
            }
        });

        btn_Administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdministrationLoginActivity.class);
                startActivity(intent);
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Abrir cadastro de estabelecimento **/
            }
        });
    }
}

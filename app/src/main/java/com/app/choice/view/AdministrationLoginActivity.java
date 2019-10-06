package com.app.choice.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.app.choice.R;

public class AdministrationLoginActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText edit_email;
    private EditText edit_password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration_login);

        toolbar = findViewById(R.id.administration_toolbar);
        edit_email = findViewById(R.id.email_administration);
        edit_password = findViewById(R.id.password_administration);
        btn_login = findViewById(R.id.administration_login_button);

        toolbar.setTitle("Módulo Administrativo");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);
    }
}

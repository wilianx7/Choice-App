package com.app.choice.commercial.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.app.choice.R;

public class CommercialHomeActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btn_request_caster;
    private TextView await_label;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_home);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.commercial_home_toolbar);
        btn_request_caster = findViewById(R.id.commercial_home_button);
        await_label = findViewById(R.id.commercial_home_await_label);
        progressBar = findViewById(R.id.commercial_home_progressbar);

        /** Toolbar **/
        toolbar.setTitle("Mesa 01");
        setSupportActionBar(toolbar);

        progressBar.getIndeterminateDrawable().setColorFilter(0xFF165ed4, PorterDuff.Mode.MULTIPLY);

        /** Ações onClick **/
        setButtonsActions();
    }

    /**
     * Ações onClick
     **/
    private void setButtonsActions() {
        btn_request_caster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Solicitar rodízio ao módulo administrativo **/
                await_label.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.VISIBLE);
                btn_request_caster.setEnabled(false);
                btn_request_caster.getBackground().setAlpha(100);

                //TODO: ABRIR LISTAGEM DE PIZZAS SOMENTE APÓS A LIBERAÇÃO DA COMANDA
                /** Tela escolha de pizzas **/
                Intent intent = new Intent(CommercialHomeActivity.this, CommercialPizzaList.class);
                startActivity(intent);
            }
        });
    }
}

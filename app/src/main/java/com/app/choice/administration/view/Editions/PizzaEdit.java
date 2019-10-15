package com.app.choice.administration.view.Editions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.app.choice.R;
import com.app.choice.administration.model.PizzaModel;

public class PizzaEdit extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_flavor;
    private EditText edit_ingredients;
    private CheckBox checkBox_situation;
    private Button save_button;
    private ProgressBar progressBar;

    private PizzaModel pizzaModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_edit);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.pizza_edit_toolbar);
        edit_flavor = findViewById(R.id.pizza_edit_flavor);
        edit_ingredients = findViewById(R.id.pizza_edit_ingredients);
        checkBox_situation = findViewById(R.id.pizza_edit_checkbox);
        save_button = findViewById(R.id.pizza_edit_button);
        progressBar = findViewById(R.id.pizza_edit_progressBar);

        /** Toolbar **/
        toolbar.setTitle("Edição Pizza");
        setSupportActionBar(toolbar);

        /** Recuperar comanda selecionada **/
        Intent intent = getIntent();
        pizzaModel = (PizzaModel) intent.getSerializableExtra("pizza");

        setButtonsActions();
        setFieldData();
    }

    private void setButtonsActions() {
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: SALVAR EDIÇÃO
                try {
                    save_button.setVisibility(View.GONE);
                    progressBar.setVisibility(View.VISIBLE);
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result", pizzaModel);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                } catch (Exception error) {
                    error.printStackTrace();
                    save_button.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

    private void setFieldData() {
        edit_flavor.setText(pizzaModel.getFlavor());
        edit_ingredients.setText(pizzaModel.getIngredients());
        checkBox_situation.setChecked(pizzaModel.isAvailable());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_edit_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.command_action_delete:
                deleteCommand();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void deleteCommand() {
        //TODO: DELETAR COMANDA
        finish();
    }
}

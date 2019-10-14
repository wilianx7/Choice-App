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
import android.widget.EditText;
import android.widget.ProgressBar;

import com.app.choice.R;
import com.app.choice.administration.model.CommandModel;

public class CommandEdit extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_table;
    private EditText edit_caster;
    private EditText edit_situation;
    private EditText edit_date;
    private Button close_command_button;
    private ProgressBar progressBar;

    private CommandModel commandModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_edit);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.command_edit_toolbar);
        edit_table = findViewById(R.id.command_edit_table);
        edit_caster = findViewById(R.id.command_edit_caster);
        edit_situation = findViewById(R.id.command_edit_situation);
        edit_date = findViewById(R.id.command_edit_date);
        close_command_button = findViewById(R.id.command_edit_button);
        progressBar = findViewById(R.id.command_edit_progressBar);

        /** Toolbar **/
        toolbar.setTitle("Comanda");
        setSupportActionBar(toolbar);

        /** Recuperar comanda selecionada **/
        Intent intent = getIntent();
        commandModel = (CommandModel) intent.getSerializableExtra("command");

        setButtonsActions();
        setFieldData();
    }

    private void setButtonsActions() {
        close_command_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    close_command_button.setVisibility(View.GONE);
                    progressBar.setVisibility(View.VISIBLE);
                    commandModel.setActive(false);
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result", commandModel);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                } catch (Exception error) {
                    error.printStackTrace();
                    close_command_button.setVisibility(View.VISIBLE);
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

    private void setFieldData() {
        // TODO: RECUPERAR TABLE E CASTER CORRETOS
        edit_table.setText(String.valueOf(commandModel.getId()));
        edit_caster.setText(String.valueOf(commandModel.getId()));
        edit_date.setText(android.text.format.DateFormat.format("dd/MM/yyyy hh:mm:ss a", commandModel.getDate()));

        if (commandModel.isActive()) {
            edit_situation.setText("Aberta");
        } else {
            edit_situation.setText("Fechada");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.command_edit_menu, menu);
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

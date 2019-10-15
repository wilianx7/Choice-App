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
import com.app.choice.administration.model.UserModel;

public class UserEdit extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText edit_name;
    private EditText edit_cellphone;
    private EditText edit_email;
    private EditText edit_password;
    private EditText edit_password_confirmation;
    private CheckBox checkBox_situation;
    private Button save_button;
    private ProgressBar progressBar;

    private UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_edit);

        /** Referenciando elementos da view **/
        toolbar = findViewById(R.id.user_edit_toolbar);
        edit_name = findViewById(R.id.user_edit_name);
        edit_cellphone = findViewById(R.id.user_edit_cellphone);
        edit_email = findViewById(R.id.user_edit_email);
        edit_password = findViewById(R.id.user_edit_password);
        edit_password_confirmation = findViewById(R.id.user_edit_password_confirmation);
        checkBox_situation = findViewById(R.id.user_edit_checkbox);
        save_button = findViewById(R.id.user_edit_button);
        progressBar = findViewById(R.id.user_edit_progressBar);

        /** Toolbar **/
        toolbar.setTitle("Edição Funcionário");
        setSupportActionBar(toolbar);

        /** Recuperar funcionário selecionado **/
        Intent intent = getIntent();
        userModel = (UserModel) intent.getSerializableExtra("user");

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
                    returnIntent.putExtra("result", userModel);
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
        edit_name.setText(userModel.getName());
        edit_cellphone.setText(userModel.getCell_phone());
        edit_email.setText(userModel.getLogin_id().toString());
        checkBox_situation.setChecked(userModel.isActive());
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
                deleteUser();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void deleteUser() {
        //TODO: DELETAR FUNCIONÁRIO
        finish();
    }
}

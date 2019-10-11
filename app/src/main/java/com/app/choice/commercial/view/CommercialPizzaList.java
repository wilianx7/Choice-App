package com.app.choice.commercial.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.app.choice.R;
import com.app.choice.commercial.adapter.CommercialPizzaListAdapter;
import com.app.choice.commercial.helper.OnSwipeTouchListener;
import com.app.choice.commercial.model.CommercialPizzaModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CommercialPizzaList extends AppCompatActivity {
    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;

    private ListView listView;
    private ArrayAdapter<CommercialPizzaModel> adapter;
    private OnSwipeTouchListener onSwipeTouchListener;
    private ArrayList<CommercialPizzaModel> pizzasArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_pizza_list);

        // Configurar Toolbar.
        toolbar = findViewById(R.id.pizza_list_toolbar);
        toolbar.setTitle("Rodízio de Pizzas");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.pizza_list_view);
        floatingActionButton = findViewById(R.id.floatingActionButton);

        pizzasArray = new ArrayList<>();
        CommercialPizzaModel model = new CommercialPizzaModel(1, "Calabresa 1", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(1, "Calabresaaa 2", "AAA, BBBB, CCC, DDD, EEE, FFFffffFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(2, "Calabresa 3", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(3, "Calabresa 4", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(4, "Calabresa 5", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(5, "Calabresa 6", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(6, "Calabresa 7", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(7, "Calabresa 8", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(8, "Calabresa 9", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(9, "Calabresa 10", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(10, "Calabresa 11", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);
        model = new CommercialPizzaModel(11, "Calabresa 12", "AAA, BBBB, CCC, DDD, EEE, FFF", true);
        pizzasArray.add(model);

        adapter = new CommercialPizzaListAdapter(CommercialPizzaList.this, pizzasArray);
        listView.setAdapter(adapter);
        onSwipeTouchListener = new OnSwipeTouchListener(CommercialPizzaList.this, listView, adapter);
        listView.setOnTouchListener(onSwipeTouchListener);

        addActionsListener();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_list_pizza_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_help_id:
                openHelpDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addActionsListener() {
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfirmDialog();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openPizzaInformationsDialog(position);
            }
        });
    }

    private void openHelpDialog() {
        AlertDialog.Builder helpDialog = new AlertDialog.Builder(CommercialPizzaList.this, R.style.MyAlertDialogTheme);
        helpDialog.setTitle("Ajuda");
        helpDialog.setCancelable(true);
        helpDialog.setMessage("INCLUIR: deslize o dedo sobre a pizza no sentido direito. \n\n" +
                "EXCLUIR: deslize o dedo sobre a pizza no sentido esquerdo. \n\n" +
                "CONFIRMAR: para confirmar clique no botão flutuante.");

        helpDialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        helpDialog.create();
        helpDialog.show();
    }

    private void openConfirmDialog() {
        AlertDialog.Builder confirmDialog = new AlertDialog.Builder(CommercialPizzaList.this, R.style.MyAlertDialogTheme);
        confirmDialog.setTitle("Confirmar Seleção");
        confirmDialog.setCancelable(true);
        confirmDialog.setMessage("\nDeseja confirmar a seleção?");

        confirmDialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // CONFIRMAR SELEÇÃO
            }
        });

        confirmDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        confirmDialog.create();
        confirmDialog.show();
    }

    private void openPizzaInformationsDialog(int position) {
        AlertDialog.Builder informationsDialog = new AlertDialog.Builder(CommercialPizzaList.this, R.style.MyAlertDialogTheme);
        informationsDialog.setTitle(pizzasArray.get(position).getFlavor());
        informationsDialog.setCancelable(true);

        ImageView pizzaIcon = new ImageView(CommercialPizzaList.this);
        pizzaIcon.setImageResource(R.drawable.white_pizza_icon);
        pizzaIcon.setMaxWidth(400);
        pizzaIcon.setMaxHeight(400);
        pizzaIcon.setMinimumHeight(100);
        pizzaIcon.setMinimumWidth(100);
        pizzaIcon.setAdjustViewBounds(true);
        pizzaIcon.setScaleType(ImageView.ScaleType.FIT_CENTER);

        informationsDialog.setView(pizzaIcon);
        informationsDialog.setMessage("Ingredientes: " + pizzasArray.get(position).getIngredients());


        informationsDialog.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        informationsDialog.create();
        informationsDialog.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        openHelpDialog();
    }
}

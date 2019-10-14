package com.app.choice.administration.view;

import android.os.Bundle;

import com.app.choice.R;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.app.choice.administration.view.Fragments.CommandsFragment;
import com.app.choice.administration.view.Fragments.HomeFragment;
import com.app.choice.administration.view.Fragments.PizzaCastersFragment;
import com.app.choice.administration.view.Fragments.PizzasFragment;
import com.app.choice.administration.view.Fragments.TablesFragment;
import com.app.choice.administration.view.Fragments.TabletsFragment;
import com.app.choice.administration.view.Fragments.UsersFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class AdministrationNavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration_navigation_drawer);
        toolbar = findViewById(R.id.navigation_drawer_toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        toolbar.setTitle("Choice");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.administration_navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            toolbar.setTitle("Choice");
        } else if (id == R.id.nav_table) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TablesFragment()).commit();
            toolbar.setTitle("Mesas");
        } else if (id == R.id.nav_tablet) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TabletsFragment()).commit();
            toolbar.setTitle("Tablets");
        } else if (id == R.id.nav_casters) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PizzaCastersFragment()).commit();
            toolbar.setTitle("Rodízios");
        } else if (id == R.id.nav_commands) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CommandsFragment()).commit();
            toolbar.setTitle("Comandas");
        } else if (id == R.id.nav_pizzas) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PizzasFragment()).commit();
            toolbar.setTitle("Pizzas");
        } else if (id == R.id.nav_employees) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UsersFragment()).commit();
            toolbar.setTitle("Funcionários");
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

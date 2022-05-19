package com.example.pp_mazzucchelli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Bundle bundle = super.getIntent().getExtras();
        String nombre = bundle.getString("nombre", "Nombre default");
        String tipo = bundle.getString("tipo", "Usuario");
        Integer index = bundle.getInt("index", 1);

        Usuario modelo = new Usuario(index, nombre, "", tipo);
        EditController controller = new EditController(modelo);
        EditView view = new EditView(this,modelo, controller);
        controller.setView(view);

        ActionBar acbar = super.getSupportActionBar();
        acbar.setDisplayHomeAsUpEnabled(true);

        view.mostrarModelo();

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
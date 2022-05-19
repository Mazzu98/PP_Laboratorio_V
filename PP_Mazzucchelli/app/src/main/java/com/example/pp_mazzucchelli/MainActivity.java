package com.example.pp_mazzucchelli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AdapterUsuario adapterUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            String tipo;
            if(i%2 == 0){
                tipo = "administrador";
            }
            else {
                tipo = "Usuario";
            }
            usuarios.add(new Usuario(i, "Nombre " + i,  "contra" + i, tipo));
        }

        this.adapterUsuario = new AdapterUsuario(usuarios);

        RecyclerView rv = super.findViewById(R.id.rvUsuarios);
        rv.setAdapter(this.adapterUsuario);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requesCode, int resultCode, Intent data){
        super.onActivityResult(resultCode, resultCode, data);
        if(requesCode == 1){
            Integer index = data.getIntExtra("index",1);
            this.adapterUsuario.notifyItemChanged(index);
        }
    }

//    @Override
//    protected void onResume() {
//
//        this.adapterUsuario.notifyDataSetChanged();
//        super.onResume();
//    }
}
package com.example.pp_mazzucchelli;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class EditController implements View.OnClickListener {

    Usuario u;
    EditView v;

    EditController(Usuario u){
        this.u = u;
    }

    public void setView(EditView v){
        this.v = v;
    }

    @Override
    public void onClick(View view) {

        this.v.cargarModelo();
        if(v.eContrasenia.getText().toString().equals(v.eContrasenia2.getText().toString()) && v.eNombre.getText().toString().length() >= 3 ){
            AdapterUsuario adapterUsuario = new AdapterUsuario();
            adapterUsuario.ActualizarItem(this.u.index, this.u);
            Intent ri = new Intent();
            ri.putExtra("index", this.u.index);
            this.v.a.setResult(Activity.RESULT_OK, ri);
            this.v.a.finish();
        }
    }
}

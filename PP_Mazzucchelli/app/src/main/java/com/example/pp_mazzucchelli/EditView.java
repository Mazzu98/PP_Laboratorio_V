package com.example.pp_mazzucchelli;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditView {

    Activity a;
    Usuario u;
    EditController c;
    EditText eNombre;
    EditText eContrasenia;
    EditText eContrasenia2;
    RadioButton rbAdmin;
    RadioButton rbUsuario;
    RadioGroup rgTipo;

    Button btnGuardar;

    EditView(Activity a, Usuario u, EditController c){
        this.a = a;
        this.u = u;
        this.c = c;
        if(this.eNombre == null){
            this.eNombre = this.a.findViewById(R.id.eNombre);
            this.eContrasenia = this.a.findViewById(R.id.eContrasenia);
            this.eContrasenia2 = this.a.findViewById(R.id.eContrasenia2);
            this.rgTipo = this.a.findViewById(R.id.rgTipo);
            this.btnGuardar = this.a.findViewById(R.id.btnGuardar);
            this.rbAdmin = this.a.findViewById(R.id.rbAdmin);
            this.rbUsuario = this.a.findViewById(R.id.rbUsuario);
            btnGuardar.setOnClickListener(c);
        }
    }
    public void cargarModelo(){

        Integer selectedId =  this.rgTipo.getCheckedRadioButtonId();
        RadioButton rb = a.findViewById(selectedId);

        this.u.nombre = this.eNombre.getText().toString();
        this.u.contrasenia = this.eContrasenia.getText().toString();
        this.u.tipo = rb.getText().toString();
    }

    public void mostrarModelo() {
        this.eNombre.setText(this.u.nombre);
        Log.d("dsds",this.u.tipo);
        if(this.u.tipo.equals("administrador")){
            this.rbAdmin.setChecked(true);
        }else{
            this.rbUsuario.setChecked(true);
        }
    }

}

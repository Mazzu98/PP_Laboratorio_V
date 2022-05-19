package com.example.pp_mazzucchelli;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UsuarioVH extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView tvNombre;
    TextView tvTipo;
    TextView tvContrasenia;
    ImageButton btnEditar;
    View item;

    public UsuarioVH(@NonNull View itemView) {
        super(itemView);
        this.tvNombre = itemView.findViewById(R.id.tvNombre);
        this.tvTipo = itemView.findViewById(R.id.tvTipo);
        this.tvContrasenia = itemView.findViewById(R.id.tvContrasenia);
        this.btnEditar = itemView.findViewById(R.id.btnEdit);
        this.item = itemView.findViewById(R.id.item);
    }

    @Override
    public void onClick(View view) {
        Context context = item.getContext();
        Intent i = new Intent(context,EditActivity.class);

        i.putExtra("index",super.getAdapterPosition());
        i.putExtra("nombre",tvNombre.getText().toString());
        i.putExtra("tipo",tvTipo.getText().toString());
        i.putExtra("contrasenia",tvContrasenia.getText().toString());
        Activity activity = (Activity) context;
        activity.startActivityForResult(i,1);
    }
}

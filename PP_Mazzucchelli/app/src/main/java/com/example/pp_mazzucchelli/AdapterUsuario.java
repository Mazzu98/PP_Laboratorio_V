package com.example.pp_mazzucchelli;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<UsuarioVH> {
    public static List<Usuario> usuarios;

    public AdapterUsuario(){}

    public AdapterUsuario(List<Usuario> usuariuos){
        AdapterUsuario.usuarios = usuariuos;
    }

    @NonNull
    @Override
    public UsuarioVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new UsuarioVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioVH holder, int position) {
        holder.tvNombre.setText(AdapterUsuario.usuarios.get(position).getNombre());
        holder.tvTipo.setText(AdapterUsuario.usuarios.get(position).getTipo());
        holder.btnEditar.setOnClickListener(holder);
    }

    @Override
    public int getItemCount() {
        return AdapterUsuario.usuarios.size();
    }

    public void ActualizarItem(Integer indice, Usuario usuario){
        AdapterUsuario.usuarios.set(indice, usuario);
    }
}

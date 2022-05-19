package com.example.pp_mazzucchelli;

public class Usuario {
    public Integer index;
    public String nombre;
    public String contrasenia;
    public String tipo;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario(){

    }

    public Usuario(String nombre, String contrasenia, String tipo) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }

    public Usuario(Integer index, String nombre, String contrasenia, String tipo) {
        this.index = index;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }
}

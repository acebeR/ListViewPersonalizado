package com.example.uc15101831.listviewpersonalizado01.activity.model;

import java.io.Serializable;

/**
 * Created by uc15101831 on 29/08/2018.
 */

public class Carro implements Serializable {
    private String fabricante;
    private String nome;
    private int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }



    public Carro(String fabricante, String nome, int img){
        this.fabricante = fabricante;
        this.nome = nome;
        this.img = img;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





}

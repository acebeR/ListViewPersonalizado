package com.example.uc15101831.listviewpersonalizado01.activity.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uc15101831.listviewpersonalizado01.R;
import com.example.uc15101831.listviewpersonalizado01.activity.model.Carro;

import java.util.List;

/**
 * Created by UC15101831 on 05/09/2018.
 */

public class AdapterCarro extends BaseAdapter {



    private Activity actitivity;
    private List<Carro> list_carros;

    public AdapterCarro(Activity actitivity, List<Carro> list_carros) {
        this.actitivity = actitivity;
        this.list_carros = list_carros;
    }

    @Override
    public int getCount() {
        return list_carros.size();
    }

    @Override
    public Object getItem(int i) {
        return list_carros.get(i);
    }
    //Dever de Casa
    @Override
    public long getItemId(int i) {
        return 0;
    }

    public void setActitivity(Activity actitivity) {
        this.actitivity = actitivity;
    }

    public void setList_carros(List<Carro> list_carros) {
        this.list_carros = list_carros;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Carro carro = list_carros.get(i);
        //Dever de casa
        view = View.inflate(actitivity, R.layout.layout_list_carrinho, null);

        TextView modelo = view.findViewById(R.id.modelo);
        TextView fabricante = view.findViewById(R.id.fabricante);
        ImageView imgLogo = view.findViewById(R.id.imgCarro);

        modelo.setText(carro.getNome());
        fabricante.setText(carro.getFabricante());
        imgLogo.setImageResource(carro.getImg());

//        if(carro.getNome().equals("gol")){
//            imgLogo.setImageResource(R.drawable.gol);
//
//        }else if(carro.getNome().equals("palio")){
//            imgLogo.setImageResource(R.drawable.palio);
//        }else{
//            imgLogo.setImageResource(R.drawable.uno);
//        }

        return view;
    }
}

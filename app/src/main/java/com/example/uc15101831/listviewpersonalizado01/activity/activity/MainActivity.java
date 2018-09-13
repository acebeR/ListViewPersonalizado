package com.example.uc15101831.listviewpersonalizado01.activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.uc15101831.listviewpersonalizado01.R;
import com.example.uc15101831.listviewpersonalizado01.activity.adapter.AdapterCarro;
import com.example.uc15101831.listviewpersonalizado01.activity.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity  implements AdapterView.OnItemClickListener{

    ListView listView;
    AdapterCarro adapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para criar as rows eu preciso do Adapter
        // O android ja da uma costumização do layout; android.R.layout.simple_list_item_1

        List<Carro> carros = new ArrayList<>();
        carros.add( new Carro("Fiat","Uno",R.drawable.uno));
        carros.add( new Carro("Fiat","Palio",R.drawable.palio));
        carros.add( new Carro("Volkswagen","Gol",R.drawable.gol));

        adapter = new AdapterCarro(this, carros);

        listView = findViewById(R.id.lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView,View view, int i, long l) {
        Carro carro = (Carro) adapter.getItem(i);

        intent = new Intent(this, carroActivity.class);

        intent.putExtra("objCarro", carro);
        startActivity(intent);


        // Pega o nome do componente da lista; listView.getItemAtPosition(i).toString();
//        Toast.makeText(this,carro.getNome().toString(),Toast.LENGTH_LONG).show();
    }





}




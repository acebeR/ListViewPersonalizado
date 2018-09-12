package com.example.uc15101831.listviewpersonalizado01.activity.activity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uc15101831.listviewpersonalizado01.R;
import com.example.uc15101831.listviewpersonalizado01.activity.model.Carro;

public class carroActivity extends AppCompatActivity implements View.OnClickListener{

    Intent intent;
    TextView lbfabricante;
    TextView lbnomecarro;
    ImageView imgCarro;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);


        Intent intent = getIntent();
        Carro carro = (Carro)intent.getSerializableExtra("objCarro");

        lbfabricante = (TextView) findViewById(R.id.lbfabricante);
        lbfabricante.setText(carro.getFabricante());

        lbnomecarro = (TextView) findViewById(R.id.lbnomecarro);
        lbnomecarro.setText(carro.getNome());

        imgCarro = (ImageView) findViewById(R.id.imgCarro);


        imgCarro.setImageBitmap(BitmapFactory.decodeResource(getResources(),carro.getImg()));

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button btn = findViewById(v.getId());


        if(btn != null){
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}

package com.example.indoorpositioning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class APRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apregister);

        //Obtengo los datos del ultimo escaneo para mostrarlos
        Bundle b = getIntent().getExtras();
        ArrayList<String> availableNetworks;

        if(b!=null){
            availableNetworks = new ArrayList<>(b.getStringArrayList("availableNetworks"));
        }else{
            availableNetworks = new ArrayList<>();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, availableNetworks);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = findViewById(R.id.spinnerAP);
        sItems.setAdapter(adapter);
    }


}

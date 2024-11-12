package com.jah.listado_ccaa_provincias;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lvComunidad, lvProvincias;
    ArrayAdapter<String> adaptadorComunidades;
    ArrayAdapter<String> adaptadorProvincias;
    TextView lblProvincia;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initComponents();

        lvComunidad.setOnItemClickListener((adapterView, view, index, l) -> verProvincias(index));
        lvProvincias.setOnItemClickListener((adapterView, view, indexComunidad, l) -> infoProvincias(indexComunidad));

    }
    /*Recogemos la información necesaria para pasar a la siguiente activity y mostrar la pagina wikipedia en una WebView.
    * Usamos el indice del ArrayAdapter y cogemos el cotenido en formato string de la ListView que hemos pulsado.*/
    private void infoProvincias(int indexComunidad) {
        Intent infoProvincia = new Intent(getApplicationContext(), wikipediaProvincia.class);
        String str = adaptadorProvincias.getItem(indexComunidad).toString();
        url += str;

        infoProvincia.putExtra("url", url);
        url = "https://es.wikipedia.org/wiki/";
        startActivity(infoProvincia);
    }
    //Hacemos visible la lista de las provincias en función de cual pulsemos.
    private void verProvincias(int index) {
        switch (index){
            case 0:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.andalucia));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 1:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.aragon));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 2:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.asturias));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 3:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cantabria));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 4:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.castila_la_mancha));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 5:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.castilla_leon));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 6:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cataluña));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 7:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.extremadura));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 8:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pais_vasco));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 9:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.valencia));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 10:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.murcia));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
            case 11:
                lblProvincia.setText(getString(R.string.lbl_provincias) + " " + adaptadorComunidades.getItem(index));
                adaptadorProvincias = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.galicia));
                lvProvincias.setAdapter(adaptadorProvincias);
                break;
        }
    }
    //Inicio de los componentes de la app.
    private void initComponents() {
        lvComunidad = findViewById(R.id.lvComunidad);
        lvProvincias = findViewById(R.id.lvProvincias);
        lblProvincia = findViewById(R.id.lblProvincia);
        adaptadorComunidades = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.comunidades_autonomas));
        lvComunidad.setAdapter(adaptadorComunidades);
        url = "https://es.wikipedia.org/wiki/";
    }
}
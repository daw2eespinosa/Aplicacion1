package com.eduardoespinosa.aplicacion1;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by eduardo on 12/11/15.
 */
public class Puntuaciones extends ListActivity {
    @Override
/*    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                Localizacion.almacen.listaPuntuaciones(10)));
    }*/
/*    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.elemento_lista,
        R.id.titulo1,
                Localizacion.almacen.listaPuntuaciones(10)));
    } */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);
        setListAdapter(new MiAdaptador(this,
                Localizacion.almacen.listaPuntuaciones(10)));
    }

}

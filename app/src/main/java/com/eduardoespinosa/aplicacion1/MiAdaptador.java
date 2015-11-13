package com.eduardoespinosa.aplicacion1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Vector;

/**
 * Created by eduardo on 12/11/15.
 */
public class MiAdaptador extends BaseAdapter {
    private final Activity actividad;
    private final Vector<String> lista;

    public MiAdaptador(Activity actividad, Vector<String> lista) {
        super();
        this.actividad = actividad;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.elementAt(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Toast


        LayoutInflater inflater = actividad.getLayoutInflater();
        View view = null;
        if (convertView == null) {
            view = inflater.inflate(R.layout.elemento_lista, null, true);
//            Toast.makeText(actividad, Integer.toString(position) , Toast.LENGTH_SHORT).show();
        } else {
            view = convertView;
        }
        TextView textView = (TextView) view.findViewById(R.id.titulo1);
        textView.setText(lista.elementAt(position));
        ImageView imageView = (ImageView) view.findViewById(R.id.icono);
        switch (Math.round((float) Math.random() * 3)) {
            case 0:
                imageView.setImageResource(R.drawable.asteroide1);
                break;
            case 1:
                imageView.setImageResource(R.drawable.asteroide2);
                break;
            default:
                imageView.setImageResource(R.drawable.asteroide3);
                break;
        }
        return view;
    }
}

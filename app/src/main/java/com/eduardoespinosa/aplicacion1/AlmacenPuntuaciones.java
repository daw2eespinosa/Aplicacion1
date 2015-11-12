package com.eduardoespinosa.aplicacion1;

import java.util.Vector;

/**
 * Created by eduardo on 12/11/15.
 */
public interface AlmacenPuntuaciones {
    public void guardarPuntuacion(int puntos, String nombre, long datos);
    public Vector<String> listaPuntuaciones(int cantidad);
}

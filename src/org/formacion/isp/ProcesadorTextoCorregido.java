package org.formacion.isp;


public class ProcesadorTextoCorregido extends ProcesadorTextoSimple implements Compleja {

    @Override
    public boolean correcto (Idioma idioma) {
        for (String palabra: texto) {
            if (! idioma.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
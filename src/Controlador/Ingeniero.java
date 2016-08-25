package Controlador;

import java.util.GregorianCalendar;

public class Ingeniero {

    public static boolean Edad(String Fecha) {
        int y = Integer.parseInt(Fecha.substring(6, 10));
        int m = Integer.parseInt(Fecha.substring(3, 5));
        int d = Integer.parseInt(Fecha.substring(0, 2));
        GregorianCalendar fechaActual = new GregorianCalendar();
        int y2 = fechaActual.get(GregorianCalendar.YEAR);
        int m2 = fechaActual.get(GregorianCalendar.MONTH);
        int d2 = fechaActual.get(GregorianCalendar.DAY_OF_MONTH);
        int annos = (y2 - y - 1) + (m2 == m ? (d2 >= d ? 1 : 0) : m2 >= m ? 1 : 0);
        if(annos >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}

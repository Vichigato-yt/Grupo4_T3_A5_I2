
package paquete;


public class Modelo {
    private String Perros [];
    private int linea;
    private int dato;

    public String[] getPerros() {
        return Perros;
    }

    public void setPerros(String[] Perros) {
        this.Perros = Perros;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    public void CreaVector(int linea) {
        this.linea = linea;
        Perros = new String[linea];
        System.out.println("Vector creado con tamaño: " + linea);
    }    
       public boolean IngresoDatos(String dato, int posicion) {
        if (Perros == null) {
            System.out.println("Error: No se ha creado el vector.");
            return false;
        }
        if (posicion >= 0 && posicion < linea) {
            Perros[posicion] = dato;
            System.out.println("Dato ingresado en posición " + posicion + ": " + dato);
            return true;
        } else {
            System.out.println("Error: Posición fuera del rango.");
            return false;
        }
    }
}

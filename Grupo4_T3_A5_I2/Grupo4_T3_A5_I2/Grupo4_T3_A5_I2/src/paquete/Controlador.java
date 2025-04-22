package paquete;
//importo el menu principal
import Vista.Principal;
//importo los JPanel del menu AYUDA
import Vista.Acercade;
import Vista.Intructivo;
//Importo los jPanel del menu OPCIONES
import Vista.Lista;
import Vista.Agregar;
import Vista.Adoptar;
//importo ActionEvent
import java.awt.event.ActionEvent;
//importo ActionListener para poder escuchar lo que hace
import java.awt.event.ActionListener;
    
public class Controlador implements ActionListener{
    //se encarga de recibir desde la vista y enviar al modelo
    //ATRIBUTOS
    //Objeto Vista para la Vista MVC
    private Principal $Principal;
    private Acercade $Acerca;
    private Intructivo $Instructivo;
    private Lista $Lista;
    private Agregar $Agregar;
    private Adoptar $Adoptar;    
    //Objeto Modelo para el Modelo MVC
    private Modelo $objModelo;
    String r;
    
    public Controlador(Acercade $Acerca,Principal $Principal, Modelo $objModelo,Intructivo $Instructivo,
                        Lista $Lista, Agregar $Agregar,Adoptar $Adoptar) {
        this.$Principal = $Principal;
        this.$Acerca = $Acerca;
        this.$Instructivo = $Instructivo;
        this.$Lista = $Lista;
        this.$Agregar = $Agregar;
        this.$Adoptar = $Adoptar;
        this.$objModelo = $objModelo;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object botonPresionado = e.getSource();
        
    }
}
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
        this.$Principal.mAcerca.addActionListener(this);
        this.$Principal.mAdoptar.addActionListener(this);
        this.$Principal.mInstructivo.addActionListener(this);
        this.$Principal.mLista.addActionListener(this);
        this.$Principal.mInstructivo.addActionListener(this);
        this.$Principal.mAcerca.addActionListener(this);
        this.$Acerca.btnCerrar.addActionListener(this);
        this.$Instructivo.btnCerrar.addActionListener(this);
        this.$Agregar.btnEnviar.addActionListener(this);
        this.$Adoptar.btnCerrar.addActionListener(this);
        this.$Lista.btnCerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object botonPresionado = e.getSource();
        if (e.getSource() == $Principal.mAcerca) {
            $Acerca.setVisible(true);
        }

        // Menú: Instructivo
        if (e.getSource() == $Principal.mInstructivo) {
            $Instructivo.setVisible(true);
        }

        // Menú: Agregar perro
        if (e.getSource() == $Principal.mAgregar) {
            $Agregar.setVisible(true);
        }

        // Menú: Adoptar perro
        if (e.getSource() == $Principal.mAdoptar) {
            $Adoptar.setVisible(true);
        }

        // Menú: Ver lista
        if (e.getSource() == $Principal.mLista) {
            $Lista.setVisible(true);
        }

        // Botón: Cerrar Acerca
        if (e.getSource() == $Acerca.btnCerrar) {
            $Acerca.setVisible(false);
        }

        // Botón: Cerrar Instructivo
        if (e.getSource() == $Instructivo.btnCerrar) {
            $Instructivo.setVisible(false);
        }

        // Botón: Enviar (Agregar)
        if (e.getSource() == $Agregar.btnEnviar) {
            
        }

        // Botón: Adoptar
        if (e.getSource() == $Adoptar.EnvioAdopcion) {
            
        }

        // Botón: Cerrar Adoptar
        if (e.getSource() == $Adoptar.btnCerrar) {
            $Adoptar.setVisible(false);
        }

        // Botón: Cerrar Lista
        if (e.getSource() == $Lista.btnCerrar) {
            $Lista.setVisible(false);
        }
    }

    }

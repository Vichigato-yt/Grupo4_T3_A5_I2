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
     public void actionPerformed(ActionEvent e) {
        // Se maneja el evento según el origen del evento
        if (e.getSource() == $Principal.mAcerca) {
            $Acerca.setVisible(true);
        }
        if (e.getSource() == $Principal.mAdoptar) {
            $Adoptar.setVisible(true);
        }
        if (e.getSource() == $Principal.mInstructivo) {
            $Instructivo.setVisible(true);
        }
        if (e.getSource() == $Principal.mLista) {
            $Lista.setVisible(true);
        }
        if (e.getSource() == $Principal.mAgregar) {
            $Agregar.setVisible(true);
        }
        if (e.getSource() == $Acerca.btnCerrar || e.getSource() == $Instructivo.btnCerrar ||
            e.getSource() == $Adoptar.btnCerrar || e.getSource() == $Lista.btnCerrar) {
            // Cerrar las ventanas
            ((javax.swing.JFrame) ((javax.swing.JButton) e.getSource()).getTopLevelAncestor()).setVisible(false);
        }
        if (e.getSource() == $Agregar.btnEnviar) {
            // Obtener el nombre del perro desde el text field y agregarlo al modelo
            String nombrePerro = $Agregar.txtNombre.getText();
            int posicion = $objModelo.getDato();
            if ($objModelo.IngresoDatos(nombrePerro, posicion)) {
                // Aumentar el dato (número de perro ingresado) en el modelo
                $objModelo.setDato(posicion + 1);
            }
        }
        if (e.getSource() == $Adoptar.btnCerrar) {
            // Adoptar el perro
            try {
                int posicion = Integer.parseInt($Adoptar.txtCelda.getText());
                if (posicion >= 0 && posicion < $objModelo.getLinea()) {
                    String nombrePerro = $objModelo.getPerros()[posicion];
                    $Adoptar.lblNombre.setText("Perro adoptado: " + nombrePerro);
                    $objModelo.Adoptar(nombrePerro, posicion);
                } else {
                    $Adoptar.lblNombre.setText("Posición inválida.");
                }
            } catch (NumberFormatException ex) {
                $Adoptar.lblNombre.setText("Ingrese un número válido.");
            }
        }
    }
}

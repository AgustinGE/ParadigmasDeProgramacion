import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OperacionesAritmeticas {
    private Frame fr_ventana; //ventana
    private JLabel lblInstruccion, lblNum1, lblNum2, lblResultado; // parte de las instrucciones
    private JTextField JtfNum1, JtfNum2, JtfResultado; //cuadros para escribir
    private JCheckBox cbSumar, cbRestar, cbMultiplicar, cbDividir; //botones
    private CheckboxGroup radio;
    private Panel pnlSuperior, pnlCentral, pnlInferior, pnlOpciones;
    private JButton bCalcular, bSalir;
  
    public OperacionesAritmeticas(){
        fr_ventana = new Frame("Operaciones aritmeticas");

        lblInstruccion = new JLabel("<html>Ingresa dos numeros y da clik en el boton sumar para realizar la operacion <html>"); //html es para dar formato basico a ietos componentes
        lblNum1 = new JLabel("NumeroA: ");
        lblNum2 = new JLabel("NumeroB: ");
        lblResultado = new JLabel("Resultado: ");

        JtfNum1 = new JTextField(5);
        JtfNum2 = new JTextField(5);
        JtfResultado = new JTextField(10);
        JtfResultado.setEditable(false);


        cbSumar = new JCheckBox("Sumar", true);
        cbRestar = new JCheckBox("Restar");
        cbMultiplicar = new JCheckBox("Multiplicar");
        cbDividir = new JCheckBox("Dividir");

        pnlSuperior = new Panel();
        pnlCentral = new Panel();
        pnlOpciones = new Panel();
        pnlInferior = new Panel();


    }

    public void acomodarEnVentana(){ //para especificar una plantilla se necesita un layout con contenedores o bien panels
        
        fr_ventana.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(-1);
            }
        });
        

        pnlSuperior.add(lblInstruccion);
        fr_ventana.add(pnlSuperior, BorderLayout.NORTH); //Aqui este esquema es para ordenar en superior, inferior, este, oeste y centro
        
        pnlCentral.setLayout(new GridLayout(3,2)); //Este layout permite dividir en filas y columnas
        pnlCentral.add(lblNum1);
        pnlCentral.add(JtfNum1);
        pnlCentral.add(lblNum2);
        pnlCentral.add(JtfNum2);
        pnlCentral.add(lblResultado);
        pnlCentral.add(JtfResultado);
        fr_ventana.add(pnlCentral, BorderLayout.CENTER);

        pnlOpciones.add(cbSumar);
        pnlOpciones.add(cbRestar);
        pnlOpciones.add(cbMultiplicar);
        pnlOpciones.add(cbDividir);

        fr_ventana.add(pnlInferior, BorderLayout.SOUTH);

        

        fr_ventana.setSize(500,300);    
        fr_ventana.setVisible(true);
    }

    //boton sumar    
    class ManejadorBotonSumar implements ActionListener{

        @Override 
        public void actionPerformed (java.awt.event.ActionEvent actionEvent){
            double num1,num2, resultado;

            num1 = Double.valueOf(JtfNum1.getText());
            num2 = Double.valueOf(JtfNum2.getText());

            resultado = num1 + num2;

            JtfResultado.setText(String.valueOf(resultado));
            //otra forma es JtfResultado.setText(Double.toString(resultado));
        }
    } 

    //boton cerrar
    class ManejadorBotonCerrar implements ActionListener{
        @Override 

        public void actionPerformed(java.awt.event.ActionEvent actionEvent){
            System.exit(-1);
        }
    }



    public static void main(String[] args) {
        OperacionesAritmeticas IguOperaciones = new OperacionesAritmeticas();
        IguOperaciones.acomodarEnVentana();
    }
}

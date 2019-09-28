package org.edu.ito.Ejemplo;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hola mundo" );
        //String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        //JOptionPane.showMessageDialog(null, "Bienvenido: "+nombre);
        int resultado=0; 
        int a=10;
        int b=20;
        resultado=a + b;
        System.out.println( resultado );
        
        Calculadora calculadora=new Calculadora();
        System.out.println( calculadora.suma(100, 50) );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_14;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp;
        temp = Float.parseFloat(JOptionPane.showInputDialog("Introduce unha temperatura"));
        conversorTemperaturas conv = new conversorTemperaturas();
        
        
        try{
        conv.centigradosAFharenheit(temp);
        
        }catch(errorExcepcion error2){
            System.out.println("Opcion no valida"+ error2.getMessage());
        }
        conv.centigradosAReamur(temp);
      
    }
    
}

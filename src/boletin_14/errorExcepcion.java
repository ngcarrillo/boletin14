/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_14;

/**
 *
 * @author ngarciacarrillo
 */
public class errorExcepcion extends Exception{

    public errorExcepcion() {
        super("mensaxe por defecto:temperatura ten que ser naior que 80ºC");//mensaxe por defecto
    }
    public errorExcepcion(String mensaxe){//usamolo cando queremos dar unha mensaxe personalizada
        super(mensaxe);
    }
}
    
    
    


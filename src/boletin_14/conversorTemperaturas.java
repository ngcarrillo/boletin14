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
public class conversorTemperaturas {
    private final static float MINTEMP=80;
    private double remur, fha;
    private double tempCen;
    
    public void centigradosAFharenheit(double tempCen)throws errorExcepcion{
    this.tempCen=tempCen;
    if (tempCen>MINTEMP){
        throw new errorExcepcion ("A temperatura ten que ser mayor de 80");
    }else{
    fha = 9.0/5.0 * tempCen + 32.4;
    } 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

/**
 *
 * @author Windows 7
 */
public class ConverterData {
    
    public static String conversao(String data){
       String dia = data.substring(0, 2);
       String mes = data.substring(3, 5);
       String ano = data.substring(6, 10);
       return ano +"-" + mes + "-" + dia ;
       
    }
}

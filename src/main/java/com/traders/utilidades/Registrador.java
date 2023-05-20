/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import com.traders.models.Ocorrencias;
import java.util.ArrayList;

/**
 *
 * @author Windows 7
 */
public class Registrador {
    public static ArrayList<Object> lista = new ArrayList<>();
    
    
    public static void adicionar(Ocorrencias oc){
       if(lista.contains(oc.get_Id()) == true){
           
       }else{
           lista.add(oc.get_Id());
       }
    }
    
    public static Boolean verifica(Ocorrencias oc){
        if(lista.contains(oc.get_Id()) == true){
            return true;
        }else{
            return false;
        }
    }
}

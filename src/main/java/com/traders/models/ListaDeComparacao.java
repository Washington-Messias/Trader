/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Windows 7
 */
public class ListaDeComparacao {
    
    public static Set<DadosOcorrencia> list = new LinkedHashSet<DadosOcorrencia>();
    
    
    public static void adicionar(DadosOcorrencia oc){
        if(list.contains(oc.getId()) == true){
            
        }else{
            list.add(oc);
        }
    }
}

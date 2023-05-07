/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;

import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author Windows 7
 */
public class ListaDeComparacao {
    
    public Set<DadosOcorrencia> lista = new HashSet<>();
    
    public  void adicionar(DadosOcorrencia oc){
        if(lista.contains(oc) == true){
            
        }else{
            lista.add(oc);
        }
    }
    
public Set<DadosOcorrencia> conteudo(){
    Set<DadosOcorrencia> list = new HashSet<>();
    
    for(DadosOcorrencia oc : lista){
        if(list.contains(oc) == true){
            
        }else{
            list.add(oc);
        }
    }
    return list;
}
    
}

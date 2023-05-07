/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Windows 7
 */
public class Observation {
   private ArrayList<Ocorrencias> registros = new ArrayList<>();
    
    
    public Observation(){};
    
    public void adicionar(Ocorrencias oc){
        if(registros.contains(oc) == true){
            
        }else{
            registros.add(oc);
        }
    }
    
    public Boolean verifica(Ocorrencias oc){
     if(registros.contains(oc) == true){
         return true;
     }else{
         return false;
     }
                                       
    }
    
    public Integer tamanho(){
        int tamanho = registros.size();
        return tamanho;
    }
    
    /*
 public static ArrayList<DadosOcorrencia> filtro = new ArrayList<>();
    
    public static void adicionar(DadosOcorrencia oc){
        if(filtro.contains(oc) == true){
            
        }else{
            filtro.add(oc);
        }
    }
    
    public static Integer tamanho(){
       if(filtro.isEmpty() == true){
           return 0;
       }else{
           int size = filtro.size();
           return size;
       }
    }
    
    public static void remover(DadosOcorrencia oc){
        if(filtro.contains(oc) == true){
            filtro.remove(oc);
        }
    }
    
    public static Boolean verificar(DadosOcorrencia oc){
        if(filtro.contains(oc) == true){
            return true;
    }else{
            return false;
        }
   
    }
*/
}
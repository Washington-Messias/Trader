/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

/**
 *
 * @author Windows 7
 */
public class ConfigurandoNomeParaDB {
    
    
    public String alterar(String nome){
        if(nome == "fundo30"){
            String nm = "fundo de trinta";
            return nm;
        }else if(nome == "topo30"){
        String nm = "topo de trinta";
        return nm;
        }else if(nome == "fundo30 - diario"){
            String nm = "fundo de trinta diario";
            return nm;
        }else if(nome == "topo30 - diario"){
            String nm = "topo de trinta diario";
            return nm;
        }else {
            return nome;
        }
        
    
}
}
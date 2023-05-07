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
public class MelhoresAproveitamento {

public Set<DadosOcorrencia> lista = new LinkedHashSet<DadosOcorrencia>();

public void adicionar(DadosOcorrencia docc){
    if(lista.contains(docc) == true){
        
    }else {
        lista.add(docc);
    }
}
    
}

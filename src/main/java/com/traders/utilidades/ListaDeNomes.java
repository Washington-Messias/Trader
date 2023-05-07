/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import com.traders.models.Ocorrencias;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Windows 7
 */

/*
*classe que tem como bojetivo retornar uma lista de nome conforme o filtro deste para funções futuras
*/
public class ListaDeNomes {


    public Set<Ocorrencias> lista(Set<Ocorrencias> ocor, String nome){
Set<Ocorrencias> list = new LinkedHashSet<Ocorrencias>();
        
        List<Ocorrencias> name = ocor.stream()
                .filter(o -> o.getNome().contentEquals(nome) == true)
                .toList();
        list.addAll(name);
        return list;
        
    }
    
}

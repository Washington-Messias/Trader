/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;


import com.traders.models.Ocorrencias;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.swing.JLabel;

/**
 *
 * @author Windows 7
 */
public class ManipulandoHora {

    public Set<Ocorrencias> ocorrencia = new LinkedHashSet<Ocorrencias>();
      Set<Ocorrencias> grafic = new LinkedHashSet<Ocorrencias>();
    
    
    
    
    public Set<Ocorrencias> nove(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> nine = o -> o.getHora() == 9 ? true : false;
      

        List<Ocorrencias> filtro = ocor.stream()
                .filter(nine)
                .toList();

   

       

       
        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
           grafic.clear();
           

            grafic.addAll(filtro);
        }

        return grafic;
    }

    public Set<Ocorrencias> dez(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> teen = o -> o.getHora() == 10 ? true : false;
    

        List<Ocorrencias> filtro = ocor.stream()
                .filter(teen)
                .toList();

     
        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
        grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;

    }

    public Set<Ocorrencias> onze(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> eleveen = o -> o.getHora() == 11 ? true : false;
        

        List<Ocorrencias> filtro = ocor.stream()
                .filter(eleveen)
                .toList();

        

        
        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
           grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;

    }

    public Set<Ocorrencias> doze(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> twoeveen = o -> o.getHora() == 12 ? true : false;
      

        List<Ocorrencias> filtro = ocor.stream()
                .filter(twoeveen)
                .toList();

        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
          grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;
    }

    public Set<Ocorrencias> treze(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> torteen = o -> o.getHora() == 13 ? true : false;
      

        List<Ocorrencias> filtro = ocor.stream()
                .filter(torteen)
                .toList();

        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
        grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;
    }

    public Set<Ocorrencias> quatorze(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> forteen = o -> o.getHora() == 14 ? true : false;
       

        List<Ocorrencias> filtro = ocor.stream()
                .filter(forteen)
                .toList();

       
        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
             grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;
    }

    public Set<Ocorrencias> quinze(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> fiveteen = o -> o.getHora() == 15 ? true : false;
       

        List<Ocorrencias> filtro = ocor.stream()
                .filter(fiveteen)
                .toList();

        if (grafic.isEmpty() == true) {
            grafic.addAll(filtro);
        } else {
        grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;
    }

    public Set<Ocorrencias> dezesseis(Set<Ocorrencias> ocor) {
        Predicate<Ocorrencias> sixteen = o -> o.getHora() == 16 ? true : false;
     

        List<Ocorrencias> filtro = ocor.stream()
                .filter(sixteen)
                .toList();

       
        if (grafic.isEmpty() == true) {
            
        } else {
            grafic.clear();

            grafic.addAll(filtro);
        }

        return grafic;
    }



}

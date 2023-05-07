/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import com.traders.controllers.ConsultarDB;
import com.traders.models.Ocorrencias;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 *
 * @author Windows 7
 */
public class FiltroResultado {
  
    
    
    Set<Ocorrencias> result = new LinkedHashSet<Ocorrencias>();
    Set<Ocorrencias> ultimo = new LinkedHashSet<Ocorrencias>();
    Set<Ocorrencias> end = new LinkedHashSet<Ocorrencias>();
    Hora hrs = new Hora();
    ManipulandoDias dias = new ManipulandoDias();
   ConsultarDB consulta = new ConsultarDB();
    
    public Set<Ocorrencias> semana( ){
result.clear();
end.clear();
      
        result = consulta.retornarFiltro();
        end = dias.umaSemana(result);
     
        
      
       
  
    //retorna o parametro set<> já preenchido com dados
       return end;
    }
    
   public Set<Ocorrencias> mes(){
      
      result.clear();
       end.clear();
       
       result = consulta.retornarFiltro();
       end = dias.umMes(result);
       
       
       
       //retornar o set<> passado comoparametro já preenchido com dados
       return end;
   }
   
  public Set<Ocorrencias> tresMeses(){
     
        result.clear();
       end.clear();
       
       result = consulta.retornarFiltro();
       end = dias.tresMeses(result);
       
       
      
       //retorna o parametro set<> já preenchido com dados
       
      return end;
   }
   
   public Set<Ocorrencias> seisMeses(){
      
         result.clear();
       end.clear();
       
       result = consulta.retornarFiltro();
       end = dias.seisMeses(result);
       
       
       
       
       //retorna o parametro set<> já preenchido com dados
       return end;
   }
   
   public Set<Ocorrencias> ano(){
      
         result.clear();
       end.clear();
       
       result = consulta.retornarFiltro();
       end = dias.umAno(result);
       
       
       
       
       //retorna o parametro set<> já preenchido com dados
       return end;
   }
}

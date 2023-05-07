/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import com.traders.models.DadosOcorrencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import com.traders.models.ListaDeComparacao;
import java.util.LinkedHashSet;

/**
 *
 * @author Windows 7
 */
/*
*classe que tem a finalidade de decidir qual a melhor ocorrencia e qual a que se destacaria por relevancia que terá o criterio de quantidade de ocôrrencias
 */
public class Relevancia {
    ListaDeComparacao guarde = new ListaDeComparacao();
    /*
    *o metódo "melhor" pega os DadosOcorrencia que são de maior quantidade e retorna aquel que tiver o melhor percentual de acerto.
    *este metódo normalmente usará na classe executora o retorno do metódo "maiorQTD".
    */
    
    public DadosOcorrencia melhor(Set<DadosOcorrencia> ocor) {
        
        DadosOcorrencia dados = null;
        
 dados = this.maiorPercentoAcerto(ocor);
   
   return dados;
        

    }

    public DadosOcorrencia destaque(Set<DadosOcorrencia> ocor) {
        DadosOcorrencia dados = null;
        int quantidade = 0;
        double percento = 0;

        if (!ocor.isEmpty()) {
            for (DadosOcorrencia oc : ocor) {
           if(oc.getPercentualAcertos() > percento){
               percento = oc.getPercentualAcertos();
               dados = oc;
           }
            }

        }
        return dados;
    }

    public DadosOcorrencia pior(Set<DadosOcorrencia> ocor) {
        double erro = 0;
        int quantidade = 0;
        DadosOcorrencia dados = null;
        for (DadosOcorrencia oc : ocor) {
            if (oc.getPercentualErros() > erro) {
                erro = oc.getPercentualErros();
                if (oc.getQuantidade() > quantidade) {
                    quantidade = oc.getQuantidade();
                    dados = oc;
                }
            }
        }
        return dados;
    }
    
 public Set<DadosOcorrencia> maiorQTD(Set<DadosOcorrencia> ocor){
    Set<DadosOcorrencia> lista = new LinkedHashSet<DadosOcorrencia>();
    int quantidade = 0;
     for(DadosOcorrencia oc: ocor){
         if(oc.getQuantidade() > quantidade){
             quantidade = oc.getQuantidade();
             lista.add(oc);
         }
     }
     return lista;
 }
 
 private DadosOcorrencia maiorPercentoAcerto(Set<DadosOcorrencia> ocor){
     DadosOcorrencia dados = null;
     double percento = 0;
     
     for(DadosOcorrencia oc: ocor){
         if(oc.getPercentualAcertos() > percento){
        percento = oc.getPercentualAcertos();
        dados = oc;
         }else if(oc.getPercentualAcertos() == percento){
             guarde.lista.add(oc);
         }
     }
     return dados;
 }
}

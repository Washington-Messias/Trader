/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;

import java.util.Set;
import com.traders.utilidades.metematicaDO.mateDO;
import javax.swing.JOptionPane;
/**
 *
 * @author Windows 7
 */
public class ModeloResumo {
   
    
    public DadosOcorrencia resumo(Set<Ocorrencias> ocor, String nome, int hora){
        int horas = 0;
        int ranger4 = 0;
        int ranger6 = 0;
        int rangerNulo = 0;
        int todosRanger = 0;
        int acertos = 0;
        int erros = 0;
        int pontos = 0;
        int semPontos = 0;
        int todosPontos = 0;
        int quantidade = 0;
        double total = 0;
        double tlPontos = 0;
        double tlSemPontos = 0;
        double tlRanger4 = 0;
        double tlRanger6 = 0;
        double tlRangerNulo = 0;
        double tlErros = 0;
    //try{
 
       pontos = mateDO.pontos(ocor);
       semPontos = mateDO.semPontos(ocor);
       todosPontos = mateDO.todosPontos(ocor);
        ranger4 = mateDO.ranger4(ocor);
        ranger6 = mateDO.ranger6(ocor);
        rangerNulo = mateDO.rangerNulo(ocor);
        todosRanger = mateDO.todosRanger(ocor);
        horas = hora;
        tlRanger4 = mateDO.percentoRanger4(ocor);
        tlRanger6 = mateDO.percentoRanger6(ocor);
        tlRangerNulo = mateDO.percentoRangerNulo(ocor);
        tlPontos = mateDO.porcentoPontos(ocor);
        tlSemPontos = mateDO.porcentoSemPonto(ocor);
        acertos = mateDO.acertos(ocor);
        erros = mateDO.erros(ocor);
        quantidade = ocor.size();
        total = mateDO.porcentagemAcertos(ocor);
        tlErros = mateDO.porcentagemErros(ocor);

        
    DadosOcorrencia dados = new DadosOcorrencia(nome, hora, quantidade, acertos, erros, ranger4, ranger6, rangerNulo, todosRanger, pontos, semPontos,  todosPontos, total, tlErros, tlRanger4, tlRanger6, tlRangerNulo, tlPontos, tlSemPontos);
    
    
    return dados;
    //}catch(Exception e){
        //JOptionPane.showMessageDialog(null, "Erro na tranformaÃ§Ã£o de dados: " +e);
   // }
    //return null;
    }
    
   
}

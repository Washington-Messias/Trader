/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.utilidades;

import java.util.function.Function;

/**
 *
 * @author Windows 7
 */
public class Hora {

    Function<String, Integer> todos = o -> o.contains("Todos") ? 1 : 0;
    Function<String, Integer> nove = o -> o.contains("9 H") ? 9 : 0;
    Function<String, Integer> dez = o -> o.contains("10 H") ? 10 : 0;
    Function<String, Integer> onze = o -> o.contains("11 H") ? 11 : 0;
    Function<String, Integer> doze = o -> o.contains("12 H") ? 12 : 0;
    Function<String, Integer> treze = o -> o.contains("13 H") ? 13 : 0;
    Function<String, Integer> quatorze = o -> o.contains("14 H") ? 14 : 0;
    Function<String, Integer> quinze = o -> o.contains("15 H") ? 15 : 0;
    Function<String, Integer> dezesseis = o -> o.contains("16 H") ? 16 : 0;

  public Integer resultados(String h){
      if(todos.apply(h) == 1){
          return 1;
      }else if(nove.apply(h) == 9){
          return 9;
      }else if(dez.apply(h) == 10){
          return 10;
      }else if(onze.apply(h) == 11){
          return 11;
      }else if(doze.apply(h) == 12){
          return 12;
      }else if(treze.apply(h) == 13){
          return 13;
      }else if(quatorze.apply(h) == 14){
          return 14;
      }else if (quinze.apply(h) == 15){
          return 15;
      }else if(dezesseis.apply(h) == 16){
          return 16;
      }else {
          return null;
      }
  }
}

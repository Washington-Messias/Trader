/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;

import java.util.Date;

/**
 *
 * @author Windows 7
 */
public class Ocorrencias {
    private Object _id;
    private String nome;
    private String acertou;
    private String ranger;
   private String ponto;
   private String data;
   private int hora;
   private long resultado;

    public Ocorrencias(Object id, String nome, String acertou, String ranger, String ponto,int hora, String data) {
        this.set_Id(id);
        this.setNome(nome);
        this.setAcertou(acertou);
        this.setRanger(ranger);
        this.setPonto(ponto); 
        this.setHora(hora);
        this.setData(data);
    }

      public Ocorrencias(Object id, String nome, String acertou, String ranger, String ponto,int hora, String data, long resultado){
           this.set_Id(id);
        this.setNome(nome);
        this.setAcertou(acertou);
        this.setRanger(ranger);
        this.setPonto(ponto);
        this.setHora(hora);
        this.setData(data);
        this.setResultado(resultado);
      }
    
    public Ocorrencias() {
    }

   
   
   
    public Object get_Id() {
        return _id;
    }

    public void set_Id(Object id) {
        this._id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAcertou() {
        return acertou;
    }

    public void setAcertou(String acertou) {
        this.acertou = acertou;
    }

    public String getRanger() {
        return ranger;
    }

    public void setRanger(String ranger) {
        this.ranger = ranger;
    }

    public String getPonto() {
        return ponto;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    

    public Long getResultado() {
        return resultado;
    }

    public void setResultado(long resultado) {
        this.resultado = resultado;
    }
    
    

    @Override
    public String toString() {
        return   "_id=" + _id + ", nome= " + nome + ", acertou= " + acertou + ", range= " + ranger + ", ponto= " + ponto + ", hora= " + hora + ", data= " + data ;
    }
   
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.traders.models;

/**
 *
 * @author Windows 7
 */
/*
*classe responsável por tratar o resultado de um conjunto de ocorrencia com base no seu nome, guardado todo o dados já minerados e pronto para o usuario.
 */
public class DadosOcorrencia {
    
    private String nome;
    private int hora = 0;
    private int quantidade = 0;
    private int acertos = 0;
    private int erros = 0;
    private int range4 = 0;
    private int range6 = 0;
    private int rangerNulo = 0;
    private int todosRanger = 0;
    private int ponto = 0;
    private int semPontos = 0;
    private int todosPontos = 0;
    private double percentualAcertos = 0;
    private double percentualErros = 0;
    private double percentualRange4 = 0;
    private double percentualRange6 = 0;
    private double percentoRangerNulo = 0;
    private double percentualPonto = 0;
    private double percentualSemPontos = 0;
    
    public DadosOcorrencia() {
    }
    
    ;

    public DadosOcorrencia(String nome, int hora, int quantidade, int acertos, int erros, int range4, int range6, int rangerNulo, int todosRanger, int ponto, int semPontos,int todosPontos, double percentualAcertos, double percentualErros, double percentualRange4, double percentualRange6, double percentoRangerNulo, double percentualPonto, double percentualSemPontos) {
        this.setNome(nome);
        this.setHora(hora);
        this.setQuantidade(quantidade);
        this.setAcertos(acertos);
        this.setErros(erros);
        this.setRange4(range4);
        this.setRange6(range6);
        this.setRangerNulo(rangerNulo);
        this.setTodosRanger(todosRanger);
        this.setPonto(ponto);
        this.setSemPontos(semPontos);
        this.setTodosPontos(todosPontos);
        this.setPercentualAcertos(percentualAcertos);
        this.setPercentualErros(percentualErros);
        this.setPercentualRange4(percentualRange4);
        this.setPercentualRange6(percentualRange6);
        this.setPercentoRangerNulo(percentoRangerNulo);
        this.setPercentualPonto(percentualPonto);
        this.setPercentualSemPontos(percentualSemPontos);
    }
    
    public String getNome() {
        return nome;
    }
    
    public Integer getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getAcertos() {
        return acertos;
    }
    
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    
    public int getErros() {
        return erros;
    }
    
    public void setErros(int erros) {
        this.erros = erros;
    }
    
    public int getRange4() {
        return range4;
    }
    
    public void setRange4(int range4) {
        this.range4 = range4;
    }
    
    public int getRange6() {
        return range6;
    }
    
    public void setRange6(int range6) {
        this.range6 = range6;
    }
    
    public int getRangerNulo() {
        return rangerNulo;
    }
    
    public void setRangerNulo(int rangerNulo) {
        this.rangerNulo = rangerNulo;
    }
    
    public int getTodosRanger() {
        return todosRanger;
    }
    
    public void setTodosRanger(int todosRanger) {
        this.todosRanger = todosRanger;
    }
    
    public int getPonto() {
        return ponto;
    }
    
    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
    
    public int getSemPontos() {
        return semPontos;
    }
    
    public void setSemPontos(int semPontos) {
        this.semPontos = semPontos;
    }
    
    public int getTodosPontos() {
        return todosPontos;
    }
    
    public void setTodosPontos(int todosPontos) {
        this.todosPontos = todosPontos;
    }
    
    public double getPercentualAcertos() {
        return percentualAcertos;
    }
    
    public void setPercentualAcertos(double percentualAcertos) {
        this.percentualAcertos = percentualAcertos;
    }
    
    public double getPercentualErros() {
        return percentualErros;
    }
    
    public void setPercentualErros(double percentualErros) {
        this.percentualErros = percentualErros;
    }
    
    public double getPercentualRange4() {
        return percentualRange4;
    }
    
    public void setPercentualRange4(double percentualRange4) {
        this.percentualRange4 = percentualRange4;
    }
    
    public double getPercentualRange6() {
        return percentualRange6;
    }
    
    public void setPercentualRange6(double percentualRange6) {
        this.percentualRange6 = percentualRange6;
    }

    public double getPercentoRangerNulo() {
        return percentoRangerNulo;
    }

    public void setPercentoRangerNulo(double percentoRangerNulo) {
        this.percentoRangerNulo = percentoRangerNulo;
    }
    
    
    public double getPercentualPonto() {
        return percentualPonto;
    }
    
    public void setPercentualPonto(double percentualPonto) {
        this.percentualPonto = percentualPonto;
    }
    
    public double getPercentualSemPontos() {
        return percentualSemPontos;
    }
    
    public void setPercentualSemPontos(double percentualSemPontos) {
        this.percentualSemPontos = percentualSemPontos;
    }
    
    
    //TODO adicionar todosRanger, rangerNulo e percentual ranger!!***
    @Override
    public String toString() {
        return "nome: " + this.getNome() + "\n" + "hora:" + this.getHora() + "\n" + "quantidade: " + this.getQuantidade() + "\n" + "acertos: " + this.getAcertos() + "\n" + "erros: " + this.getErros() + "\n" + "range4: " + this.getRange4() + "\n" + "range6: " + this.getRange6() + "\n"+ "Sem ranger: " + this.getRangerNulo() + "\n" + "todos ranger: " +this.getTodosRanger()+ "\n" + "ponto: " + this.getPonto() + "\n" + "Sem pontos: " + this.getSemPontos() + "\n" + "todo pontos: " + this.getTodosPontos() + "\n" + "percentual de acertos: " + this.getPercentualAcertos() + "\n" + "percentual de erros: " + this.getPercentualErros() + "\n" + "percentual de Range4: " + this.getPercentualRange4() + "\n" + "percentual de Range6: " + this.getPercentualRange6() + "\n" + "percentual nulo: " +this.getPercentoRangerNulo() + "\n" + "percentual de Pontos: " + this.getPercentualPonto() + "\n" + "percentual de ocôrrencias sem pontos: " + this.getPercentualSemPontos() + "\n";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 7
 */
public class PessoaParaStream {
    private String nome;
    private int idade;
    private boolean verdadeiro = false;
    

    public PessoaParaStream(String nome, int idade, boolean verdadeiro) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setVerdadeiro(verdadeiro);
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVerdadeiro() {
        return verdadeiro;
    }

    public void setVerdadeiro(boolean verdadeiro) {
        this.verdadeiro = verdadeiro;
    }
    
    
    
}

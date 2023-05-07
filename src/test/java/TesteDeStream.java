
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 7
 */
public class TesteDeStream {

    public static void main(String[] args){
    PessoaParaStream ivi = new PessoaParaStream("bob", 20, true);
    PessoaParaStream wm = new PessoaParaStream("tina", 5, false);
    PessoaParaStream ixi = new PessoaParaStream("rock", 45, false);
    Consumer<PessoaParaStream> mostrando =  p -> System.out.println(p.getNome());
    Predicate<PessoaParaStream> verificando = p -> p.isVerdadeiro() == true;
    Predicate<PessoaParaStream> age = p -> p.getIdade() > 5;
    
 ArrayList<PessoaParaStream> testando = new ArrayList<>();
 
 testando.add(wm);
 testando.add(ivi);
 testando.add(ixi);
 
 
 testando.stream()
        .filter(verificando)
         .filter(age)
         .forEach(mostrando);
 
    }
 
}

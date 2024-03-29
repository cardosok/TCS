/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoJava;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class Carro extends Automovel {
       
    private static final String tipoCombutivel = "Gasolina,Alcool";
    private static final Double capacidadeMaxima = 30D;
    Double quantidadeCombustivelAtual;
    
       
    public Carro() {
        super(4,tipoCombutivel,capacidadeMaxima);        
        quantidadeCombustivelAtual = 0D;
    }
    
    @Override
    public void TrocarPneu() {
        System.out.println("Digite a quantidade a abastecer");
        Scanner quantidadePneus = new Scanner(System.in);
        String scan = quantidadePneus.next();
        if(!isStatusMotor()){
            if(Double.parseDouble(scan.toString()) > 4){
                System.out.println("Voce não pode trocar essa quantidade de pneus");
            }else{
                System.out.println("Foram trocados "+ scan + "pneus!!!");
            }
        }else{
            System.out.println("Não pode trocar pneu com o veiculo ligado");
        }
    }

    @Override
    public void Acelerar() {
        if(isStatusMotor()){
            if(quantidadeCombustivelAtual <= 0){
                System.out.println("Seu tanque esta Vazio Abasteça para poder rodar");
            }else{
                System.out.println("Acelerando");
                quantidadeCombustivelAtual -= 5;    
            }
        }else{
            System.out.println("O carro precisa estar ligado para acelerar");
        }
    }

    @Override
    public void Abastecer() {
        System.out.println("Digite a quantidade a abastecer");
        Scanner quantidade = new Scanner(System.in);
        String scan = quantidade.next();
        Double quantidadeCombustivel = Double.parseDouble(scan);
        
//        System.out.println("Digite o tipo de Combustivel");
//        System.out.println("Gasolina");
//        System.out.println("Disel");
//        System.out.println("Alcool");
//        Scanner tipo = new Scanner(System.in);
        Double preco = 5D;
        Double total = quantidadeCombustivel + quantidadeCombustivelAtual;
        if(!isStatusMotor()){
            if(total >= capacidadeMaxima){
                System.out.println("O tanque ja esta cheio");
            }else{
                Double valorAbastecido = preco * Double.parseDouble(quantidadeCombustivel.toString()); 
                quantidadeCombustivelAtual = quantidadeCombustivelAtual + total;        
                System.out.println("O valor gasto do combustivel foi: "+ valorAbastecido);
            }
        }else{
            System.out.println("Não podemos abastecer com ele ligado");
        }
    }
    
      
}

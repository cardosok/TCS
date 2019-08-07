/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoJava;

/**
 *
 * @author senai
 */
public class Carro extends Automovel implements Caracteristicas{
       
    private static final Double CapacidadeMaxima = 30D;
    private static final String tipoCombutivel = "Gasolina,Alcool";
    private static final int quantidadePneus = 4;
    
       
    public Carro() {
    }

    public Carro(int rodas, Double combustivel, boolean statusMotor, String tipoCombustivel, Double preco, Double capacidadeTanque) {
        super(rodas, combustivel, statusMotor, tipoCombustivel, preco, capacidadeTanque);
    }
      
}

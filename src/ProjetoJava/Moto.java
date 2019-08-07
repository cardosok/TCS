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
public class Moto extends Automovel implements Caracteristicas{
    
    @Override
    public Double GastarGasolina() {return 0D;}

    @Override
    public Double Abastecer() {return 0D;}

    @Override
    public Double Acelerar() {return 0D;}

    @Override
    public void Ligar() {}

    @Override
    public void Desligar() {}

    @Override
    public void TrocarPneu() {}
    
}

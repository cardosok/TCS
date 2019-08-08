package ProjetoJava;

import java.util.Scanner;

/**
 * @author César Augusto da Silva Cardoso
 */
public abstract class Automovel implements Caracteristicas{
    private int rodas;
    private Double combustivel;
    private boolean statusMotor;
    private String tipoCombustivel;
    private Double capacidadeTanque;

    
    public Automovel(int rodas,String tipoCombustivel,Double capacidadeMaxima) {
        this.rodas = rodas;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadeTanque = capacidadeMaxima;
        this.combustivel = 0D ;
        this.statusMotor = false;
    }
    
    @Override
    public void Abastecer(){
        System.out.println("Digite a quantidade a abastecer");
        Scanner quantidadeCombustivel = new Scanner(System.in);
        System.out.println("Digite o tipo de Combustivel");
        System.out.println("Gasolina");
        System.out.println("Disel");
        System.out.println("Alcool");
        Scanner tipo = new Scanner(System.in);
        
        Double preco = 1D;
        Double total = Double.parseDouble(quantidadeCombustivel.toString()) + combustivel;
        if(total >= capacidadeTanque){
            System.out.println("O tanque ja esta cheio");
        }else{
            Double valorAbastecido = preco * Double.parseDouble(quantidadeCombustivel.toString()); 
            combustivel = combustivel + total;        
            System.out.println("O valor gasto do combustivel foi: "+ valorAbastecido);
        }
    }

    @Override
    public void Acelerar() {
        if(capacidadeTanque <= 0){
            System.out.println("Seu tanque esta Vazio Abasteça para poder rodar");
        }else{
            System.out.println("Acelerando");
            combustivel -= 10;    
        }
    }

    @Override
    public void Ligar() {
        if(isStatusMotor()== true){
            System.out.println("O Carro ja esta ligado");   
        }else{
            System.out.println("Ligando!!");
            setStatusMotor(true);
        }
    }

    @Override
    public void Desligar() {
       if(isStatusMotor()== false){
           if(combustivel <= 0){
            System.out.println("O Carro ja esta desligado");      
           }
        }else{
            System.out.println("Desligando!!");
            setStatusMotor(false);
        }
    }

    @Override
    public void TrocarPneu() {
        System.out.println("Voce esta trocando Pneus!!!");
    }

    @Override
    public void frear() {
            System.out.println("Freiando!!!");
    }
    
        
  
    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public Double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isStatusMotor() {
        return statusMotor;
    }

    public void setStatusMotor(boolean statusMotor) {
        this.statusMotor = statusMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    
}


package ProjetoJava;

/**
 * @author César Augusto da Silva Cardoso
 */
public abstract class Automovel implements Caracteristicas{
    private int rodas;
    private Double combustivel;
    private boolean statusMotor;
    private String tipoCombustivel;
    private Double preco;
    private Double capacidadeTanque;

    
    public Automovel() {
    }

    public Automovel(int rodas, Double combustivel, boolean statusMotor, String tipoCombustivel, Double preco, Double capacidadeTanque) {
        this.rodas = rodas;
        this.combustivel = combustivel;
        this.statusMotor = statusMotor;
        this.tipoCombustivel = tipoCombustivel;
        this.preco = preco;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    @Override
    public void Abastecer(Double quantidadeCombustivel, String tipoCombustivel) {
        Double total = quantidadeCombustivel + combustivel;
        if(total >= capacidadeTanque){
            System.out.println("O tanque ja esta cheio");
        }else{
            Double valorAbastecido = preco * quantidadeCombustivel; 
            combustivel = combustivel + total;
            
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
    public void TrocarPneu(int quantidadePneus) {
        System.out.println("Voce esta trocando "+quantidadePneus+" Pneus!!!");
    }
    
    
    

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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

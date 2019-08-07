
package ProjetoJava;

/**
 * @author César Augusto da Silva Cardoso
 */
public abstract class Automovel {
    private int rodas;
    private Double tanque;
    private boolean statusMotor;
    private String tipoCombustivel;
    private Double preco;

    public Automovel() {
    }

    public Automovel(int rodas, Double tanque, boolean statusMotor, String tipoCombustivel, Double preco) {
        this.rodas = rodas;
        this.tanque = tanque;
        this.statusMotor = statusMotor;
        this.tipoCombustivel = tipoCombustivel;
        this.preco = preco;
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

    public Double getTanque() {
        return tanque;
    }

    public void setTanque(Double tanque) {
        this.tanque = tanque;
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
    
    
    
    
}

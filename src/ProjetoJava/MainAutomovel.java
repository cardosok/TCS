
package ProjetoJava;

import java.util.Scanner;
/**
 * @author César Augusto da Silva Cardoso
 */
public class MainAutomovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        int menu = -1;
        int car = -1; 
        int cami = -1; 
        int mot = -1; 
        while (menu != 0) {
            System.out.println("/-----------------------------------------------/");
            System.out.println("Digite o tipo de Veiculo:");
            System.out.println("1 - Carro");
            System.out.println("2 - Caminhão");
            System.out.println("3 - Moto");
            System.out.println("0 - Sair");
            System.out.println("/-----------------------------------------------/");
            Scanner scanner = new Scanner(System.in);
            
            switch(scanner.next().toString()){
                case "1":
                    Automovel carro = new Carro();
                    while (car != 0) {                        
                        System.out.println("/-----------------------------------------------/");
                        System.out.println("O que dejesa fazer");
                        System.out.println("1 - Acelerar");
                        System.out.println("2 - Abastecer");
                        System.out.println("3 - Trocar Pneu");
                        System.out.println("4 - Ligar");
                        System.out.println("5 - Desligar");
                        System.out.println("0 - Sair");
                        System.out.println("/-----------------------------------------------/");

                        Scanner scanCar = new Scanner(System.in);

                        switch(scanCar.next()){
                            case "1":
                                carro.Acelerar();
                                break;
                            case "2":
                                carro.Abastecer();
                                break;
                            case "3":
                                carro.TrocarPneu();
                                break;
                            case "4":
                                carro.Ligar();
                                break;
                            case "5":
                                carro.Desligar();
                                break;
                            case "0":
                                car = 0;
                                break;
                        }

                    }
                    break;
                case "2":
                    Automovel caminhao = new Caminhao();
                    while (cami != 0) {                        
                        System.out.println("/-----------------------------------------------/");
                        System.out.println("O que dejesa fazer");
                        System.out.println("1 - Acelerar");
                        System.out.println("2 - Abastecer");
                        System.out.println("3 - Trocar Pneu");
                        System.out.println("4 - Ligar");
                        System.out.println("5 - Desligar");
                        System.out.println("0 - Sair");
                        System.out.println("/-----------------------------------------------/");

                        Scanner scanCar = new Scanner(System.in);

                        switch(scanCar.next()){
                            case "1":
                                caminhao.Acelerar();
                                break;
                            case "2":
                                caminhao.Abastecer();
                                break;
                            case "3":
                                caminhao.TrocarPneu();
                                break;
                            case "4":
                                caminhao.Ligar();
                                break;
                            case "5":
                                caminhao.Desligar();
                                break;
                            case "0":
                                cami = 0;
                                break;
                        }

                    }
                    break;
                case "3":
                    Automovel moto = new Moto();
                    while (mot != 0) {                        
                        System.out.println("/-----------------------------------------------/");
                        System.out.println("O que dejesa fazer");
                        System.out.println("1 - Acelerar");
                        System.out.println("2 - Abastecer");
                        System.out.println("3 - Trocar Pneu");
                        System.out.println("4 - Ligar");
                        System.out.println("5 - Desligar");
                        System.out.println("0 - Sair");
                        System.out.println("/-----------------------------------------------/");

                        Scanner scanCar = new Scanner(System.in);

                        switch(scanCar.next()){
                            case "1":
                                moto.Acelerar();
                                break;
                            case "2":
                                moto.Abastecer();
                                break;
                            case "3":
                                moto.TrocarPneu();
                                break;
                            case "4":
                                moto.Ligar();
                                break;
                            case "5":
                                moto.Desligar();
                                break;
                            case "0":
                                mot = 0;
                                break;
                        }

                    }
                    break;
                case "0":
                    menu =0;
                    break;
            }
            
        }
                
    }
    
}

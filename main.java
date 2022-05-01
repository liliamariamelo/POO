package Carro;
import java.util.Scanner;
//classe principal
public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a velocidade: ");
        Scanner vel = new Scanner(System.in);
        int velo = vel.nextInt();
        Carro car = new Carro("Palio", 1000);
        car.acelerar(velo); 
        car.frear();
    }
}


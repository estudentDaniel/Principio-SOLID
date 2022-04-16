package Fabrica_de_veiculos;
import java.util.Scanner;

public class Moto implements Fabrica{

    @Override
    public Product criarAutomoveis() {
        System.out.println("Escolha a Marca da sua moto");
        System.out.println("1)Honda 2)Yamaha");
        Scanner scan = new Scanner(System.in);

        int entrada = scan.nextInt();
        switch(entrada) {
            case 1:
            return new Honda();
        }
        return new Yamaha();
    }
}

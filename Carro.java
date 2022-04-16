package Fabrica_de_veiculos;

import java.util.Scanner;

class Carro implements Fabrica{

    @Override
    public Product criarAutomoveis() {
        System.out.println("Escolha a Marca do seu Carro");
        System.out.println("1)Bmw 2)Volkswagem");
        Scanner scan = new Scanner(System.in);

        int entrada = scan.nextInt();
        switch(entrada) {
            case 1:
            return new Bmw();
        }
        return new Volkswagem();
    }
    
}

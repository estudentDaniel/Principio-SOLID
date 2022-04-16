package Fabrica_de_veiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Opções p/ escolha de Veiculos");
        
        Scanner scan = new Scanner(System.in);
       
        boolean condicao = true;
        while(condicao){
            System.out.println("1) Carro");
            System.out.println("2) Moto");
            System.out.println("0) sair");
            int i = scan.nextInt();
        switch(i){
            case 1:
            Fabrica carro =new  Carro();
            Product c = carro.criarAutomoveis();
            c.exibirProduto();
            break;
            case 2:
            Fabrica moto = new Moto();
            Product m = moto.criarAutomoveis();
            m.exibirProduto();
            break;
            case 0:
            condicao = false;
            System.out.println("Voce saiu do sistema...!");
            condicao = false;
            break;
           }
        }
        scan.close();
    }
    
}

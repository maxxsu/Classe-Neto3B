import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Classe automovel");
        System.out.println("O automovel é : Ferrari");
        System.out.println("Escolha uma função");
        System.out.println("1 - Atributos");
        System.out.println("2 - Métodos");

        int opcao = input.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Caracteristicas");
                System.out.println("Ano - 2020");
                System.out.println("Cor - Vermelha ");
                System.out.println("Modelo - 296 GTB");
                break;
            case 2:
                System.out.println("Escolha uma função para o veiculo operar");
                System.out.println("1 - Acelerar");
                System.out.println("2 - Freiar");
                System.out.println("3 - Buzinar");

                int metodos = input.nextInt();
                switch(metodos) {
                    case 1:
                        System.out.println("***************************");
                        System.out.println("O veiculo acelerou!");
                        System.out.println("***************************");
                        break;
                    case 2:
                        System.out.println("****************************");
                        System.out.println("O veiculo está desacelerando!");
                        System.out.println("****************************");
                        break;
                    case 3:
                        System.out.println("***************************");
                        System.out.println("O veiculo buzinou! BEP BEP");
                        System.out.println("***************************");
                        break;
                }
        }
    }
}

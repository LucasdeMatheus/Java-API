package br.com.alura.src.Senha;

import java.util.Scanner;

public class Senha {
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static void main(String[] args) {
        String mensagem = """
                ....................................................................................................................................
                ....______________________..........................................................................................................
                ....|    _________________|...__________________....____.................___...____.............____...._________________________...
                ....|   |....................|                  |..|....\\..............|   |..|   |...........|   |....|    _______________    |...
                ....|   |....................|     _____________|..|.....\\.............|   |..|   |...........|   |....|   |               |   |...
                ....|   |....................|    |................|   |...\\...........|   |..|   |...........|   |....|   |               |   |...
                ....|   |__________________..|    |_____________...|   |.....\\.........|   |..|   |___________|   |....|   |_______________|   |...
                ....|__________________    |.|     _____________|..|   |.......\\.......|   |..|    ___________    |....|    _______________    |...
                ......................|    |.|    |................|   |.........\\.....|   |..|   |...........|   |....|   |...............|   |...
                ......................|    |.|    |______________..|   |...........\\...|   |..|   |...........|   |....|   |...............|   |...
                ....__________________|    |.|                  |..|   |.............\\     |..|   |...........|   |....|   |...............|   |...
                ...|_______________________| |__________________|..|___|...............\\___|..|___|...........|___|....|___|...............|___|...
                ....................................................................................................................................
                """;
        int intervalo = 10; // Intervalo de 100 milissegundos entre cada caractere


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        String senha = sc.nextLine();
        System.out.println("\nVamos ver se você lembra da sua senha? Digite novamente: ");
        String senha2 = sc.nextLine();
        if (senha.equals(senha2)) {
            System.out.println("Senha correta!");
        }else{
            for (int i = 0; i < mensagem.length(); i++) {
                System.out.print(mensagem.charAt(i)); // Imprime o caractere atual
                try {
                    Thread.sleep(intervalo); // Pausa por um intervalo de tempo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                };
            }
            System.out.println("errada!");
        }
    }
}

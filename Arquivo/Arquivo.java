package br.com.alura.src.Arquivo;

import java.io.File;
import java.io.FileWriter;

public class Arquivo {
    //
    public static void main(String[] args) {

        try {
            File diretorio = new File("C:\\Users\\ffgus\\Desktop\\api\\Arquivo");
            File arquivo = new File(diretorio, "arquivo.txt");
            FileWriter escrita = new FileWriter(arquivo);

            escrita.write( "Conteúdo a ser gravado no arquivo.");
            escrita.close();
        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }
}

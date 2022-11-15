import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo {

  public static void lerTexto(String nomeArquivo){
    try {
      File arquivo = new File(nomeArquivo);
      Scanner sc = new Scanner(arquivo);
      while(sc.hasNext()){
        System.out.print(sc.nextLine());
      }

      sc.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {
    lerTexto("Aprendendo_mais_sobre_java.txt"); //trocar pelo caminho do arquivo desejado.
  }
}
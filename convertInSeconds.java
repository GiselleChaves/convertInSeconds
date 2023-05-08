import java.util.Scanner;

public class convertInSeconds {
  /**
   * 4. Crie um programa que lê o tempo atual em hora, minuto e segundo, e o escreve em segundos 
   * quanto tempo se passou desde que o dia começou. Essa conversão deve ser calculada por um 
   * método.
   */
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int hours, minuts, seconds, hoursInSeconds;

    System.out.println("Informe o tempo atual com hora,minutos e segundas separadamente:");
    hours = in.nextInt();
    minuts = in.nextInt();
    seconds = in.nextInt();

    hoursInSeconds = convertInSeconds(hours, minuts, seconds);
    System.out.printf("O tempo atual convertido em segundos é: %d.", hoursInSeconds);
    System.out.println();
    System.out.printf("\n.::Fim da Execução::.");
    in.close();
  }
  /*
   * Method return the actual time(hours,minuts and seconds) in seconds.
   */
  public static int convertInSeconds(int n1,int n2, int n3){
    return ((n1 * 60) + (n2 * 60) + n3);
  }
}

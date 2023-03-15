//Escreva um programa que inverta os caracteres de um string.
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class MetodoInverter {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        String adicionar;
        System.out.printf("Entrada: " );
        adicionar = ler.nextLine();
        
        System.out.println();
        
        System.out.printf("Entrada: %s\n",adicionar);
        System.out.printf("Saida:   %s\n", inverter(adicionar));
    }
public static String inverter(String s){
    int i, n;
    String saida;
    n = s.length();
      
    saida = "";
    
    for(i=(n-1); i>=0; i--){
        saida = saida + s.charAt(i);
        
    }
    
    return(saida);
    }
}


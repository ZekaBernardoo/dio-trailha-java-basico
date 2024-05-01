/*
O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
com estes dois números você deverá obter a quantidade de interações (for) e
realizar a impressão no console (System.out.print) dos números incrementados
*/
package controle_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//import da classe Scanner
        
        System.out.println("Digite o primeiro paramentro: "); //entrada de dados
        int value01 = scan.nextInt();
        System.out.println("Digite o segundo paramentro: ");
        int value02 = scan.nextInt();
        
        // tratando da exceção
        try{
            contadoValores(value01, value02);
            
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
     }
        
}
    
    static void contadoValores(int valueOne, int valueTwo)throws ParametrosInvalidosException{
        if( valueOne >= valueTwo){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            
        }
        
        int resuladoValores = valueTwo - valueOne;
        
        for(int indice=0; indice <= resuladoValores; indice++){
            System.out.println(" indice: " + (indice+1) + " valor: " + resuladoValores);
        }

    }
        
    
}   


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordolarreal;
import java.util.Scanner;

public class ConversorDolarReal {

    
    public static void main(String[] args) {
        double quantDolar, quantReal, cotacaoDolar;
        int opcao;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se voce quer converter de Real para Dolar, digite 1."
                + " Se voce quer converter de Dolar para Real, digite 2:");
        opcao = teclado.nextInt();
        
        System.out.println("Qual a cotaçao do Dolar hoje?");
        cotacaoDolar = teclado.nextDouble();
        
        if(opcao == 1){
            System.out.println("Digite quantos reais deseja converter:");
            quantReal = teclado.nextDouble();
            quantDolar = quantReal / cotacaoDolar;
            System.out.println(quantReal+" em Reais equivale a: "+quantDolar
                    +" em Dolares.");
        }else if(opcao == 2){
            System.out.println("Digite quantos dolares deseja converter:");
            quantDolar = teclado.nextDouble();
            quantReal = quantDolar * cotacaoDolar;
            System.out.println(quantDolar+" em Dolares equivale a: "+quantReal
                    +" em Reais.");
        }else{
            System.out.println("Opçao invalida! Tente novamente.");
        }
        
        
        
    }
    
}

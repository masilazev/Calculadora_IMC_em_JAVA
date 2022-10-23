import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        //Entradas
        Scanner sc = new Scanner (System.in);
        double altura = sc.nextDouble();
        double peso = sc.nextDouble();
        sc.close();

        //Processamento
        double imc = peso / Math.pow(altura, 2);
        String diagnostico = retornaDiagnostico(imc);

        //Saida
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + imc);
        System.out.println("Diagnostico: " + diagnostico);

    }

    private static String retornaDiagnostico(double imc) {
        String retorno = "";

        if (imc < 18.5){
            retorno = "MAGRO";
            }
            else if ((imc >= 18.5) && (imc < 25)){
                retorno = "NORMAL";
        }
        else if ((imc >= 25) && (imc <30)){
            retorno = "SOBREPESO";
        } 
        else if ((imc >= 30) && (imc < 40)){
            retorno = "OBESO";
        }
        else {
            retorno = "OBESIDADE GRAVE";
    }
    return  retorno;
    }
}
Detalhespackage imc;
import java.util.Scanner;

// * @author Vincy

public class IMC {

    public static void main(String[] args) {
         
         double peso;
         double altura;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Informe o seu peso!");
        peso = leia.nextDouble();
        System.out.println("Informe a sua altura!");
        altura = leia.nextDouble();
        
        double IMC;
        IMC = peso /(altura*altura);
        
        if(IMC < 16){
            System.out.println("Magreza grave");
        }else if (IMC >= 16 && IMC <= 17){
            System.out.println("Magreza moderada");
        }else if (IMC >= 17 && IMC <= 18.5){
            System.out.println("Magreza leve");   
        }else if (IMC >= 18.5 && IMC <= 25){
            System.out.println("Saudável");
        }else if (IMC >= 25 && IMC <= 30){
            System.out.println("Sobrepeso");
        }else if (IMC >= 30 && IMC <= 35){
            System.out.println("Obesidade Grau I");
        }else if (IMC >= 35 && IMC <= 40){
            System.out.println("Obesidade Grau II (severa)");
        }else {
            System.out.println("Obesidade Grau III (mórbida)");}
         
        System.out.println("O seu IMC é: " + IMC);
    
            
        }
    }
    


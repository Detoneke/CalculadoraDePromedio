import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Hola, ¿podrías decirme tú nombre?");
        String nombre = tec.nextLine();
        System.out.printf("Hola %s, ahora dime tus notas de Mátematicas.\n", nombre);
        double matematicas = tec.nextDouble();
        System.out.printf("Tus notas de matematicas son %s, ahora dime las de biologia\n", matematicas);
        double biologia = tec.nextDouble();
        System.out.printf("Tus notas de biologia son %s, ahora dime las de ingles\n", biologia);
        double ingles = tec.nextDouble();
        System.out.printf("Tus notas de inglés son %s, calculando promedio.\n", ingles);
        double promedio = (matematicas + biologia + ingles) / 3;
        System.out.printf("Tu promedio es %s.\n", promedio);

        if (promedio >= 4.5){
            System.out.println("Tienes un buen promedio, pasaste de curso.");
        }else{
            System.out.println("Tu promedio no es bueno, no pasas de curso.");
        }


    }
}

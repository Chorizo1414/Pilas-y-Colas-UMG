package pilas.y.colas.umg;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class PilasYColasUMG {

            
        private static void Generar() {
            // Generar un millón de números aleatorios y mostrarlos
            for (int i = 0; i < 1000000; i++) {
                int randomNum = ThreadLocalRandom.current().nextInt(-10000000, 10000001);
                System.out.print(randomNum + " ");
            }//cierra for
        
            System.out.println();
            
        }//cierra generar
        
        
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 3) {
        System.out.println("\n\nSeleccione una opcion:");
        System.out.println("1. Generar numeros con pila");
        System.out.println("2. Generar numeros con cola");
        System.out.println("3. Salir");
        
        opcion = sc.nextInt();
        
        
         switch(opcion) {
            case 1:
                System.out.println("\nSelecciono Generar Numeros con pila");
                Generar();
                
                Stack<Integer> stack = new Stack<>();

                
                for (int i = 0; i < 1000000; i++) {
                    int randomNum = ThreadLocalRandom.current().nextInt(-10000000, 10000001);
                    stack.push(randomNum);

                }//cierra for

            
                //Muestra los numeros en la pila
                while (!stack.empty()) {
                    System.out.print("\n");
                    int num = stack.pop();
                    System.out.print(num + " ");
                    System.out.print("\n");
                }//cierra while
                break;
                
                
                
            case 2:
                System.out.println("\nSelecciono generear numeros con cola");
                Generar();
                
               
                Queue<Integer> queue = new LinkedList<>();

            
            
                for (int i = 0; i < 1000000; i++) {
                    int randomNum = ThreadLocalRandom.current().nextInt(-10000000, 10000001);
                    queue.add(randomNum);
                }//cierro for

            
            
                //muestralos numeros en la cola
                while (!queue.isEmpty()) {
                    System.out.print("\n");
                    int num = queue.poll();
                    System.out.print(num + " ");
                    System.out.print("\n");
                }//cierra while
                break;
                
            case 3:
                System.out.println("\nPrograma Finalizado");
                break;
                
            default:
                System.out.println("\nOPCION INVALIDA!!");
                break;
            }//Cierra switch
         
        }//cierra while
        
        
    }
}
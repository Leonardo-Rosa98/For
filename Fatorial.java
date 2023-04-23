public class Fatorial {
    public static void main(String[] args) {
        int num = 5;
        int resultado = 5 * 5;
        System.out.println(num + " * " + num + " = " + resultado);
        
        for (int i = num -1; i >= 1; i--){
            System.out.println(resultado + " * " + i + " = " + resultado * i);
            resultado = resultado * i;
    

        }
    }
}

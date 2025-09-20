public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        System.out.println("Calcular a soma de 2 + 3 =");
        System.out.println(calc.somar(2,3));
        System.out.println("");
        System.out.println("Calcular a soma de 2 + 3 + 4 =");
        System.out.println(calc.somar(2,3,4));
        System.out.println("");
        System.out.println("Calcular a soma de 2.5 + 3.7 =");
        System.out.println(calc.somar(2.5,3.7));
        System.out.println("");
        System.out.println("Calcular a subtração de 3.4 + 4 =");
        System.out.println(calc.subtrair(3.4,4));
        System.out.println("");
        System.out.println("Calcular a soma de 1 + 2 =");
        System.out.println(Calc.soma(1,2));

    }
}

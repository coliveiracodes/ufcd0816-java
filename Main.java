import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        System.out.println("______________________________________________");
        System.out.println("_____________________Media____________________");
        System.out.println("______________________________________________");
        //Arraylist com as notas dos alunos
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(15.5);
        notas.add(18.0);
        notas.add(20.0);
        notas.add(19.80);
        notas.add(19.90);
        //Soma das notas a usar loop for-each
        int quantnotas = notas.toArray().length; //Para saber o tamanho do Array
        double soma = 0;
        for (int i = 0; i < quantnotas; i++){
            soma += notas.get(i);
        }
        //Cálculo da Média
        double media = 0;
        media = soma / quantnotas;
        System.out.println("A média das notas dos alunos é: " + media);


        //Classificação das notas dos alunos
        if (media < 5) {
            System.out.println("A média da turma é insuficiente.");
        } else {
            if (media >= 5) {
                System.out.println("A média da turma é regular.");
            } else {
                if (media >= 7) {
                    System.out.println("A média da turma é muito boa");
                } else {
                    if (media >= 9) {
                        System.out.println("A média da turma é excelente.");
                    }
                }
            }
        }
    }
}
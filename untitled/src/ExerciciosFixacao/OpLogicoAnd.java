package ExerciciosFixacao;

public class OpLogicoAnd {
    public static void main(String[] args) {
      double notaFinal = 8.5;
      double frequencia = 80.0;

      if (notaFinal >= 7.0 && frequencia >= 75.0) {
          System.out.println("Aprovado");
      }else{
          System.out.println("Reprovado");
      }
    }
}

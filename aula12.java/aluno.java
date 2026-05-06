public class aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;
    double notaTrabalho;  

public aluno(String nome, int matricula, double nota1, double nota2, double notaTrabalho){
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.notaTrabalho = notaTrabalho;
}
public double calcularMedia(){
    return (nota1+nota2+notaTrabalho)/3;
}
public void verificarSituação(){
    double media = calcularMedia();

    if(media>=7){
        System.out.printf(nome + "APROVADO, com média: %.2f", media);

    }else {
        System.out.printf(nome+ "REPROVADO, com Média: %.2f", media);
    }
  }
}



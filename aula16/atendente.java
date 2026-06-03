public class atendente extends funcionario {
    private double comissao;
    public atendente(String nome, String cpf, double salario, int dataNascimento, double comissao){
        super("Mariana", "123451143", 2000.00, 2000);
        this.comissao= comissao;
    }

    public double getSalario(){
        return super.getSalario()+comissao;
    }

        public double getComissao(){
            return comissao;
    }
    
    public void setComissao(double comissao){
        this.comissao=comissao;
    }
}

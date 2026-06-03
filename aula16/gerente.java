public class gerente extends funcionario {
    private String setor;
    public gerente(String nome, String cpf, double salario, int dataNascimento, String setor ){
        super("Mario", "123456789", 5000.00, 1990);
        this.setor=setor;
    }
    public double getSalario(){
        return super.getSalario()+2000.00;
    }
}

public class Funcionario extends Pessoa {
    private int idFuncionario;
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nomeGer, String departamento, double salarioGerente, double comissao) {
        super(nomeGer,departamento,salarioGerente,comissao);
    }

    public Funcionario(String nomeFun, String departamento, double salarioFuncionario, double totalEmVendas, double comissao) {
        super(nomeFun,departamento,salarioFuncionario,totalEmVendas,comissao);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario(double valorEmVendas) {
        return salario = valorEmVendas * 0.10;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
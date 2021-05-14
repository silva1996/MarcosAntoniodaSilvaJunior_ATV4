import java.util.Date;

public class Pessoa {
    private String nome;
    private int idade;
    private Date dataDeNascimento;

    public Pessoa(String nomeGer, String departamento, double salarioGerente, double comissao) {
    }

    public Pessoa(String nomeFun, String departamento, double salarioFuncionario, double totalEmVendas, double comissao) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
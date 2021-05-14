public class Gerente extends Funcionario {
    private String nomeGer;
    private String departamento;
    private double salarioGerente;
    private double comissao;

    public Gerente(String nomeGer, String departamento, double salarioGerente, double comissao) {
        super(nomeGer,departamento,salarioGerente,comissao);
    }


    public String getNomeGer() {
        return nomeGer;
    }

    public void setNomeGer(String nomeGer) {
        this.nomeGer = nomeGer;
    }


    @Override
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioGerente() {
        return salarioGerente;
    }

    public void setSalarioGerente(double salarioGerente) {
        this.salarioGerente = salarioGerente;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = salarioGerente * 0.15;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nomeGer='" + nomeGer + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salarioGerente=" + salarioGerente +
                ", comissao=" + comissao +
                '}';
    }
}
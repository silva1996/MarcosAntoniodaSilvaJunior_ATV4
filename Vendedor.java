public class Vendedor extends Funcionario {
    private String nomeFun;
    private String departamento;
    private String gerenteResponsavel;
    private double salarioFuncionario;
    private double totalEmVendas;
    private double comissao;

    public Vendedor(String nomeFun, String departamento, double salarioFuncionario, double totalEmVendas, double comissao) {
        super(nomeFun,departamento,salarioFuncionario,totalEmVendas,comissao);
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }

    public void setGerenteResponsavel(String gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public double getTotalEmVendas() {
        return totalEmVendas;
    }

    public void setTotalEmVendas(double totalEmVendas) {
        this.totalEmVendas = totalEmVendas;
    }

    @Override
    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = salarioFuncionario * 0.10;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nomeFun='" + nomeFun + '\'' +
                ", departamento='" + departamento + '\'' +
                ", gerenteResponsavel='" + gerenteResponsavel + '\'' +
                ", salarioFuncionario=" + salarioFuncionario +
                ", totalEmVendas=" + totalEmVendas +
                ", comissao=" + comissao +
                '}';
    }
}


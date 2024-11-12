import java.math.BigDecimal;
import java.math.RoundingMode;

class Programador extends Funcionario {
    public Programador(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        BigDecimal aumento = new BigDecimal("1.20");
        BigDecimal novoSalario = getSalario().multiply(aumento);
        setSalario(novoSalario);
    }
}

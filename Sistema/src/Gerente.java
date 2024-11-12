import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario {
    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        BigDecimal aumento = new BigDecimal("1.10");
        BigDecimal novoSalario = getSalario().multiply(aumento);
        setSalario(novoSalario);
    }
}

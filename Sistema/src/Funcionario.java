import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Funcionario {
    private String nome;
    private BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario.setScale(2, RoundingMode.HALF_UP);  // Garantir 2 casas decimais
    }

    // aumentar o salário
    public abstract void aumentaSalario();

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    protected void setSalario(BigDecimal salario) {
        this.salario = salario.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario: R$" + salario;
    }
}


//explicação de alguns conceitos:

// Usamos BigDecimal para garantir que o salário tenha sempre 2 casas decimais.
// O setScale(2) ajusta o valor para 2 casas decimais, e o RoundingMode.HALF_UP
// arredonda para cima se o terceiro número depois da vírgula for 5 ou mais.


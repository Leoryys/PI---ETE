

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {
    double salario;
    int matriculaProf;

    public Professor(double salario, int matriculaProf, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.salario = salario;
        this.matriculaProf = matriculaProf;
    }

    public Professor(double salario, int matriculaProf) {
        this.salario = salario;
        this.matriculaProf = matriculaProf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatriculaProf() {
        return matriculaProf;
    }

    public void setMatriculaProf(int matriculaProf) {
        this.matriculaProf = matriculaProf;
    }
    
    
}

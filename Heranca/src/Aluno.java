
/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    int matricula;

    public Aluno(int matricula, String nome, String cpf, String telefone, String email) {
        super(nome, cpf, telefone, email);
        this.matricula = matricula;
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}

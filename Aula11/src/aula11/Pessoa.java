package aula11;

public abstract class Pessoa {
// Atributos
    protected String nome;
    protected Integer idade;
    protected String sexo;
    
// Metodos Publicos
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

// Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }    
    
}
